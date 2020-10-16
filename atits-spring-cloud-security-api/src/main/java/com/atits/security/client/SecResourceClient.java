package com.atits.security.client;

import com.atits.base.item.ResponseData;
import com.atits.security.model.request.SecResourceSaveRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 资源客户端
 *
 * @author zhangys
 * @date 2020-10-14 17:27
 **/
@FeignClient("sec-resource-client")
@Api("资源接口")
public interface SecResourceClient {

    @ApiOperation("新增一个资源")
    @PostMapping("/sec/resource/save")
    ResponseData save(@RequestBody SecResourceSaveRequest secResourceSaveRequest);

    @ApiOperation("查询资源详情")
    @GetMapping("/sec/resource/find/one/{code}")
    ResponseData findOne(@PathVariable @ApiParam("资源code") String code);

    @ApiOperation("批量删除资源")
    @DeleteMapping("/sec/resource/delete")
    ResponseData delete(@RequestBody List<String> codes);


}
