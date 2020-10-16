package com.atits.security.controller;

import com.atits.base.item.SelfUserDetail;
import com.atits.base.security.BaseController;
import com.atits.base.utils.CurrentUserUtil;
import com.atits.security.client.AccountClient;
import com.atits.security.model.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户controller
 *
 * @author zhangys
 * @date 2020-09-08 13:30
 **/
@RestController
public class AccountController extends BaseController implements AccountClient{

    int i = 0;

    @Override
    public String get(@RequestBody UserDto userDto) {
        SelfUserDetail userDetail = CurrentUserUtil.getUserDetail();
        String userCode = CurrentUserUtil.getUserCode();
        System.out.println(userDetail);
        System.out.println(userCode);
        return "####" + 1111111;
    }


}
