package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 base_recharge
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseRecharge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String machineIds;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long day;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer pm;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amountL;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amountF;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transactionId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amountAll;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer invoiceStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String invoiceUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String invoiceType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String invoiceName;

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

    public void setMachineIds(String machineIds) 
    {
        this.machineIds = machineIds;
    }

    public String getMachineIds() 
    {
        return machineIds;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setDay(Long day) 
    {
        this.day = day;
    }

    public Long getDay() 
    {
        return day;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setPm(Integer pm) 
    {
        this.pm = pm;
    }

    public Integer getPm() 
    {
        return pm;
    }

    public void setAmountL(BigDecimal amountL) 
    {
        this.amountL = amountL;
    }

    public BigDecimal getAmountL() 
    {
        return amountL;
    }

    public void setAmountF(BigDecimal amountF) 
    {
        this.amountF = amountF;
    }

    public BigDecimal getAmountF() 
    {
        return amountF;
    }

    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }

    public void setAmountAll(BigDecimal amountAll) 
    {
        this.amountAll = amountAll;
    }

    public BigDecimal getAmountAll() 
    {
        return amountAll;
    }

    public void setInvoiceStatus(Integer invoiceStatus) 
    {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getInvoiceStatus() 
    {
        return invoiceStatus;
    }

    public void setInvoiceUrl(String invoiceUrl) 
    {
        this.invoiceUrl = invoiceUrl;
    }

    public String getInvoiceUrl() 
    {
        return invoiceUrl;
    }

    public void setInvoiceType(String invoiceType) 
    {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() 
    {
        return invoiceType;
    }

    public void setInvoiceName(String invoiceName) 
    {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName() 
    {
        return invoiceName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("machineIds", getMachineIds())
            .append("userId", getUserId())
            .append("day", getDay())
            .append("amount", getAmount())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("pm", getPm())
            .append("amountL", getAmountL())
            .append("amountF", getAmountF())
            .append("transactionId", getTransactionId())
            .append("remark", getRemark())
            .append("amountAll", getAmountAll())
            .append("invoiceStatus", getInvoiceStatus())
            .append("invoiceUrl", getInvoiceUrl())
            .append("invoiceType", getInvoiceType())
            .append("invoiceName", getInvoiceName())
            .toString();
    }
}
