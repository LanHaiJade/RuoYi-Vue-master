package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_machine_type
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long settingHd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long startDoor;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mergeGoods;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pickUp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setSettingHd(Long settingHd) 
    {
        this.settingHd = settingHd;
    }

    public Long getSettingHd() 
    {
        return settingHd;
    }

    public void setStartDoor(Long startDoor) 
    {
        this.startDoor = startDoor;
    }

    public Long getStartDoor() 
    {
        return startDoor;
    }

    public void setMergeGoods(Long mergeGoods) 
    {
        this.mergeGoods = mergeGoods;
    }

    public Long getMergeGoods() 
    {
        return mergeGoods;
    }

    public void setPickUp(Long pickUp) 
    {
        this.pickUp = pickUp;
    }

    public Long getPickUp() 
    {
        return pickUp;
    }

    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
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
            .append("name", getName())
            .append("userId", getUserId())
            .append("settingHd", getSettingHd())
            .append("startDoor", getStartDoor())
            .append("mergeGoods", getMergeGoods())
            .append("pickUp", getPickUp())
            .append("sort", getSort())
            .append("status", getStatus())
            .toString();
    }
}
