package com.atits.security.controller;

import com.atits.security.client.AccountClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 账户controller
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@RestController
@RefreshScope
public class AccountController implements AccountClient {

    @Value(value = "${test}")
    private Integer useLocalCache;

    @Override
    public String get(@RequestParam String test) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return useLocalCache + "####" + test;
    }


}
