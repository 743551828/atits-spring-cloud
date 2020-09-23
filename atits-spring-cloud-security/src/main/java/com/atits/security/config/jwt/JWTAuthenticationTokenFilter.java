package com.atits.security.config.jwt;

import com.atits.base.item.Payload;
import com.atits.security.config.entity.UserEntity;
import com.atits.security.util.JwtUtils;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT接口请求校验拦截器
 * 请求接口时会进入这里验证Token是否合法和过期
 * @author: zhangys
 * @create: 2020-09-10 13:52
 */
@Slf4j
public class JWTAuthenticationTokenFilter extends BasicAuthenticationFilter {

    public JWTAuthenticationTokenFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 获取请求头中JWT的Token
        String tokenHeader = request.getHeader(JWTConfig.tokenHeader);
        Object tokenAttr = request.getAttribute(JWTConfig.tokenHeader);
        String tokenParam = request.getParameter(JWTConfig.tokenHeader);
        String wholeToken = "";
        if (tokenHeader != null){
            wholeToken = tokenHeader;
        }else if (tokenAttr != null){
            wholeToken = (String) tokenAttr;
        }else if (tokenParam != null){
            wholeToken = tokenParam;
        }

        if (wholeToken.startsWith(JWTConfig.tokenPrefix)) {
            try {
                // 截取JWT前缀
                String token = wholeToken.replace(JWTConfig.tokenPrefix, "");
                // 解析JWT
                Payload<UserEntity> payload = JwtUtils.getInfoFromToken(token, JWTConfig.publicSecret, UserEntity.class);
                UserEntity userInfo = payload.getUserInfo();
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userInfo, userInfo.getUserId(), userInfo.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } catch (ExpiredJwtException e){
                log.info("Token过期");
            } catch (Exception e) {
                log.info("Token无效");
            }
        }
        filterChain.doFilter(request, response);
    }
}