package com.atits.security.config.jwt;

import com.atits.base.utils.encryption.RsaUtils;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * JWT配置类
 *
 * @author: zhangys
 * @create: 2020-09-10 13:52
 */
@Getter
@Component
@ConfigurationProperties(prefix = "jwt")
public class JWTConfig {

    public static String publicSecretSrc;

    public static String privateSecretSrc;
    /**
     * 公钥KEY
     */
    public static PublicKey publicSecret;
    /**
     * 私钥KEY
     */
    public static PrivateKey privateSecret;
    /**
     * TokenKey
     */
    public static String tokenHeader;
    /**
     * Token前缀字符
     */
    public static String tokenPrefix;
    /**
     * 过期时间(秒)
     */
    public static Integer expiration;

    public void setPublicSecretSrc(String publicSecretSrc) {
        try {
            JWTConfig.publicSecret = RsaUtils.getPublicKey(publicSecretSrc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPrivateSecretSrc(String privateSecretSrc) {
        try {
            JWTConfig.privateSecret = RsaUtils.getPrivateKey(privateSecretSrc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTokenHeader(String tokenHeader) {
        JWTConfig.tokenHeader = tokenHeader;
    }

    public void setTokenPrefix(String tokenPrefix) {
        JWTConfig.tokenPrefix = tokenPrefix;
    }

    public void setExpiration(Integer expiration) {
        JWTConfig.expiration = expiration;
    }

}