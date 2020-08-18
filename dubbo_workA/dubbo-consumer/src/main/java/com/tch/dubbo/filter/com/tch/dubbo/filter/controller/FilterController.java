package com.tch.dubbo.filter.com.tch.dubbo.filter.controller;

import com.tch.dubbo.filter.TransportIpService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:FilterController
 * @Description: TODO
 * @Auth: tch
 * @Date: 2020/8/18
 */
@RestController(value = "filter/")
public class FilterController {
    @Reference
    private TransportIpService transportIpService;

    @RequestMapping(value = "ip")
    public void transportIp() {
        transportIpService.transportIp();
    }
}