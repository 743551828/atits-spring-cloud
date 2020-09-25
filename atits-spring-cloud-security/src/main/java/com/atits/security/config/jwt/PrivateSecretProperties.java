package com.atits.security.config.jwt;

import com.atits.base.properties.JWTProperties;
import com.atits.base.utils.RsaUtils;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * JWT配置类
 *
 * @author: zhangys
 * @create: 2020-09-10 13:52
 */
@Component
@ConfigurationProperties(prefix = "private-secret")
@RefreshScope
public class PrivateSecretProperties {

    public static String privateSecretString;

    /**
     * 私钥KEY
     */
    public static PrivateKey privateSecret;
    /**
     * 过期时间(秒)
     */
    public static Integer expiration;

    public void setPrivateSecretString(String privateSecretString) throws Exception {
        PrivateSecretProperties.privateSecret = RsaUtils.getPrivateKeyByString(privateSecretString);
    }

    public void setExpiration(Integer expiration) {
        PrivateSecretProperties.expiration = expiration;
    }

}