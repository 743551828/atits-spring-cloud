package com.atits.base.security;

import com.sun.beans.editors.StringEditor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 *
 *
 * @author zhangys
 * @date 2020-10-15 10:26
 **/
@Slf4j
public class BaseController {


    /**
     * 初始化数据绑定
     * 将所有传递进来的String进行HTML编码，防止XSS攻击
     * String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
     *
     * @param binder the binder@InitBinder
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringEditor());
    }


}
