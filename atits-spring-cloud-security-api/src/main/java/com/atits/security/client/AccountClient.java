package com.atits.security.client;

import com.atits.security.model.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: 账户接口
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@FeignClient("atits-spring-cloud-security")
@Api("账户接口")
public interface AccountClient{

    /**
     * test
     *
     * @param test
     * @return
     */
    @PostMapping("/get")
    @ApiOperation("test")
    String get(@RequestBody UserDto userDto);


}
