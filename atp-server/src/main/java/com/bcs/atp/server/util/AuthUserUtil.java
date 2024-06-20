package com.bcs.atp.server.util;

import com.bcs.atp.server.constant.CommonConstant;
import com.bcs.atp.server.model.UserModel;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.UserService;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.internal.DgsWebMvcRequestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Component
public class AuthUserUtil {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private UserService userService;

    /**
     * 获取当前登录用户信息
     * Spring Boot集成Spring Security和DGS Framework时，SecurityContextHolder在处理GraphQL请求时会存在上下文不一致的问题。这通常是由于请求的处理方式导致的。
     * SecurityContextHolder默认使用的是ThreadLocal策略，意味着认证信息是按线程存储和管理的。如果在处理请求的过程中涉及到线程的切换，那么原始线程的上下文（包括认证信息）可能不会自动传递到新线程。
     * DGS Framework官方说可以考虑使用DelegatingSecurityContextAsyncTaskExecutor来解决问题，这个方案暂时没验证成功
     * 目前考虑由前端在做graphql请求时带上token，由token信息来做验证获取用户信息，这里有与JwtAuthenticationTokenFilter重复处理的问题，作为临时解决方案
     * 后续考虑用redis来实现Spring Session支持，解决这个问题
     * @param dfe
     * @return
     */
    public UserModel getAuthUser(DgsDataFetchingEnvironment dfe){
        // 通过DgsDataFetchingEnvironment入参获取用户信息
        DgsWebMvcRequestData requestData = (DgsWebMvcRequestData) dfe.getDgsContext().getRequestData();
        ServletWebRequest request = (ServletWebRequest) requestData.getWebRequest();
        String authHeader = request.getHeader(tokenHeader);
        if (authHeader == null || !authHeader.startsWith(this.tokenHead)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, CommonConstant.COOKIES_NOT_FOUND);
        }
        String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        log.debug("checking username:{}", username);
        if (username == null || !jwtTokenUtil.validateToken(authToken, username)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unauthorized");
        }
        UserDetails userDetails = (UserDetails) userService.loadUserByUsername(username);
        return userDetails.getUser();
    }
}
