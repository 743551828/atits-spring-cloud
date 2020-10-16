package com.atits.security.config.handler;

import com.atits.base.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.atits.base.contants.StatusCodeConstant.*;

/**
 * 登录失败处理类
 * @Author Zhangys
 * @CreateTime 2019/10/3 9:06
 */
@Slf4j
public class UserLoginFailureHandler implements AuthenticationFailureHandler {
    /**
     * 登录失败返回结果
     * @Author Zhangys
     * @CreateTime 2019/10/3 9:12
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception){
        // 这些对于操作的处理类可以根据不同异常进行不同处理
        if (exception.getCause() instanceof UsernameNotFoundException){
            ResultUtil.responseJson(response,ResultUtil.resultCode(_500001));
        }
        if (exception.getCause() instanceof LockedException){
            ResultUtil.responseJson(response,ResultUtil.resultCode(_500002));
        }
        if (exception instanceof BadCredentialsException){
            ResultUtil.responseJson(response,ResultUtil.resultCode(_500003));
        }
        ResultUtil.responseJson(response,ResultUtil.resultCode(_500004));
    }
}