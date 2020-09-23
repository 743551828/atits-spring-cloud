package com.atits.security.util;

import com.alibaba.fastjson.JSON;
import com.atits.base.utils.encryption.RsaUtils;
import com.atits.base.item.Payload;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

/**
 * @description: JWT工具类
 * @author: zhangys
 * @create: 2020-08-31 13:49
 **/
public class JwtUtils {

    private static final String JWT_PAYLOAD_USER_KEY = "user";

    /**
     * 私钥加密token
     *
     * @param userInfo   载荷中的数据
     * @param privateKey 私钥
     * @param expire     过期时间，单位分钟
     * @return JWT
     */
    public static String generateTokenExpireInMinutes(Object userInfo, PrivateKey privateKey, int expire) {
        return Jwts.builder()
                .claim(JWT_PAYLOAD_USER_KEY, JSON.toJSONString(userInfo))
                .setId(createJTI())
                .setExpiration(new Date(System.currentTimeMillis() + expire*60000))
                .signWith(SignatureAlgorithm.RS256, privateKey)
                .compact();
    }

    /**
     * 私钥加密token
     *
     * @param userInfo   载荷中的数据
     * @param privateKey 私钥
     * @param expire     过期时间，单位秒
     * @return JWT
     */
    public static String generateTokenExpireInSeconds(Object userInfo, PrivateKey privateKey, int expire) {
        return Jwts.builder()
                .claim(JWT_PAYLOAD_USER_KEY, JSON.toJSONString(userInfo))
                .setId(createJTI())
                .setExpiration(new Date(System.currentTimeMillis() + expire*1000))
                .signWith(SignatureAlgorithm.RS256, privateKey)
                .compact();
    }

    /**
     * 公钥解析token
     *
     * @param token     用户请求中的token
     * @param publicKey 公钥
     * @return Jws<Claims>
     */
    private static Jws<Claims> parserToken(String token, PublicKey publicKey) {
        return Jwts.parser().setSigningKey(publicKey).parseClaimsJws(token);
    }

    private static String createJTI() {
        return new String(Base64.getEncoder().encode(UUID.randomUUID().toString().getBytes()));
    }

    /**
     * 获取token中的用户信息
     *
     * @param token     用户请求中的令牌
     * @param publicKey 公钥
     * @return 用户信息
     */
    public static <T> Payload<T> getInfoFromToken(String token, PublicKey publicKey, Class<T> userType) {
        Jws<Claims> claimsJws = parserToken(token, publicKey);
        Claims body = claimsJws.getBody();
        Payload<T> claims = new Payload<>();
        claims.setId(body.getId());
        claims.setUserInfo(JSON.parseObject(body.get(JWT_PAYLOAD_USER_KEY).toString(),userType));
        claims.setExpiration(body.getExpiration());
        return claims;
    }

    /**
     * 获取token中的载荷信息
     *
     * @param token     用户请求中的令牌
     * @param publicKey 公钥
     * @return 用户信息
     */
    public static <T> Payload<T> getInfoFromToken(String token, PublicKey publicKey) {
        Jws<Claims> claimsJws = parserToken(token, publicKey);
        Claims body = claimsJws.getBody();
        Payload<T> claims = new Payload<>();
        claims.setId(body.getId());
        claims.setExpiration(body.getExpiration());
        return claims;
    }

    public static void main(String[] args) {
        try {
            Payload<Object> payload = JwtUtils.getInfoFromToken("eyJhbGciOiJSUzI1NiJ9.eyJ1c2VyIjoie1wiYWNjb3VudE5vbkV4cGlyZWRcIjp0cnVlLFwiYWNjb3VudE5vbkxvY2tlZFwiOnRydWUsXCJhdXRob3JpdGllc1wiOlt7XCJhdXRob3JpdHlcIjpcIlJPTEVfYWRtaW5cIn1dLFwiY3JlZGVudGlhbHNOb25FeHBpcmVkXCI6dHJ1ZSxcImVuYWJsZWRcIjp0cnVlLFwicGFzc3dvcmRcIjpcIjEyM1wiLFwidXNlcklkXCI6MSxcInVzZXJuYW1lXCI6XCJhZG1pblwifSIsImp0aSI6Ik1EZzRaakEzTWpFdE9XSmxaQzAwTnpCa0xXRmlPRFl0TlRSallXUTBZVEF3TURoaCIsImV4cCI6MTYwMDM5Mzg3N30.NYausi1a2EHrYDj2y73UM8iIEPRHs8-EUHDYh8iiTeFKQ_zSfLeX6XqyGhM4qI-dsz9KatsfdIW3pRrfhztybnvGUDePq7SyxsimHCMyN6D2Q4O3BH0Ip0hntXAgI3vQNIQqNnMFiHiVe2Unp97Ggya1U51UFvhd3N4vakaqAijlBjuTGpybPU7CJlNMM3oGO4ef7yB0Wbjp4-Ka7OL_M9US51WM43sZFgFEiHQ2bCu1Uq4ZBmWfPodCrPm3nygvNMMnuJ4RqLgwfMhxt_1oSzb0gyfB9LzoYRrVGrvBYKpkM4uO8J-SFqLQq0guTs96kENRv7p1cJdi78IKNMrl3g"
                    , RsaUtils.getPublicKey("atits-spring-cloud-security/src/main/resources/publicKey")
            );
            Object userInfo = payload.getUserInfo();
            System.out.println(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
