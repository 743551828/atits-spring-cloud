package com.atits.security.config.handler;

import com.atits.base.item.SelfUserDetail;
import com.atits.base.properties.JWTProperties;
import com.atits.base.utils.JwtUtils;
import com.atits.base.utils.ResultUtil;
import com.atits.security.config.jwt.PrivateSecretProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static com.atits.base.contants.StatusCodeConstant.*;

/**
 * @Description 登录成功处理类
 * @Author Zhangys
 * @CreateTime 2019/10/3 9:13
 */
@Slf4j
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {

    /**
     * 登录成功返回结果
     * @Author Zhangys
     * @CreateTime 2019/10/3 9:27
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication){
        // 组装JWT
        SelfUserDetail selfUserEntity =  (SelfUserDetail) authentication.getPrincipal();
        String token = JwtUtils.generateTokenExpireInSeconds(selfUserEntity, PrivateSecretProperties.privateSecret, PrivateSecretProperties.expiration);
        token = JWTProperties.tokenPrefix + token;
        // 封装返回参数
        Map<String,Object> resultData = new HashMap<>();
        resultData.put("code", _200.getCode());
        resultData.put("msg", "登录成功");
        resultData.put("token",token);
        ResultUtil.responseJson(response,resultData);
    }
}