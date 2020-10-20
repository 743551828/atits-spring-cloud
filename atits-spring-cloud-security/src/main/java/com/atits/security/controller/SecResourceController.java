package com.atits.security.controller;

import com.atits.base.item.ResponseData;
import com.atits.base.security.BaseController;
import com.atits.base.utils.ResponseUtil;
import com.atits.security.client.SecResourceClient;
import com.atits.security.model.request.SecResourceSaveRequest;
import com.atits.security.service.ISecResourceService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 资源
 *
 * @author zhangys
 * @date 2020-10-15 10:40
 **/
@RestController
public class SecResourceController extends BaseController implements SecResourceClient {

    @Autowired
    private ISecResourceService secResourceService;

    @Override
    public ResponseData save(@RequestBody SecResourceSaveRequest secResourceSaveRequest) {
        secResourceService.save(secResourceSaveRequest);
        return ResponseUtil.success();
    }

    @Override
    public ResponseData findOne(@PathVariable("code") @ApiParam("资源code") String code) {
        return ResponseUtil.success(secResourceService.findOne(code));
    }

    @Override
    public ResponseData delete(@RequestBody List<String> codes) {
        return null;
    }
}
