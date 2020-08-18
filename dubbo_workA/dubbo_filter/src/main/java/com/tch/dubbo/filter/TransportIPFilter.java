package com.tch.dubbo.filter;

import org.apache.dubbo.rpc.*;

/**
 * @ClassName:TransportIPFilter
 * @Description: 获取客户端请求IP地址
 * @Auth: tch
 * @Date: 2020/8/17
 */
public class TransportIPFilter implements Filter {
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String clientIp = RpcContext.getContext().getRemoteHost();
        System.out.println("TransportIPFilter===>ip:" + clientIp);
        return invoker.invoke(invocation);
    }
}