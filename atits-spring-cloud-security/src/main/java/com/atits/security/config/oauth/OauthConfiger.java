package com.atits.security.config.oauth;

import com.atits.security.config.service.ClientDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @description: 当前类为Oauth2 server的配置类（需要继承特定的⽗类)
 * @author: zhangys
 * @create: 2020-09-10 11:01
 **/
@Configuration
public class OauthConfiger extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ClientDetailServiceImpl clientDetail;

    /**
     * 认证服务器最终是以api接⼝的⽅式对外提供服务（校验合法性并⽣成令牌、校验令牌等）
     * 那么，以api接⼝⽅式对外的话，就涉及到接⼝的访问权限，我们需要在这⾥进⾏必要的配置
     *
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);

        // 相当于打开endpoints 访问接⼝的开关，这样的话后期我们能够访问该接⼝
        security
                // 允许客户端表单认证
                .allowFormAuthenticationForClients()
                // 开启端⼝/oauth/token_key的访问权限（允许）
                .tokenKeyAccess("permitAll()")
                // 开启端⼝/oauth/check_token的访问权限（允许）
                .checkTokenAccess("permitAll()");
    }

    /**
     * 客户端详情配置
     *
     * @param clients
     * @throws Exception
     *
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        super.configure(clients);
        clients.withClientDetails(clientDetail);
    }

    /**
     * 这⾥配置token令牌
     *
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        super.configure(endpoints);

        endpoints
                 //设置jwtToken为tokenStore
                .tokenStore(jwtTokenStore())
                //设置access_token转换器
                .accessTokenConverter(jwtAccessTokenConverter())
                // 指定认证管 理器，随后注⼊⼀个到当前类使⽤即可
                .authenticationManager(authenticationManager)
                .allowedTokenEndpointRequestMethods(HttpMethod.GET,HttpMethod.POST);
    }

    /**
     * jwt的token存储对象
     */
    @Bean
    public JwtTokenStore jwtTokenStore(){
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * jwt访问token转换器
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        converter.setKeyPair(new KeyPair(JWTConfig.publicSecret,JWTConfig.privateSecret));
        converter.setSigningKey("test");
        return converter;
    }

}
