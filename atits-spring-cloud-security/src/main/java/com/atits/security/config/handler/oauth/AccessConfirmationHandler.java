//package com.atits.security.config.handler.oauth;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Map;
//
///**
// * @description: 访问确认信息获取
// * @author: zhangys
// * @create: 2020-09-14 15:20
// **/
//@RestController
//@SessionAttributes("authorizationRequest")
//public class AccessConfirmationHandler {
//
//    @RequestMapping("/oauth/confirm_access")
//    public Object getAccessConfirmationInfo(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Object scopes = (model.containsKey("scopes") ?
//                model.get("scopes") : request.getAttribute("scopes"));
//        return scopes;
//    }
//
//
//}
