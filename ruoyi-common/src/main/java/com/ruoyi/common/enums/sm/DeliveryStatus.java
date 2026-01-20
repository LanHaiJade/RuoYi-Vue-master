package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 出货状态
 * 类名称：DeliveryStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:13:24
 * 修改备注：
 */
public enum DeliveryStatus
{
  SubmitOrder(-1, "已下单"), 
  UnDelivery(0, "未出货"), 
  HasDelivery(1, "已出货"), 
  FailDelivery(2, "出货失败"), 
  ConfigDelivery(3, "出货已确认"),
  InDelivery(4,"出货中"),
  HalfDelivery(5,"部分出货"),
  ErrorDelivery(6,"出货结果未上送"),
  sonrDelivery(7,"出货通讯失败"),
  
  ;

  private int status;
  private String name;

  private DeliveryStatus(int status, String name) {
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
    for (DeliveryStatus us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getStatus();
      }
    }
    return -1;
  }

  public static String getName(int status) {
    for (DeliveryStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getName();
      }
    }
    return null;
  }
}