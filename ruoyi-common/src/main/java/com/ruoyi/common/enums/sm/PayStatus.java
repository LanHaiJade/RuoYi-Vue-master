package com.ruoyi.common.enums.sm;

import com.ruoyi.common.utils.sm.StringUtil;

/**
 * 支付状态
 * 类名称：PayStatus
 * 修改人：liduo
 * 修改时间：2020年11月4日 上午11:41:58
 * 修改备注：
 */
public enum PayStatus
{
  Record(-1, "支付记录"), 
  UnPay(0, "未支付"), 
  HasPay(1, "已支付"), 
  FailPay(2, "支付失败"), 
  Close(4, "已关闭"), 

  UnRefund(5, "未退款"), 
  ApplyRefund(6, "退款申请中"), 
  Refund(7, "退款中"), 
  HasRefund(8, "已退款"), 
  FailRefund(9, "退款失败"),
  HasHalfRefund(10, "已部分退款"),
  ;

  private int status;
  private String name;

  private PayStatus(int status, String name) {
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
    for (PayStatus us : values()) {
      if (StringUtil.equals(name, us.getName())) {
        return us.getStatus();
      }
    }
    return UnPay.getStatus();
  }

  public static String getName(int status) {
    for (PayStatus us : values()) {
      if (us.getStatus() == status) {
        return us.getName();
      }
    }
    return UnPay.getName();
  }
}