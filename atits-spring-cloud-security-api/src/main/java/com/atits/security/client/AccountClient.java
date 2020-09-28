package com.atits.security.client;

import com.atits.security.model.entity.UserEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 账户controller
 * @author: zhangys
 * @create: 2020-09-08 13:30
 **/
@FeignClient("atits-spring-cloud-security")
public interface AccountClient{

    /**
     * test
     *
     * @param test
     * @return
     */
    @PostMapping("/get")
    @ApiOperation("test")
    String get(@RequestBody UserEntity userEntity);


}
