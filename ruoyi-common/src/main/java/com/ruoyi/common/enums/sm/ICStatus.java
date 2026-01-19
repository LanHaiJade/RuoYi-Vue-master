package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

import java.util.Objects;

/**
 * 操作IC卡各种状态
 * 类名称：ICStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:18:00
 * 修改备注：
 */
public enum ICStatus {
	//状态，1开卡时间，2销卡时间，3管理员充值，4挂失（禁用），5启用，6补卡，7二维码充值
	KaiKa(0L,"开卡"),
	jinYong(4L, "禁用"),
	xiaoKa(5L, "销卡");

	private Long type;
	private String name;

	private ICStatus(Long type, String name) {
		this.type = type;
		this.name = name;
	}

	public Long getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public static Long getType(String name) {
		for (ICStatus us : values()) {
			if (StringUtil.equals(name, us.getName())) {
				return us.getType();
			}
		}
		return -1L;
	}

	public static String getName(Long type) {
		for (ICStatus us : values()) {
			if (Objects.equals(us.getType(), type)) {
				return us.getName();
			}
		}
		return "";
	}
}
