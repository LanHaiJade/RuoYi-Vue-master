package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 角色类型
 * 类名称：RoleType
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:51:14
 * 修改备注：
 */
public enum RoleType
{
  Admin(1, "系统管理员"), 
  Dealer(2, "经销商"), 
  Employee(4, "补货人员"), 
  Operator(5, "运营商家"), 
  Repair(6, "维修人员"), 
  Partner(7, "合伙商家"), 
  Member(8, "消费会员"), 
  Finance(9, "财务人员"),
  NewOperator(10, "设备合伙管理员"),
  Admin_sh(11, "售后管理"),
  Admin_shkh(12, "售后开户"),
  ;
	
	
  private int type;
  private String name;

  private RoleType(int type, String name) {
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
    for (RoleType us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getType();
      }
    }
    return -1;
  }

  public static String getName(int type) {
    for (RoleType pc : values()) {
      if (pc.getType() == type) {
        return pc.getName();
      }
    }
    return null;
  }


}