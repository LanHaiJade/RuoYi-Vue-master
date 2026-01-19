package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 支付类型
 * 类名称：PayType
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:47:15
 * 修改备注：
 */
public enum PayType
{
  Cash(0, "现金"), 
  ZhiBi(1, "纸币"), 
  YingBi(2, "硬币"), 
  Alipay(3, "支付宝"), 
  WeiXin(4, "微信"), 
  Baidu(5, "百度钱包"), 
  JD(6, "京东钱包"), 
  QQ(7, "QQ钱包"), 
  Quick(8, "闪付"), 
  ICCard(9, "IC卡"), 
  Delivery(10, "货到付款"), 
  Balance(11, "余额支付"),
  meinong(12, "美农会员"),
  WeiXinFace(13,"微信刷脸"),
  JDJH(14,"京东聚合"),
  THM(15,"提货码"),
  MWX(16,"微信会员"),
  FP(17,"扶贫网"),
  AliFace(18,"支付宝刷脸"),
  GHL(19,"GHL"),//马来西亚GHL平台支付
  wxHand(20,"微信刷掌"),
  AliNfc(21,"支付宝NFC"),
  
  WeiXin_sxf(200,"JSAPI"),
  Alipay_sxf(201, "FWC");

  private int type;
  private String name;

  private PayType(int type, String name) {
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
    for (PayType us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getType();
      }
    }
    return -1;
  }

  public static String getName(int type) {
    for (PayType us : values()) {
      if (us.getType() == type) {
        return us.getName();
      }
    }
    return "";
  }
}