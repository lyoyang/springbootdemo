package com.lyoyang.filter;

import org.apache.dubbo.rpc.*;

/**
 * @Auther: yangbing
 * @Date: 2019/6/6 16:16
 * @Description:
 */
public class ParamValidationFilter implements Filter {


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        return null;
    }

    @Override
    public Result onResponse(Result result, Invoker<?> invoker, Invocation invocation) {
        return null;
    }
}
