package com.atits.security.controller;

import com.atits.security.client.AccountClient;
import com.atits.security.model.entity.UserEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 账户controller
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@RestController
public class AccountController implements AccountClient {

    @Override
    public String get(@RequestBody UserEntity userEntity) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getDetails();
        return "####" + userEntity;
    }


}
