package com.atits.security.config.handler.security;

import com.atits.security.config.jwt.JWTConfig;
import com.atits.security.config.entity.UserEntity;
import com.atits.security.util.JwtUtils;
import com.atits.security.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 登录成功处理类
 * @Author Zhangys
 * @CreateTime 2019/10/3 9:13
 */
@Slf4j
@Component
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {
    /**
     * 登录成功返回结果
     * @Author Zhangys
     * @CreateTime 2019/10/3 9:27
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        // 组装JWT
        UserEntity selfUserEntity =  (UserEntity) authentication.getPrincipal();
        String token = JwtUtils.generateTokenExpireInSeconds(selfUserEntity, JWTConfig.privateSecret, JWTConfig.expiration);
        token = JWTConfig.tokenPrefix + token;
        // 封装返回参数
        Map<String,Object> resultData = new HashMap<>();
        resultData.put("code","200");
        resultData.put("msg", "登录成功");
        System.out.println("登录成功");
        resultData.put("token",token);
        ResultUtil.responseJson(response,resultData);
    }
}