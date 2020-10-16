package com.atits.base.utils;

import com.atits.base.item.SelfUserDepartmentRoleDetail;
import com.atits.base.item.SelfUserDetail;
import com.sun.beans.editors.StringEditor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;

/**
 *
 *
 * @author zhangys
 * @date 2020-10-15 10:26
 **/
@Slf4j
public class CurrentUserUtil {

    /**
     * 获取当前的用户实体
     *
     * @return
     */
    public static SelfUserDetail getUserDetail(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof SelfUserDetail){
            return (SelfUserDetail) authentication.getPrincipal();
        }else {
            throw new RuntimeException("获取当前的用户实例失败");
        }
    }

    /**
     * 获取当前用户code
     *
     * @return
     */
    public static String getUserCode(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getCredentials() == null){
            throw new RuntimeException("获取当前的用户Code失败");
        }
        return (String) authentication.getCredentials();
    }

    /**
     * 获取当前用户名
     *
     * @return
     */
    public static String getUserName(){
        SelfUserDetail userDetail = getUserDetail();
        return userDetail.getUsername();
    }

    /**
     * 获取当前用户的部门和权限
     *
     * @return
     */
    public static List<SelfUserDepartmentRoleDetail> getUserDepartmentRole(){
        SelfUserDetail userDetail = getUserDetail();
        return (List<SelfUserDepartmentRoleDetail>)userDetail.getUserDepartmentRoles();
    }

}
