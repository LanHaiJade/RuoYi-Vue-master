package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 操作状态
 * 类名称：ControlStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:12:55
 * 修改备注：
 */
public enum ControlStatus
{
  Start(0, "启动机器", "start"), 
  Notice(1, "提示停机", "notice"), 
  Stop(2, "停机", "stop"), 

  Stoping(4, "停止售卖", "closed"), 
  Starting(5, "正常售卖", "open");

  private int status;
  private String name;
  private String nameEn;//英文名称

  private ControlStatus(int status, String name, String nameEn) {
    this.status = status;
    this.name = name;
    this.nameEn = nameEn;
  }

  public int getStatus() {
    return this.status;
  }

  public String getName() {
    return this.name;
  }
  
  public String getNameEn() {
	  return this.nameEn;
  }

  public static int getStatus(String name) {
    for (ControlStatus us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getStatus();
      }
    }
    return Starting.getStatus();
  }

  public static String getName(int status) {
    for (ControlStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getName();
      }
    }
    return Starting.getName();
  }
  
  public static String getNameEn(int status) {
    for (ControlStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getNameEn();
      }
    }
    return "";
  }

  public static ControlStatus getControlStatus(int status) {
    for (ControlStatus us : values()) {
      if (us.getStatus() == status) {
        return us;
      }
    }
    return Starting;
  }
}