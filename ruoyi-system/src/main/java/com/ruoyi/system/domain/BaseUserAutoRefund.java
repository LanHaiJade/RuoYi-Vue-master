package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_user_auto_refund
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseUserAutoRefund extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer auto;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer refundNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date refundTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer maxRefundNumber;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }

    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }

    public void setAuto(Integer auto) 
    {
        this.auto = auto;
    }

    public Integer getAuto() 
    {
        return auto;
    }

    public void setNum(Integer num) 
    {
        this.num = num;
    }

    public Integer getNum() 
    {
        return num;
    }

    public void setStatus1(Integer status1) 
    {
        this.status1 = status1;
    }

    public Integer getStatus1() 
    {
        return status1;
    }

    public void setStatus2(Integer status2) 
    {
        this.status2 = status2;
    }

    public Integer getStatus2() 
    {
        return status2;
    }

    public void setStatus3(Integer status3) 
    {
        this.status3 = status3;
    }

    public Integer getStatus3() 
    {
        return status3;
    }

    public void setRefundNumber(Integer refundNumber) 
    {
        this.refundNumber = refundNumber;
    }

    public Integer getRefundNumber() 
    {
        return refundNumber;
    }

    public void setRefundTime(Date refundTime) 
    {
        this.refundTime = refundTime;
    }

    public Date getRefundTime() 
    {
        return refundTime;
    }

    public void setMaxRefundNumber(Integer maxRefundNumber) 
    {
        this.maxRefundNumber = maxRefundNumber;
    }

    public Integer getMaxRefundNumber() 
    {
        return maxRefundNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("auto", getAuto())
            .append("num", getNum())
            .append("status1", getStatus1())
            .append("status2", getStatus2())
            .append("status3", getStatus3())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("refundNumber", getRefundNumber())
            .append("refundTime", getRefundTime())
            .append("maxRefundNumber", getMaxRefundNumber())
            .toString();
    }
}
