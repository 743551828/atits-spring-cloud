package com.atits.security.controller;

import com.atits.base.item.ResponseData;
import com.atits.base.security.BaseController;
import com.atits.security.client.SecPermissionClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 权限
 *
 * @author zhangys
 * @date 2020-10-14 17:26
 **/
@RestController
public class SecPermissionController extends BaseController implements SecPermissionClient {

    @Override
    public ResponseData save() {
        return null;
    }

    @Override
    public ResponseData delete() {
        return null;
    }
}
