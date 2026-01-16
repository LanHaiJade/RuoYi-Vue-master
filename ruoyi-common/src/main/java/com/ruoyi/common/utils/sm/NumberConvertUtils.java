package com.ruoyi.common.utils.sm;

import java.math.BigDecimal;
import org.springframework.util.StringUtils;

/**
 * String 转 BigDecimal 工具类（安全版）
 */
public class NumberConvertUtils {

    /**
     * 安全转换 String 到 BigDecimal
     * @param str 待转换的字符串
     * @return 转换后的 BigDecimal，转换失败返回 BigDecimal.ZERO
     */
    public static BigDecimal safeStringToBigDecimal(String str) {
        // 1. 处理 null 或空串
        if (!StringUtils.hasText(str)) {
            return BigDecimal.ZERO;
        }
        try {
            // 2. 构造方法高精度转换
            return new BigDecimal(str.trim()); // 先去除首尾空格，避免"  200.00  "这类格式问题
        } catch (NumberFormatException e) {
            // 3. 处理非法数字格式（如"abc"、"123a"等）
            System.err.println("字符串转换BigDecimal失败，非法格式：" + str);
            return BigDecimal.ZERO;
        }
    }

    /**
     * 安全转换 String 到 BigDecimal（可指定默认值）
     * @param str 待转换的字符串
     * @param defaultValue 转换失败时返回的默认值
     * @return 转换后的 BigDecimal
     */
    public static BigDecimal safeStringToBigDecimal(String str, BigDecimal defaultValue) {
        if (!StringUtils.hasText(str)) {
            return defaultValue;
        }
        try {
            return new BigDecimal(str.trim());
        } catch (NumberFormatException e) {
            System.err.println("字符串转换BigDecimal失败，非法格式：" + str);
            return defaultValue;
        }
    }
}