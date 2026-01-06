package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_active_setting
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseActiveSetting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long machineId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String huodaoArray;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String huodaoHex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long huodaoCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long machineType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long activeType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long type;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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

    public void setHuodaoArray(String huodaoArray) 
    {
        this.huodaoArray = huodaoArray;
    }

    public String getHuodaoArray() 
    {
        return huodaoArray;
    }

    public void setHuodaoHex(String huodaoHex) 
    {
        this.huodaoHex = huodaoHex;
    }

    public String getHuodaoHex() 
    {
        return huodaoHex;
    }

    public void setHuodaoCount(Long huodaoCount) 
    {
        this.huodaoCount = huodaoCount;
    }

    public Long getHuodaoCount() 
    {
        return huodaoCount;
    }

    public void setMachineType(Long machineType) 
    {
        this.machineType = machineType;
    }

    public Long getMachineType() 
    {
        return machineType;
    }

    public void setActiveType(Long activeType) 
    {
        this.activeType = activeType;
    }

    public Long getActiveType() 
    {
        return activeType;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("machineId", getMachineId())
            .append("sbId", getSbId())
            .append("huodaoArray", getHuodaoArray())
            .append("huodaoHex", getHuodaoHex())
            .append("huodaoCount", getHuodaoCount())
            .append("machineType", getMachineType())
            .append("activeType", getActiveType())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("type", getType())
            .toString();
    }
}
