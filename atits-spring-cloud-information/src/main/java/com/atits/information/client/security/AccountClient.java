package com.atits.information.client.security;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 账户Client
 * @author: zhangys
 * @create: 2020-09-09 10:55
 **/
@FeignClient("atits-spring-cloud-security")
@RequestMapping("/account")
public interface AccountClient {

    /**
     * @param test
     * @return
     */
    @GetMapping("/get")
    String get(@RequestParam String test);

}
