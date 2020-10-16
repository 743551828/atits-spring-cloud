INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (1, 'atits-spring-cloud-security.yaml', 'atits-spring-cloud-security-group', '# server:
#   port: 8080
spring:
  jpa:
    hibernate:
      ddl-auto: none
      naming:
        physical-strategy: org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy #命名策略
    show-sql: false
  datasource:
    url: jdbc:mysql://47.111.130.161:3306/atits_security?characterEncoding=UTF-8
    username: root
    password: 46132205092017
    driver-class-name: com.mysql.cj.jdbc.Driver
', 'd63c8404c5c25c303c83a7b467762764', '2020-09-10 01:59:18', '2020-10-16 07:57:07', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (2, 'atits-spring-cloud-information.yaml', 'atits-spring-cloud-information-group', 'server:
  port: 8081
test: 1111', '2765a763c0ddaad2b8f5c418c66b3251', '2020-09-10 02:02:25', '2020-09-28 08:19:07', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (3, 'atits-spring-cloud-security.yaml', 'atits-spring-cloud-security-group', 'server:
  port: 7080
springfox:
  documentation:
    swagger-ui:
      enabled: false
spring:
  jpa:
    hibernate:
      ddl-auto: none
      naming:
        physical-strategy: org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy #命名策略
    show-sql: false
  datasource:
    url: jdbc:mysql://47.111.130.161:3306/atits_security?characterEncoding=UTF-8
    username: root
    password: 46132205092017
    driver-class-name: com.mysql.cj.jdbc.Driver', '463b596eae56a6b4c7b14950908fb52d', '2020-09-10 02:02:54', '2020-10-16 07:58:34', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (4, 'atits-spring-cloud-information.yaml', 'atits-spring-cloud-information-group', 'server:
  port: 7081', '04420938fdafca8c967e704dd411cdc8', '2020-09-10 02:02:54', '2020-09-28 06:48:30', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (18, 'jwt.yaml', 'jwt-group', 'jwt:
  publicSecretString: MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyupKjV4BFbxIz+mDBBXD3bZ3yJs/wuzhRF+tHRK7mK73owEuj7tAMJTjb/nlwGcemMJghwB10IYyD9EkTu+Iit6g8hWxC3Nr/kwGYmPfQiKrTtIYN3qkp7PAmV6upj4p3LWJTXqkWWBTjB0rF/O8RgP8LJ2k3KN5VCOmaIAYtGCzcBaAG74lPcYp5UOAr3KB22GI/lCSb3M57rYcRF9EnIcTl+SQgyuD1c+hfMPc4JbP0/NvNx8QOIV/2B46k1UmuYlw+CjUbNeHRCFi96PZ/dyH6z3oNfO5zpDnTzdh2XHnww+CYDsOjoUFh+Wlyo0dcymZxc0LjQ+7fSMCSI3/cQIDAQAB
  # HeaderKEY
  tokenHeader: Authorization
  # Token前缀字符
  tokenPrefix: atits-', 'e1f0d1aa4b5f1ebf76ad476f0455053a', '2020-09-24 09:23:52', '2020-09-24 09:23:52', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', null, null, null, 'yaml', null);
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (19, 'private-secret.yaml', 'jwt-group', 'private-secret:
  privateSecretString: MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDK6kqNXgEVvEjP6YMEFcPdtnfImz/C7OFEX60dEruYrvejAS6Pu0AwlONv+eXAZx6YwmCHAHXQhjIP0SRO74iK3qDyFbELc2v+TAZiY99CIqtO0hg3eqSns8CZXq6mPinctYlNeqRZYFOMHSsX87xGA/wsnaTco3lUI6ZogBi0YLNwFoAbviU9xinlQ4CvcoHbYYj+UJJvcznuthxEX0SchxOX5JCDK4PVz6F8w9zgls/T8283HxA4hX/YHjqTVSa5iXD4KNRs14dEIWL3o9n93IfrPeg187nOkOdPN2HZcefDD4JgOw6OhQWH5aXKjR1zKZnFzQuND7t9IwJIjf9xAgMBAAECggEBAIvl/IB6z0StC4ZM+IdYejHiG7OzVcKOjsEVNcVVpQEfoJxBtFhkQV09SZFqOXztm6q2WNa6+n9KBjnhd6b0fq8/zrcZPXcnnM02nTA4qzRtsq4lK40UgXEd/SvAm6kCMtp4TrGcXLNCNlfjxFI/OQ8MsFASYBe+nWflLFXf+yhgSF+G6LxqmwJfhQDnF/6xFu2Px0QupcM+Pq1hog3J++2+wtx1jePA3Z1ydx6gLeEXvZ7pR8UaqyzS66vU9R7ZKJUJ+Y7VlDqwDTc6Ed9zNCd1/E75w+CqTaIUt0kIuvMiozXUqLgPyUa/95pzNIUFL/w5EWCrD5Z6G2uYuSQMuAECgYEA84HazM2yB5ngYEj6vUqrcYz7VSrv/WFu7/7Jx4Vdsi73J4mCD8GKtEqWcpBroBUaYF9KDHcCiQEZyxgz72Zi8MP2RNboq7nP48ni3EWJAdJKqkloL5h9rUqnUNTZeSTbeNopg0vinYFy9FCkuTRS4D0IKhsNqwfNxdQWcNLick0CgYEA1VNQUnhc2CCqR0BLheYtMjeyxpFwqXDN4xKM4M5ZRIO2FT00NkdYpPJ5nFVeVLg8cVJbNMybh4lhag9SiZzpGoCHfHznfAGw7lCA1N/DtTV76B6grH/UEG8MneyWc/g6NGQ7CSkOdlzKpKWbINievkqRCrd1fpuvLxnjBd/ha7UCgYEA4VLAhxCzcyslH5OISU5l9E2zZ6yyo7Db+cG3LyOufqnM083/BttdoNUAAAS5QkkkvhaOq5gYRXQ6TN8Zd6YzWXzLTgnbBMSMpMh0XsUNMR1JL+d7O8eMS6Uvy7EZh2relyawkSjQClT1bTOOKT5MjeiLvIKKFD/FXhCRr1bEaWUCgYBKTlbwIxTUA6zMXMzxuxeLInOXTxnbK3vL2K5RsA7QGsDV7Re+wGNUMVHC7smI4RPMtU8nuQ2DzIquEuBBJvLbVGHdLvTC8SPcHxaBD+Bvwk2CsQhujagkgUn3yG0vwAsmLLOToUV0XSYI69Z5Pnss9XRIM1ct3rTKx02Ywj8W8QKBgAD/U7mZtcQXzTzqna31I5l8uM/NXIUpOm2jOoKFsyHjDIiEWNOrp5gYR32ypwcLkMnDB01omV05bKQA12X20hWasYNMBKirex9+umXxtEPeub+/ilnWFh/UueO9kY45iWV76h5UN8PHvccSCUVMIPCLA0rpC9dgivnnurjTfCoH
  # 过期时间 单位秒 1天后过期=86400 7天后过期=604800
  expiration: 86400', '567657422979d6533c67896c467a5345', '2020-09-24 09:25:53', '2020-09-25 05:57:00', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (31, 'redis.yaml', 'database-group', 'redis:', '32df70ce9a09e04175c3344fbb0b134a', '2020-09-25 06:58:50', '2020-09-25 06:58:50', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', null, null, null, 'yaml', null);
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (33, 'redis.yaml', 'database-group', 'redis:', '32df70ce9a09e04175c3344fbb0b134a', '2020-09-25 06:59:51', '2020-09-25 06:59:51', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', null, null, null, 'yaml', null);
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (35, 'jwt.yaml', 'jwt-group', 'jwt:
  publicSecretString: MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyupKjV4BFbxIz+mDBBXD3bZ3yJs/wuzhRF+tHRK7mK73owEuj7tAMJTjb/nlwGcemMJghwB10IYyD9EkTu+Iit6g8hWxC3Nr/kwGYmPfQiKrTtIYN3qkp7PAmV6upj4p3LWJTXqkWWBTjB0rF/O8RgP8LJ2k3KN5VCOmaIAYtGCzcBaAG74lPcYp5UOAr3KB22GI/lCSb3M57rYcRF9EnIcTl+SQgyuD1c+hfMPc4JbP0/NvNx8QOIV/2B46k1UmuYlw+CjUbNeHRCFi96PZ/dyH6z3oNfO5zpDnTzdh2XHnww+CYDsOjoUFh+Wlyo0dcymZxc0LjQ+7fSMCSI3/cQIDAQAB
  # HeaderKEY
  tokenHeader: Authorization
  # Token前缀字符
  tokenPrefix: atits-', 'e1f0d1aa4b5f1ebf76ad476f0455053a', '2020-09-25 09:37:14', '2020-09-25 09:37:14', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', null, null, null, 'yaml', null);
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (36, 'private-secret.yaml', 'jwt-group', 'private-secret:
  privateSecretString: MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDK6kqNXgEVvEjP6YMEFcPdtnfImz/C7OFEX60dEruYrvejAS6Pu0AwlONv+eXAZx6YwmCHAHXQhjIP0SRO74iK3qDyFbELc2v+TAZiY99CIqtO0hg3eqSns8CZXq6mPinctYlNeqRZYFOMHSsX87xGA/wsnaTco3lUI6ZogBi0YLNwFoAbviU9xinlQ4CvcoHbYYj+UJJvcznuthxEX0SchxOX5JCDK4PVz6F8w9zgls/T8283HxA4hX/YHjqTVSa5iXD4KNRs14dEIWL3o9n93IfrPeg187nOkOdPN2HZcefDD4JgOw6OhQWH5aXKjR1zKZnFzQuND7t9IwJIjf9xAgMBAAECggEBAIvl/IB6z0StC4ZM+IdYejHiG7OzVcKOjsEVNcVVpQEfoJxBtFhkQV09SZFqOXztm6q2WNa6+n9KBjnhd6b0fq8/zrcZPXcnnM02nTA4qzRtsq4lK40UgXEd/SvAm6kCMtp4TrGcXLNCNlfjxFI/OQ8MsFASYBe+nWflLFXf+yhgSF+G6LxqmwJfhQDnF/6xFu2Px0QupcM+Pq1hog3J++2+wtx1jePA3Z1ydx6gLeEXvZ7pR8UaqyzS66vU9R7ZKJUJ+Y7VlDqwDTc6Ed9zNCd1/E75w+CqTaIUt0kIuvMiozXUqLgPyUa/95pzNIUFL/w5EWCrD5Z6G2uYuSQMuAECgYEA84HazM2yB5ngYEj6vUqrcYz7VSrv/WFu7/7Jx4Vdsi73J4mCD8GKtEqWcpBroBUaYF9KDHcCiQEZyxgz72Zi8MP2RNboq7nP48ni3EWJAdJKqkloL5h9rUqnUNTZeSTbeNopg0vinYFy9FCkuTRS4D0IKhsNqwfNxdQWcNLick0CgYEA1VNQUnhc2CCqR0BLheYtMjeyxpFwqXDN4xKM4M5ZRIO2FT00NkdYpPJ5nFVeVLg8cVJbNMybh4lhag9SiZzpGoCHfHznfAGw7lCA1N/DtTV76B6grH/UEG8MneyWc/g6NGQ7CSkOdlzKpKWbINievkqRCrd1fpuvLxnjBd/ha7UCgYEA4VLAhxCzcyslH5OISU5l9E2zZ6yyo7Db+cG3LyOufqnM083/BttdoNUAAAS5QkkkvhaOq5gYRXQ6TN8Zd6YzWXzLTgnbBMSMpMh0XsUNMR1JL+d7O8eMS6Uvy7EZh2relyawkSjQClT1bTOOKT5MjeiLvIKKFD/FXhCRr1bEaWUCgYBKTlbwIxTUA6zMXMzxuxeLInOXTxnbK3vL2K5RsA7QGsDV7Re+wGNUMVHC7smI4RPMtU8nuQ2DzIquEuBBJvLbVGHdLvTC8SPcHxaBD+Bvwk2CsQhujagkgUn3yG0vwAsmLLOToUV0XSYI69Z5Pnss9XRIM1ct3rTKx02Ywj8W8QKBgAD/U7mZtcQXzTzqna31I5l8uM/NXIUpOm2jOoKFsyHjDIiEWNOrp5gYR32ypwcLkMnDB01omV05bKQA12X20hWasYNMBKirex9+umXxtEPeub+/ilnWFh/UueO9kY45iWV76h5UN8PHvccSCUVMIPCLA0rpC9dgivnnurjTfCoH
  # 过期时间 单位秒 1天后过期=86400 7天后过期=604800
  expiration: 86400', '567657422979d6533c67896c467a5345', '2020-09-25 09:37:14', '2020-09-25 09:37:14', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', null, null, null, 'yaml', null);
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (46, 'atits-spring-cloud-gateway.yaml', 'atits-spring-cloud-gateway-group', 'server:
  port: 8000
spring:
  cloud:
    gateway:
      routes:
        # id和Path要相等
        - id: security
          uri: lb://atits-spring-cloud-security
          predicates:
            - Path=/security/**
          filters:
            - StripPrefix=1
        - id: information
          uri: lb://atits-spring-cloud-information
          predicates:
            - Path=/information/**
          filters:
            - StripPrefix=1', '072e33b669cb1fa1368afd1819896495', '2020-09-27 07:15:59', '2020-09-28 07:51:24', null, '0:0:0:0:0:0:0:1', '', 'c0f49359-6117-443c-b220-6290c4ca221d', '', '', '', 'yaml', '');
INSERT INTO nacos_config.config_info (id, data_id, group_id, content, md5, gmt_create, gmt_modified, src_user, src_ip, app_name, tenant_id, c_desc, c_use, effect, type, c_schema) VALUES (47, 'atits-spring-cloud-gateway.yaml', 'atits-spring-cloud-gateway-group', 'server:
  port: 7000
springfox:
  documentation:
    swagger-ui:
      enabled: false
spring:
  cloud:
    gateway:
      routes:
        - id: security
          uri: lb://atits-spring-cloud-security
          predicates:
            - Path=/security/**
          filters:
            - StripPrefix=1
        - id: information
          uri: lb://atits-spring-cloud-information
          predicates:
            - Path=/information/**
          filters:
            - StripPrefix=1', 'b392b7bd9c8e12b2faedcd1eace66872', '2020-09-27 07:16:30', '2020-09-28 07:54:00', null, '0:0:0:0:0:0:0:1', '', '49e19216-89ea-4ef3-9f36-988cb9c260e0', '', '', '', 'yaml', '');