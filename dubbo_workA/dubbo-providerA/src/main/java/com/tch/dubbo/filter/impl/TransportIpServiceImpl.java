package com.tch.dubbo.filter.impl;

import com.tch.dubbo.filter.TransportIpService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName:TransportIpServiceImpl
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/8/17
 * @serviceInterface. TODO 接口名
 * @serviceVersion. 1.0.0
 * @serviceGroup. biz-spc
 */
@Component
@Service
public class TransportIpServiceImpl implements TransportIpService {

    public void transportIp() {
        System.out.println("providerA:" + RpcContext.getContext().getRemoteHost());
    }
}