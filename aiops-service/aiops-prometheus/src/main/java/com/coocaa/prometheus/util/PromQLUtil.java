package com.coocaa.prometheus.util;

import com.coocaa.core.tool.utils.Func;

/**
 * @program: intelligent_maintenance
 * @description: 普罗米修斯语法工具类
 * @author: dongyang_wu
 * @create: 2019-08-02 13:57
 */
public class PromQLUtil {

    public static String getQueryConditionStr(String key, String value) {
        StringBuffer sb = new StringBuffer();
        sb.append(key).append("=\"").append(value).append("\"");
        return sb.toString();
    }
}