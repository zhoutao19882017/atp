package com.bcs.atp.server.config.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class WebSocketServer extends TextWebSocketHandler {
    /**
     * socket 建立成功事件 @OnOpen
     *
     * @param session
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // websocket入参
        // ===============从url上面获取参数
        String rawPath = session.getUri().getRawPath(); //
        String rawQuery = session.getUri().getRawQuery();//  从url上面获取参数
        String query = session.getUri().getQuery(); //  从url上面获取参数
        // =================

        // ================从header上面获取参数
        HttpHeaders headers = session.getHandshakeHeaders(); // 从header上获取参数
        // ================

        String token = headers.get("token").get(0);
        if (token != null) {
            WebSocketSession s = WebSessionManager.get(token);
            if (s != null) {
                // 当前用户之前已经建立连接，关闭
                WebSessionManager.remove(token);
            }
            // 重新建立session
            WebSessionManager.add(token, session);
            log.error("建立websocket连接：{}", token);
        }

    }

    /**
     * 接收消息事件 @OnMessage
     *
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // 获得客户端传来的消息
        String payload = message.getPayload();
        log.info("server 接收到发送的消息 " + payload);
        // TODO 服务端发送回去
        session.sendMessage(new TextMessage("server 发送消息 " + payload + " " + LocalDateTime.now()));
    }

    /**
     * socket 断开连接时 @OnClose
     *
     * @param session
     * @param status
     * @throws Exception
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        Object token = session.getAttributes().get("token");
        if (token != null) {
            // 用户退出，移除缓存
            WebSessionManager.remove(token.toString());
        }
    }
}

/**
 * websocket的session管理器
 */
class WebSessionManager {
    /**
     * 保存连接 session 的地方
     */
    private static final ConcurrentHashMap<String, WebSocketSession> SESSION_POOL = new ConcurrentHashMap<>();

    /**
     * 添加 session
     *
     * @param key
     */
    public static void add(String key, WebSocketSession session) {
        // 添加 session
        SESSION_POOL.put(key, session);
    }

    /**
     * 删除 session,会返回删除的 session
     *
     * @param key
     * @return
     */
    public static WebSocketSession remove(String key) {
        // 删除 session
        return SESSION_POOL.remove(key);
    }

    /**
     * 删除并同步关闭连接
     *
     * @param key
     */
    public static void removeAndClose(String key) {
        WebSocketSession session = remove(key);
        if (session != null) {
            try {
                // 关闭连接
                session.close();
            } catch (IOException e) {
                // todo: 关闭出现异常处理
                e.printStackTrace();
            }
        }
    }

    /**
     * 获得 session
     *
     * @param key
     * @return
     */
    public static WebSocketSession get(String key) {
        // 获得 session
        return SESSION_POOL.get(key);
    }
}
