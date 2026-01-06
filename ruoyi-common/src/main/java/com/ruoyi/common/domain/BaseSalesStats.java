package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 【请填写功能名称】对象 base_sales_stats
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseSalesStats extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer allOnline;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal allAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer allCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal allPjb;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal allPjj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer alifaceOnline;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal alifaceAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer alifaceCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal alifacePjb;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal alifacePjj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal aliAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer aliCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal wxAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer wxCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal wxfaceAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer wxfaceCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal wxhandAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer wxhandCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal icAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer icCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal ghlAmount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ghlCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date statsTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setAllOnline(Integer allOnline) 
    {
        this.allOnline = allOnline;
    }

    public Integer getAllOnline() 
    {
        return allOnline;
    }

    public void setAllAmount(BigDecimal allAmount) 
    {
        this.allAmount = allAmount;
    }

    public BigDecimal getAllAmount() 
    {
        return allAmount;
    }

    public void setAllCount(Integer allCount) 
    {
        this.allCount = allCount;
    }

    public Integer getAllCount() 
    {
        return allCount;
    }

    public void setAllPjb(BigDecimal allPjb) 
    {
        this.allPjb = allPjb;
    }

    public BigDecimal getAllPjb() 
    {
        return allPjb;
    }

    public void setAllPjj(BigDecimal allPjj) 
    {
        this.allPjj = allPjj;
    }

    public BigDecimal getAllPjj() 
    {
        return allPjj;
    }

    public void setAlifaceOnline(Integer alifaceOnline) 
    {
        this.alifaceOnline = alifaceOnline;
    }

    public Integer getAlifaceOnline() 
    {
        return alifaceOnline;
    }

    public void setAlifaceAmount(BigDecimal alifaceAmount) 
    {
        this.alifaceAmount = alifaceAmount;
    }

    public BigDecimal getAlifaceAmount() 
    {
        return alifaceAmount;
    }

    public void setAlifaceCount(Integer alifaceCount) 
    {
        this.alifaceCount = alifaceCount;
    }

    public Integer getAlifaceCount() 
    {
        return alifaceCount;
    }

    public void setAlifacePjb(BigDecimal alifacePjb) 
    {
        this.alifacePjb = alifacePjb;
    }

    public BigDecimal getAlifacePjb() 
    {
        return alifacePjb;
    }

    public void setAlifacePjj(BigDecimal alifacePjj) 
    {
        this.alifacePjj = alifacePjj;
    }

    public BigDecimal getAlifacePjj() 
    {
        return alifacePjj;
    }

    public void setAliAmount(BigDecimal aliAmount) 
    {
        this.aliAmount = aliAmount;
    }

    public BigDecimal getAliAmount() 
    {
        return aliAmount;
    }

    public void setAliCount(Integer aliCount) 
    {
        this.aliCount = aliCount;
    }

    public Integer getAliCount() 
    {
        return aliCount;
    }

    public void setWxAmount(BigDecimal wxAmount) 
    {
        this.wxAmount = wxAmount;
    }

    public BigDecimal getWxAmount() 
    {
        return wxAmount;
    }

    public void setWxCount(Integer wxCount) 
    {
        this.wxCount = wxCount;
    }

    public Integer getWxCount() 
    {
        return wxCount;
    }

    public void setWxfaceAmount(BigDecimal wxfaceAmount) 
    {
        this.wxfaceAmount = wxfaceAmount;
    }

    public BigDecimal getWxfaceAmount() 
    {
        return wxfaceAmount;
    }

    public void setWxfaceCount(Integer wxfaceCount) 
    {
        this.wxfaceCount = wxfaceCount;
    }

    public Integer getWxfaceCount() 
    {
        return wxfaceCount;
    }

    public void setWxhandAmount(BigDecimal wxhandAmount) 
    {
        this.wxhandAmount = wxhandAmount;
    }

    public BigDecimal getWxhandAmount() 
    {
        return wxhandAmount;
    }

    public void setWxhandCount(Integer wxhandCount) 
    {
        this.wxhandCount = wxhandCount;
    }

    public Integer getWxhandCount() 
    {
        return wxhandCount;
    }

    public void setIcAmount(BigDecimal icAmount) 
    {
        this.icAmount = icAmount;
    }

    public BigDecimal getIcAmount() 
    {
        return icAmount;
    }

    public void setIcCount(Integer icCount) 
    {
        this.icCount = icCount;
    }

    public Integer getIcCount() 
    {
        return icCount;
    }

    public void setGhlAmount(BigDecimal ghlAmount) 
    {
        this.ghlAmount = ghlAmount;
    }

    public BigDecimal getGhlAmount() 
    {
        return ghlAmount;
    }

    public void setGhlCount(Integer ghlCount) 
    {
        this.ghlCount = ghlCount;
    }

    public Integer getGhlCount() 
    {
        return ghlCount;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setStatsTime(Date statsTime) 
    {
        this.statsTime = statsTime;
    }

    public Date getStatsTime() 
    {
        return statsTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("allOnline", getAllOnline())
            .append("allAmount", getAllAmount())
            .append("allCount", getAllCount())
            .append("allPjb", getAllPjb())
            .append("allPjj", getAllPjj())
            .append("alifaceOnline", getAlifaceOnline())
            .append("alifaceAmount", getAlifaceAmount())
            .append("alifaceCount", getAlifaceCount())
            .append("alifacePjb", getAlifacePjb())
            .append("alifacePjj", getAlifacePjj())
            .append("aliAmount", getAliAmount())
            .append("aliCount", getAliCount())
            .append("wxAmount", getWxAmount())
            .append("wxCount", getWxCount())
            .append("wxfaceAmount", getWxfaceAmount())
            .append("wxfaceCount", getWxfaceCount())
            .append("wxhandAmount", getWxhandAmount())
            .append("wxhandCount", getWxhandCount())
            .append("icAmount", getIcAmount())
            .append("icCount", getIcCount())
            .append("ghlAmount", getGhlAmount())
            .append("ghlCount", getGhlCount())
            .append("type", getType())
            .append("statsTime", getStatsTime())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
