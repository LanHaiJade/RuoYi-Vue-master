package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合约机信息对象 base_machine_contract
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String sbId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String sbName;

    /** 合约到期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合约到期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 解除合约金额 */
    @Excel(name = "解除合约金额")
    private BigDecimal price;

    /** 签约状态1签约0未签约 */
    @Excel(name = "签约状态1签约0未签约")
    private Long status;

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

    public void setSbName(String sbName) 
    {
        this.sbName = sbName;
    }

    public String getSbName() 
    {
        return sbName;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("sbName", getSbName())
            .append("endTime", getEndTime())
            .append("price", getPrice())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .toString();
    }
}
