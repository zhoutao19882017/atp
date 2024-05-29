package com.bcs.atp.server.config.websocket;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class WebSocketAuthInterceptor implements HandshakeInterceptor {

    /**
     * 返回true允许直接通过，返回false拒绝连接
     *
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @param webSocketHandler
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        log.info("握手开始！");
        // 确保授权正确才能进行websocket连接
        HttpHeaders headers = serverHttpRequest.getHeaders();
        List<String> header = headers.get("token");
        if (headers.get("upgrade").contains("websocket")){
            return true;
        }
        if (header == null || header.size() == 0) {
            return false;
        }

        String token = header.get(0);
        if (StringUtils.isBlank(token)) {
            return false;
        }
        // TODO: token do something
        log.info("握手token:{}", token);
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        log.info("握手结束");
    }
}
