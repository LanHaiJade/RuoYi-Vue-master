package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 操作IC卡各种状态
 * 类名称：ICStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:18:00
 * 修改备注：
 */
public enum ICStatus {
	//状态，1开卡时间，2销卡时间，3管理员充值，4挂失（禁用），5启用，6补卡，7二维码充值
	KaiKa(1,"开卡"),
	XiaoKa(2, "销卡"),
	chongzhi(3, "线下充值"),
	jinyong(4, "禁用（挂失）"),
	qiyong(5, "启用"),
	buka(6, "补卡"),
	erweima(7, "线上充值"),
	rset0(8, "余额清零"),
	;

	private int type;
	private String name;

	private ICStatus(int type, String name) {
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
		for (ICStatus us : values()) {
			if (StringUtil.equals(name, us.getName())) {
				return us.getType();
			}
		}
		return -1;
	}

	public static String getName(int type) {
		for (ICStatus us : values()) {
			if (us.getType() == type) {
				return us.getName();
			}
		}
		return "";
	}
}
