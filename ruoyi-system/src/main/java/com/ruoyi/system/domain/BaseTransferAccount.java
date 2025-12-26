package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_transfer_account
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseTransferAccount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String monthDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal plamount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal jtamount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String openId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String payeeRealname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String payeeAccount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String payerRealname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transactionId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String reason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasNotice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payChannelType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long subMch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amountWkf;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal ratedis;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amountRatedis;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setMonthDate(String monthDate) 
    {
        this.monthDate = monthDate;
    }

    public String getMonthDate() 
    {
        return monthDate;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setPayType(Long payType) 
    {
        this.payType = payType;
    }

    public Long getPayType() 
    {
        return payType;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setPlamount(BigDecimal plamount) 
    {
        this.plamount = plamount;
    }

    public BigDecimal getPlamount() 
    {
        return plamount;
    }

    public void setJtamount(BigDecimal jtamount) 
    {
        this.jtamount = jtamount;
    }

    public BigDecimal getJtamount() 
    {
        return jtamount;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    public void setPayeeRealname(String payeeRealname) 
    {
        this.payeeRealname = payeeRealname;
    }

    public String getPayeeRealname() 
    {
        return payeeRealname;
    }

    public void setPayeeAccount(String payeeAccount) 
    {
        this.payeeAccount = payeeAccount;
    }

    public String getPayeeAccount() 
    {
        return payeeAccount;
    }

    public void setPayerRealname(String payerRealname) 
    {
        this.payerRealname = payerRealname;
    }

    public String getPayerRealname() 
    {
        return payerRealname;
    }

    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }

    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }

    public void setHasNotice(Long hasNotice) 
    {
        this.hasNotice = hasNotice;
    }

    public Long getHasNotice() 
    {
        return hasNotice;
    }

    public void setPayChannelType(Long payChannelType) 
    {
        this.payChannelType = payChannelType;
    }

    public Long getPayChannelType() 
    {
        return payChannelType;
    }

    public void setSubMch(Long subMch) 
    {
        this.subMch = subMch;
    }

    public Long getSubMch() 
    {
        return subMch;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setAmountWkf(BigDecimal amountWkf) 
    {
        this.amountWkf = amountWkf;
    }

    public BigDecimal getAmountWkf() 
    {
        return amountWkf;
    }

    public void setRatedis(BigDecimal ratedis) 
    {
        this.ratedis = ratedis;
    }

    public BigDecimal getRatedis() 
    {
        return ratedis;
    }

    public void setAmountRatedis(BigDecimal amountRatedis) 
    {
        this.amountRatedis = amountRatedis;
    }

    public BigDecimal getAmountRatedis() 
    {
        return amountRatedis;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("monthDate", getMonthDate())
            .append("userId", getUserId())
            .append("payType", getPayType())
            .append("amount", getAmount())
            .append("plamount", getPlamount())
            .append("jtamount", getJtamount())
            .append("openId", getOpenId())
            .append("payeeRealname", getPayeeRealname())
            .append("payeeAccount", getPayeeAccount())
            .append("payerRealname", getPayerRealname())
            .append("transactionId", getTransactionId())
            .append("remark", getRemark())
            .append("reason", getReason())
            .append("hasNotice", getHasNotice())
            .append("payChannelType", getPayChannelType())
            .append("subMch", getSubMch())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("amountWkf", getAmountWkf())
            .append("ratedis", getRatedis())
            .append("amountRatedis", getAmountRatedis())
            .toString();
    }
}
