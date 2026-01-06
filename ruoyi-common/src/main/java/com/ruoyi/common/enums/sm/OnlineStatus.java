package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 在线状态
 * 类名称：OnlineStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:39:15
 * 修改备注：
 */
public enum OnlineStatus
{
  All(-1, "全部", "All"), 
  Online(0, "在线", "Online"), 
  Offline(4, "离线", "Offline");

  private int status;
  private String name;
  private String nameEn;

  private OnlineStatus(int status, String name, String nameEn) {
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
    for (OnlineStatus us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getStatus();
      }
    }
    return -1;
  }

  public static String getName(int status) {
    for (OnlineStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getName();
      }
    }
    return "";
  }
  
  public static String getNameEn(int status) {
    for (OnlineStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getNameEn();
      }
    }
    return "";
  }
  
}