package com.ruoyi.common.enums.sm;


import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 设备类型
 * 类名称：MachineType
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:28:36
 * 修改备注：
 */
public enum MachineType
{
  CR(1, "成人机","Adult machine"),
  JD(2, "酒店机","Hotel Machine"),
  YL(3, "饮料机","Beverage Machine"),
  GZG(4, "格子柜可开门","Lattice Machine"),
  WXSL(5, "微信刷脸","WeChat Face Recognition"),
  THJ(6, "弹簧机","Spring Machine"),
  BJL(8,"冰激凌机","Ice cream Machine"),
  CQJ(9,"抽签机","Draw Lots Machine"),
  KZJ(10,"口罩机","Face Mask Machine"),
  AZJ(11,"安卓机","Android Machine"),
  ALISL(12,"支付宝刷脸","Alipay Face Recognition"),
  SL30(13,"30货道刷脸合约机","30-Lane Facial Recognition Contract Machine"),
  SL60(14,"60货道刷脸合约机","60-Lane Facial Recognition Contract Machine"),
  ER30(15,"30货道合约机","30-Lane Contract Machine"),
  ER60(16,"60货道合约机","60-Lane Contract Machine"),
  PBJ(17,"拍报机","Newspaper Machine"),
  
  
  
  SL30_ZG(131,"30货道刷脸合约机","30-Lane Facial Recognition Contract Machine"),
  SL60_ZG(141,"60货道刷脸合约机","60-Lane Facial Recognition Contract Machine"),
  ;

  private int type;
  private String name;
  private String english_name;

  private MachineType(int type, String name,String english_name) {
    this.type = type;
    this.name = name;
    this.english_name=english_name;
  }

  public int getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  public String getEnglish_name() {
  return this.english_name;
}


  public static int getType(String name) {
    for (MachineType us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getType();
      }
    }
    return 0;
  }

  public static String getName(int type) {
    for (MachineType us : values()) {
      if (us.getType() == type) {
        return us.getName();
      }
    }
    return "";
  }

  public static String getEnglishName(int type) {
    for (MachineType us : values()) {
      if (us.getType() == type) {
        return us.getEnglish_name();
      }
    }
    return "";
  }
}