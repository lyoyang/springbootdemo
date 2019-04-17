package com.lyoyang.httpserver;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Auther: yangbing
 * @Date: 2019/4/17 19:09
 * @Description:
 */
@Component
@Slf4j
@ChannelHandler.Sharable
public class HttpServerHandler extends ChannelInboundHandlerAdapter {
    private static Map<String, ConcurrentHashMapV8.Action> actionMapping = null;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if(msg instanceof FullHttpRequest) {
            FullHttpRequest request = (FullHttpRequest) msg;
            if(HttpUtil.is100ContinueExpected(request)) {
                ctx.write(new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE));
            }
            //封装请求和响应
            HttpRequestWrapper httpRequestWrapper = buildRequestWraper(req);
            //建造netty响应
            DefaultFullHttpResponse defaultFullHttpResponse = new DefaultFullHttpResponse();
        }


    }
}
