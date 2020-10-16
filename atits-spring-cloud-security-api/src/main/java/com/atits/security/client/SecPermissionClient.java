package com.atits.security.client;

import com.atits.base.item.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 权限客户端
 *
 * @author zhangys
 * @date 2020-10-14 17:27
 **/
@FeignClient("sec-permission-client")
@Api("权限接口")
public interface SecPermissionClient {

    @ApiOperation("新增一个权限")
    @PostMapping("/sec/permission/save")
    ResponseData save();

    @ApiOperation("批量删除权限")
    @DeleteMapping("/sec/permission/delete")
    ResponseData delete();

}
