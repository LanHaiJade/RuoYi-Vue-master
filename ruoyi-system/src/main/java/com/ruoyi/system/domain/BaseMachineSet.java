package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_machine_set
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG1Time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z1Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z1Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z2Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z2Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z3Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z3Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z4Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG1Z4Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG2Time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z1Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z1Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z2Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z2Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z3Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z3Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z4Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG2Z4Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG3Time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z1Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z1Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z2Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z2Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z3Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z3Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z4Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer terG3Z4Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer cartType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer light;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startTime1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endTime1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startTime2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endTime2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startTime3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endTime3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer hdMode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG1TimeEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG2TimeEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String terG3TimeEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long humidity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sxhdmd;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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

    public void setTerG1Time(String terG1Time) 
    {
        this.terG1Time = terG1Time;
    }

    public String getTerG1Time() 
    {
        return terG1Time;
    }

    public void setTerG1Z1Mode(Integer terG1Z1Mode) 
    {
        this.terG1Z1Mode = terG1Z1Mode;
    }

    public Integer getTerG1Z1Mode() 
    {
        return terG1Z1Mode;
    }

    public void setTerG1Z1Ter(Integer terG1Z1Ter) 
    {
        this.terG1Z1Ter = terG1Z1Ter;
    }

    public Integer getTerG1Z1Ter() 
    {
        return terG1Z1Ter;
    }

    public void setTerG1Z2Mode(Integer terG1Z2Mode) 
    {
        this.terG1Z2Mode = terG1Z2Mode;
    }

    public Integer getTerG1Z2Mode() 
    {
        return terG1Z2Mode;
    }

    public void setTerG1Z2Ter(Integer terG1Z2Ter) 
    {
        this.terG1Z2Ter = terG1Z2Ter;
    }

    public Integer getTerG1Z2Ter() 
    {
        return terG1Z2Ter;
    }

    public void setTerG1Z3Mode(Integer terG1Z3Mode) 
    {
        this.terG1Z3Mode = terG1Z3Mode;
    }

    public Integer getTerG1Z3Mode() 
    {
        return terG1Z3Mode;
    }

    public void setTerG1Z3Ter(Integer terG1Z3Ter) 
    {
        this.terG1Z3Ter = terG1Z3Ter;
    }

    public Integer getTerG1Z3Ter() 
    {
        return terG1Z3Ter;
    }

    public void setTerG1Z4Mode(Integer terG1Z4Mode) 
    {
        this.terG1Z4Mode = terG1Z4Mode;
    }

    public Integer getTerG1Z4Mode() 
    {
        return terG1Z4Mode;
    }

    public void setTerG1Z4Ter(Integer terG1Z4Ter) 
    {
        this.terG1Z4Ter = terG1Z4Ter;
    }

    public Integer getTerG1Z4Ter() 
    {
        return terG1Z4Ter;
    }

    public void setTerG2Time(String terG2Time) 
    {
        this.terG2Time = terG2Time;
    }

    public String getTerG2Time() 
    {
        return terG2Time;
    }

    public void setTerG2Z1Mode(Integer terG2Z1Mode) 
    {
        this.terG2Z1Mode = terG2Z1Mode;
    }

    public Integer getTerG2Z1Mode() 
    {
        return terG2Z1Mode;
    }

    public void setTerG2Z1Ter(Integer terG2Z1Ter) 
    {
        this.terG2Z1Ter = terG2Z1Ter;
    }

    public Integer getTerG2Z1Ter() 
    {
        return terG2Z1Ter;
    }

    public void setTerG2Z2Mode(Integer terG2Z2Mode) 
    {
        this.terG2Z2Mode = terG2Z2Mode;
    }

    public Integer getTerG2Z2Mode() 
    {
        return terG2Z2Mode;
    }

    public void setTerG2Z2Ter(Integer terG2Z2Ter) 
    {
        this.terG2Z2Ter = terG2Z2Ter;
    }

    public Integer getTerG2Z2Ter() 
    {
        return terG2Z2Ter;
    }

    public void setTerG2Z3Mode(Integer terG2Z3Mode) 
    {
        this.terG2Z3Mode = terG2Z3Mode;
    }

    public Integer getTerG2Z3Mode() 
    {
        return terG2Z3Mode;
    }

    public void setTerG2Z3Ter(Integer terG2Z3Ter) 
    {
        this.terG2Z3Ter = terG2Z3Ter;
    }

    public Integer getTerG2Z3Ter() 
    {
        return terG2Z3Ter;
    }

    public void setTerG2Z4Mode(Integer terG2Z4Mode) 
    {
        this.terG2Z4Mode = terG2Z4Mode;
    }

    public Integer getTerG2Z4Mode() 
    {
        return terG2Z4Mode;
    }

    public void setTerG2Z4Ter(Integer terG2Z4Ter) 
    {
        this.terG2Z4Ter = terG2Z4Ter;
    }

    public Integer getTerG2Z4Ter() 
    {
        return terG2Z4Ter;
    }

    public void setTerG3Time(String terG3Time) 
    {
        this.terG3Time = terG3Time;
    }

    public String getTerG3Time() 
    {
        return terG3Time;
    }

    public void setTerG3Z1Mode(Integer terG3Z1Mode) 
    {
        this.terG3Z1Mode = terG3Z1Mode;
    }

    public Integer getTerG3Z1Mode() 
    {
        return terG3Z1Mode;
    }

    public void setTerG3Z1Ter(Integer terG3Z1Ter) 
    {
        this.terG3Z1Ter = terG3Z1Ter;
    }

    public Integer getTerG3Z1Ter() 
    {
        return terG3Z1Ter;
    }

    public void setTerG3Z2Mode(Integer terG3Z2Mode) 
    {
        this.terG3Z2Mode = terG3Z2Mode;
    }

    public Integer getTerG3Z2Mode() 
    {
        return terG3Z2Mode;
    }

    public void setTerG3Z2Ter(Integer terG3Z2Ter) 
    {
        this.terG3Z2Ter = terG3Z2Ter;
    }

    public Integer getTerG3Z2Ter() 
    {
        return terG3Z2Ter;
    }

    public void setTerG3Z3Mode(Integer terG3Z3Mode) 
    {
        this.terG3Z3Mode = terG3Z3Mode;
    }

    public Integer getTerG3Z3Mode() 
    {
        return terG3Z3Mode;
    }

    public void setTerG3Z3Ter(Integer terG3Z3Ter) 
    {
        this.terG3Z3Ter = terG3Z3Ter;
    }

    public Integer getTerG3Z3Ter() 
    {
        return terG3Z3Ter;
    }

    public void setTerG3Z4Mode(Integer terG3Z4Mode) 
    {
        this.terG3Z4Mode = terG3Z4Mode;
    }

    public Integer getTerG3Z4Mode() 
    {
        return terG3Z4Mode;
    }

    public void setTerG3Z4Ter(Integer terG3Z4Ter) 
    {
        this.terG3Z4Ter = terG3Z4Ter;
    }

    public Integer getTerG3Z4Ter() 
    {
        return terG3Z4Ter;
    }

    public void setCartType(Integer cartType) 
    {
        this.cartType = cartType;
    }

    public Integer getCartType() 
    {
        return cartType;
    }

    public void setLight(Integer light) 
    {
        this.light = light;
    }

    public Integer getLight() 
    {
        return light;
    }

    public void setStartTime1(String startTime1) 
    {
        this.startTime1 = startTime1;
    }

    public String getStartTime1() 
    {
        return startTime1;
    }

    public void setEndTime1(String endTime1) 
    {
        this.endTime1 = endTime1;
    }

    public String getEndTime1() 
    {
        return endTime1;
    }

    public void setStartTime2(String startTime2) 
    {
        this.startTime2 = startTime2;
    }

    public String getStartTime2() 
    {
        return startTime2;
    }

    public void setEndTime2(String endTime2) 
    {
        this.endTime2 = endTime2;
    }

    public String getEndTime2() 
    {
        return endTime2;
    }

    public void setStartTime3(String startTime3) 
    {
        this.startTime3 = startTime3;
    }

    public String getStartTime3() 
    {
        return startTime3;
    }

    public void setEndTime3(String endTime3) 
    {
        this.endTime3 = endTime3;
    }

    public String getEndTime3() 
    {
        return endTime3;
    }

    public void setHdMode(Integer hdMode) 
    {
        this.hdMode = hdMode;
    }

    public Integer getHdMode() 
    {
        return hdMode;
    }

    public void setTerG1TimeEnd(String terG1TimeEnd) 
    {
        this.terG1TimeEnd = terG1TimeEnd;
    }

    public String getTerG1TimeEnd() 
    {
        return terG1TimeEnd;
    }

    public void setTerG2TimeEnd(String terG2TimeEnd) 
    {
        this.terG2TimeEnd = terG2TimeEnd;
    }

    public String getTerG2TimeEnd() 
    {
        return terG2TimeEnd;
    }

    public void setTerG3TimeEnd(String terG3TimeEnd) 
    {
        this.terG3TimeEnd = terG3TimeEnd;
    }

    public String getTerG3TimeEnd() 
    {
        return terG3TimeEnd;
    }

    public void setHumidity(Long humidity) 
    {
        this.humidity = humidity;
    }

    public Long getHumidity() 
    {
        return humidity;
    }

    public void setSxhdmd(String sxhdmd) 
    {
        this.sxhdmd = sxhdmd;
    }

    public String getSxhdmd() 
    {
        return sxhdmd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("terG1Time", getTerG1Time())
            .append("terG1Z1Mode", getTerG1Z1Mode())
            .append("terG1Z1Ter", getTerG1Z1Ter())
            .append("terG1Z2Mode", getTerG1Z2Mode())
            .append("terG1Z2Ter", getTerG1Z2Ter())
            .append("terG1Z3Mode", getTerG1Z3Mode())
            .append("terG1Z3Ter", getTerG1Z3Ter())
            .append("terG1Z4Mode", getTerG1Z4Mode())
            .append("terG1Z4Ter", getTerG1Z4Ter())
            .append("terG2Time", getTerG2Time())
            .append("terG2Z1Mode", getTerG2Z1Mode())
            .append("terG2Z1Ter", getTerG2Z1Ter())
            .append("terG2Z2Mode", getTerG2Z2Mode())
            .append("terG2Z2Ter", getTerG2Z2Ter())
            .append("terG2Z3Mode", getTerG2Z3Mode())
            .append("terG2Z3Ter", getTerG2Z3Ter())
            .append("terG2Z4Mode", getTerG2Z4Mode())
            .append("terG2Z4Ter", getTerG2Z4Ter())
            .append("terG3Time", getTerG3Time())
            .append("terG3Z1Mode", getTerG3Z1Mode())
            .append("terG3Z1Ter", getTerG3Z1Ter())
            .append("terG3Z2Mode", getTerG3Z2Mode())
            .append("terG3Z2Ter", getTerG3Z2Ter())
            .append("terG3Z3Mode", getTerG3Z3Mode())
            .append("terG3Z3Ter", getTerG3Z3Ter())
            .append("terG3Z4Mode", getTerG3Z4Mode())
            .append("terG3Z4Ter", getTerG3Z4Ter())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("cartType", getCartType())
            .append("light", getLight())
            .append("startTime1", getStartTime1())
            .append("endTime1", getEndTime1())
            .append("startTime2", getStartTime2())
            .append("endTime2", getEndTime2())
            .append("startTime3", getStartTime3())
            .append("endTime3", getEndTime3())
            .append("hdMode", getHdMode())
            .append("terG1TimeEnd", getTerG1TimeEnd())
            .append("terG2TimeEnd", getTerG2TimeEnd())
            .append("terG3TimeEnd", getTerG3TimeEnd())
            .append("humidity", getHumidity())
            .append("sxhdmd", getSxhdmd())
            .toString();
    }
}
