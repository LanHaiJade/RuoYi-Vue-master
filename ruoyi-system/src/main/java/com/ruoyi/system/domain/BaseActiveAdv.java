package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_active_adv
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseActiveAdv extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String advUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String advTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer belongType;

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

    public void setAdvUrl(String advUrl) 
    {
        this.advUrl = advUrl;
    }

    public String getAdvUrl() 
    {
        return advUrl;
    }

    public void setAdvTime(String advTime) 
    {
        this.advTime = advTime;
    }

    public String getAdvTime() 
    {
        return advTime;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setBelongType(Integer belongType) 
    {
        this.belongType = belongType;
    }

    public Integer getBelongType() 
    {
        return belongType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("advUrl", getAdvUrl())
            .append("advTime", getAdvTime())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("belongType", getBelongType())
            .toString();
    }
}
