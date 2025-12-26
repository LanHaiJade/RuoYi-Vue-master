package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 用户状态
 * 类名称：Status
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:53:31
 * 修改备注：
 */
public enum Status {
	Normal(0, "正常"), 
	ReView(2, "待审核"), 
	Invalid(4, "禁用"), 
	//IC会员卡专用
	CancelICCard(5,"销卡");

	private int status;
	private String name;

	private Status(int status, String name) {
		this.status = status;
		this.name = name;
	}

	public int getStatus() {
		return this.status;
	}

	public String getName() {
		return this.name;
	}

	public static int getStatus(String name) {
		for (Status us : values()) {
			if (StringUtil.equals(name, us.getName())) {
				return us.getStatus();
			}
		}
		return -1;
	}

	public static String getName(int status) {
		for (Status us : values()) {
			if (us.getStatus() == status) {
				return us.getName();
			}
		}
		return "";
	}
}