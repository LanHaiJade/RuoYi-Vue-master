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
public enum ICIccardrerecordOpType {
	//操作类型：0开卡，1修改，2充值，3启用卡，4禁用卡，5补卡，6注销卡，7导入
	KaiKa(0,"开卡"),
	xiuGai(1, "修改"),
	chongZhi(2, "充值"),
	qiYong(3, "启用卡"),
	jinYong(4, "禁用卡"),
	buKa(5, "补卡"),
	zhuXiao(6, "注销卡"),
	daoRu(7, "导入"),
	;

	private int type;
	private String name;

	private ICIccardrerecordOpType(int type, String name) {
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
		for (ICIccardrerecordOpType us : values()) {
			if (StringUtil.equals(name, us.getName())) {
				return us.getType();
			}
		}
		return -1;
	}

	public static String getName(int type) {
		for (ICIccardrerecordOpType us : values()) {
			if (Objects.equals(us.getType(), type)) {
				return us.getName();
			}
		}
		return "";
	}
}
