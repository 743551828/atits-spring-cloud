package com.atits.security.controller;

import com.atits.security.client.AccountClient;
import com.atits.security.model.dto.UserDto;
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

    int i = 0;

    @Override
    public String get(@RequestBody UserDto userDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getDetails();
        System.out.println(i++);
        return "####" + 1111111;
    }


}
