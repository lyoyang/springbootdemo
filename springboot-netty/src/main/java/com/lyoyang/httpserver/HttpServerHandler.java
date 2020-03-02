package com.lyoyang.httpserver;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @Auther: yangbing
 * @Date: 2019/4/17 19:09
 * @Description:
 */
@Component
@Slf4j
@ChannelHandler.Sharable
public class HttpServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if(msg instanceof FullHttpRequest) {
            FullHttpRequest request = (FullHttpRequest) msg;
            if(HttpUtil.is100ContinueExpected(request)) {
                ctx.write(new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE));
            }
            //封装请求和响应
            //建造netty响应
//            DefaultFullHttpResponse defaultFullHttpResponse = new DefaultFullHttpResponse();
        }


    }
}
