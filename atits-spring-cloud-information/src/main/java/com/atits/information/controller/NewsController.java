package com.atits.information.controller;

import com.atits.information.client.NewsClient;
import com.atits.security.client.AccountClient;
import com.atits.security.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-09-08 16:54
 **/
@RestController
public class NewsController implements NewsClient {

    @Autowired
    AccountClient accountClient;

    @Override
    public String test(){
        UserDto userDto = new UserDto();
        userDto.setLoginUsername("uuu");
        for (int i = 0; i < 100;i++){
            accountClient.get(userDto);
        }
        return "ok";
    }

    @Override
    public String test2(){
        return "Invoke success";
    }


}
