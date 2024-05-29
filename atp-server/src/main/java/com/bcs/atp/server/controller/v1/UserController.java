package com.bcs.atp.server.controller.v1;

import com.bcs.atp.server.model.UserModel;
import com.soulcraft.network.resp.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author zhoutao
 * @date 2024/05/15
 */
@RestController
@Api(tags = {"用户管理"})
@RequestMapping("/graphql")
public class UserController {

    @ApiOperation("当前用户")
    @GetMapping("/me")
    public R<UserModel> me() {
        UserModel userModel = new UserModel();
        userModel.setEmail("zhoutao10518@126.com");
        userModel.setDisplayName("zhoutao");
        return R.success(userModel);
    }

    @ApiOperation("记录用户请求发送")
    @GetMapping("/createUserHistory")
    public String createUserHistory() {
        return "success";
    }
}
