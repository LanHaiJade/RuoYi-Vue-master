package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_iccard_recharge
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseIccardRecharge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 充值前金额 */
    @Excel(name = "充值前金额")
    private BigDecimal afterRechargeAmount;

    /** 充值后金额 */
    @Excel(name = "充值后金额")
    private BigDecimal beforeRechargeAmount;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private BigDecimal rechargeAmount;

    /** 卡号 */
    @Excel(name = "卡号")
    private String cardNumber;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer payType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer payStatus;

    /** 操作人 */
    @Excel(name = "操作人")
    private Long ctrlUserId;

    /** 操作人姓名 */
    @Excel(name = "操作人姓名")
    private String ctrlUserName;

    /** 卡名称 */
    @Excel(name = "卡名称")
    private String cpuNo;

    /** 赠送金额 */
    @Excel(name = "赠送金额")
    private BigDecimal giftAmount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setAfterRechargeAmount(BigDecimal afterRechargeAmount) 
    {
        this.afterRechargeAmount = afterRechargeAmount;
    }

    public BigDecimal getAfterRechargeAmount() 
    {
        return afterRechargeAmount;
    }

    public void setBeforeRechargeAmount(BigDecimal beforeRechargeAmount) 
    {
        this.beforeRechargeAmount = beforeRechargeAmount;
    }

    public BigDecimal getBeforeRechargeAmount() 
    {
        return beforeRechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getRechargeAmount() 
    {
        return rechargeAmount;
    }

    public void setCardNumber(String cardNumber) 
    {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() 
    {
        return cardNumber;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setPayType(Integer payType) 
    {
        this.payType = payType;
    }

    public Integer getPayType() 
    {
        return payType;
    }

    public void setPayStatus(Integer payStatus) 
    {
        this.payStatus = payStatus;
    }

    public Integer getPayStatus() 
    {
        return payStatus;
    }

    public void setCtrlUserId(Long ctrlUserId) 
    {
        this.ctrlUserId = ctrlUserId;
    }

    public Long getCtrlUserId() 
    {
        return ctrlUserId;
    }

    public void setCtrlUserName(String ctrlUserName) 
    {
        this.ctrlUserName = ctrlUserName;
    }

    public String getCtrlUserName() 
    {
        return ctrlUserName;
    }

    public void setCpuNo(String cpuNo) 
    {
        this.cpuNo = cpuNo;
    }

    public String getCpuNo() 
    {
        return cpuNo;
    }

    public void setGiftAmount(BigDecimal giftAmount) 
    {
        this.giftAmount = giftAmount;
    }

    public BigDecimal getGiftAmount() 
    {
        return giftAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("afterRechargeAmount", getAfterRechargeAmount())
            .append("beforeRechargeAmount", getBeforeRechargeAmount())
            .append("rechargeAmount", getRechargeAmount())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("cardNumber", getCardNumber())
            .append("userId", getUserId())
            .append("orderNo", getOrderNo())
            .append("payType", getPayType())
            .append("payStatus", getPayStatus())
            .append("ctrlUserId", getCtrlUserId())
            .append("ctrlUserName", getCtrlUserName())
            .append("cpuNo", getCpuNo())
            .append("remark", getRemark())
            .append("giftAmount", getGiftAmount())
            .toString();
    }
}
