package com.atits.base.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 实例转换工具
 * @author: zhangys
 * @create: 2020-08-31 13:49
 **/
@Slf4j
public class BeanCopierUtil {

    /**
     * BeanCopier的缓存
     */
    static final ConcurrentHashMap<String, BeanCopier> BEAN_COPIER_CACHE = new ConcurrentHashMap<>();
 
    /**
     * BeanCopier的copy
     *
     * @param source 源文件的
     * @param target 目标文件class
     */
    public static <T,S> T copy(S source, Class<T> target) {
        String key = genKey(source.getClass(), target);
        BeanCopier beanCopier;
        if (BEAN_COPIER_CACHE.containsKey(key)) {
            beanCopier = BEAN_COPIER_CACHE.get(key);
        } else {
            beanCopier = BeanCopier.create(source.getClass(), target, false);
            BEAN_COPIER_CACHE.put(key, beanCopier);
        }
        T targetObject = null;
        try {
            targetObject = target.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("实例转换失败：" + e.getMessage());
            e.printStackTrace();
        }
        beanCopier.copy(source, targetObject, null);
        return targetObject;
    }

    /**
     * BeanCopier的copy
     *
     * @param source 源文件的
     * @param target 目标文件class
     */
    public static <T,S> void copy(S source, T target) {
        String key = genKey(source.getClass(), target.getClass());
        BeanCopier beanCopier;
        if (BEAN_COPIER_CACHE.containsKey(key)) {
            beanCopier = BEAN_COPIER_CACHE.get(key);
        } else {
            beanCopier = BeanCopier.create(source.getClass(), target.getClass(), false);
            BEAN_COPIER_CACHE.put(key, beanCopier);
        }
        beanCopier.copy(source, target, null);
    }

    /**
     * BeanCopier的copy
     *
     * @param source 源文件的
     * @param target 目标文件class
     */
    public static <T,S> List<T> copy(List<S> source, Class<T> target) {
        List<T> targetList = new ArrayList<>();
        for (S s : source){
            T t = copy(s, target);
            targetList.add(t);
        }
        return targetList;
    }

    /**
     * 生成key
     *
     * @param srcClazz 源文件的class
     * @param tgtClazz 目标文件的class
     * @return string
     */
    private static String genKey(Class<?> srcClazz, Class<?> tgtClazz) {
        return srcClazz.getName() + tgtClazz.getName();
    }
}