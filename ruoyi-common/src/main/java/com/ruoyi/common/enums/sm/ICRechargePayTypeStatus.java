package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 操作IC卡各种状态
 * 类名称：ICStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:18:00
 * 修改备注：
 */
public enum ICRechargePayTypeStatus {

	xianShang(0,"线上充值"),
	xianXia(1, "线下充值");

	private int type;
	private String name;

	private ICRechargePayTypeStatus(int type, String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public static int getType(String name) {
		for (ICRechargePayTypeStatus us : values()) {
			if (StringUtil.equals(name, us.getName())) {
				return us.getType();
			}
		}
		return -1;
	}

	public static String getName(int type) {
		for (ICRechargePayTypeStatus us : values()) {
			if (us.getType() == type) {
				return us.getName();
			}
		}
		return "";
	}
}
