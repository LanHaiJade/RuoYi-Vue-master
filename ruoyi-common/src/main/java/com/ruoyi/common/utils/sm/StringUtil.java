package com.ruoyi.common.utils.sm;

import java.util.regex.Pattern;

public class StringUtil {
	public static boolean yesNull(String str) {
		return (str == null) || (str.trim().length() <= 0) 
				|| "null".equals(str.trim()) || ("NULL".equals(str.trim()));
	}

	public static boolean notNull(String str) {
		return !yesNull(str);
	}

	public static String notNullStr(String str) {
		return (yesNull(str)) || ("NULL".equals(str.trim())) || "null".equals(str.trim()) ? "" : str;
	}

	public static boolean equals(String str1, String str2) {
		return (notNull(str1)) && (notNull(str2)) && (str1.trim().equals(str2.trim()));
	}

	public static String strorkong(String str) {
		return notNull(str) ? str : "";
	}

	public static String addZeroForNum(String str, int strLength) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strLength - str.length(); i++) {
			sb.append("0");
		}
		sb.append(str);
		return sb.toString();
	}

	public static String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	public static String bodyName(String goodsName) {
		if (goodsName == null) goodsName = "";
		String body = "";
		if (goodsName.length() > 0) {
			body = goodsName;
			String regEx = "[`~!@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？']";
			body = Pattern.compile(regEx).matcher(body).replaceAll("").trim();
			body = body.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "");
			body = body.replace(",", "").replace(" ", "");
			if (body.length() > 30)
				body = body.substring(0, 30) + "...";
		}
		if ("".equals(body))
			body = "零售商品";
		return body;
	}
}