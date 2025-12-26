package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 监控续费充值记录对象 base_machine_monitor_recharge
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineMonitorRecharge extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 设备表ID */
    @Excel(name = "设备表ID")
    private Long machineId;

    /** 设备号 */
    @Excel(name = "设备号")
    private String sbId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String sbName;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 天数 */
    @Excel(name = "天数")
    private Long day;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 状态（0：未上传，1：已上传） */
    @Excel(name = "状态", readConverterExp = "0=：未上传，1：已上传")
    private Integer status;

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

    public void setMachineId(Long machineId) 
    {
        this.machineId = machineId;
    }

    public Long getMachineId() 
    {
        return machineId;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setSbName(String sbName) 
    {
        this.sbName = sbName;
    }

    public String getSbName() 
    {
        return sbName;
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

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("machineId", getMachineId())
            .append("sbId", getSbId())
            .append("sbName", getSbName())
            .append("userId", getUserId())
            .append("day", getDay())
            .append("amount", getAmount())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
