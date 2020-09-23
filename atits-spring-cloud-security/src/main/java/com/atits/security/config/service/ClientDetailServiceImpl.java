package com.atits.security.config.service;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * @description: 客户端账户配置
 * @author: zhangys
 * @create: 2020-09-10 17:12
 **/
@Service
public class ClientDetailServiceImpl implements ClientDetailsService {

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        BaseClientDetails baseClientDetails = new BaseClientDetails(clientId, "test", "all111", "password,authorization_code,refresh_token,implicit", "","http://localhost:8082/evaluation/login");
        baseClientDetails.setClientSecret("aaa");
        return baseClientDetails;
    }

}
