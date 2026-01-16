package com.ruoyi.common.domain.dto;


import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 会员卡充值接收数据类
 */
public class RechargeIcDto{

    // 会员卡ID
    private List<Long> ids;


    // 会员卡充值金额
    private String amount;

    //操作人
    private Long ctrlUserId;

    // 卡状态，只在修改卡状态时使用
    private Long status;


    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getCtrlUserId() {
        return ctrlUserId;
    }

    public void setCtrlUserId(Long ctrlUserId) {
        this.ctrlUserId = ctrlUserId;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
