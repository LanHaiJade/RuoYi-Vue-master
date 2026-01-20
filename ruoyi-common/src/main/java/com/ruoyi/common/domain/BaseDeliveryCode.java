package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 【请填写功能名称】对象 base_delivery_code
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseDeliveryCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId; //设备号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deliveryInfo; //使用后出货详情

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deliveryCode; //提货码

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status; //状态0未使用，1、3已使用，4已过期

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date startTime; //有效起始时间

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endTime; //有效结束时间

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId; //运营商id

    /** 已选货道（多个逗号间隔） */
    @Excel(name = "已选货道", readConverterExp = "多=个逗号间隔")
    private String huodaos; //提货码所选设备货道号多个“,”间隔

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mtOrder;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setDeliveryInfo(String deliveryInfo) 
    {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryInfo() 
    {
        return deliveryInfo;
    }

    public void setDeliveryCode(String deliveryCode) 
    {
        this.deliveryCode = deliveryCode;
    }

    public String getDeliveryCode() 
    {
        return deliveryCode;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setHuodaos(String huodaos) 
    {
        this.huodaos = huodaos;
    }

    public String getHuodaos() 
    {
        return huodaos;
    }

    public void setMtOrder(String mtOrder) 
    {
        this.mtOrder = mtOrder;
    }

    public String getMtOrder() 
    {
        return mtOrder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("deliveryInfo", getDeliveryInfo())
            .append("deliveryCode", getDeliveryCode())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("huodaos", getHuodaos())
            .append("mtOrder", getMtOrder())
            .toString();
    }
}
