package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_machine_unit_status
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineUnitStatus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer zbqStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ybqStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer zbqNum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ybqNum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter1Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter1Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter2Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter2Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter3Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter3Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter4Mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter4Ter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kzb1Stauts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kzb2Stauts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kzb3Stauts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kzb4Stauts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer xjbStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sjb1Status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sjb2Status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sjb3Status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sjb4Status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer downStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer stockStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer mergeStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer rebateStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer dhStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kzb1Version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kzb2Version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kzb3Version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kzb4Version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ter1Set;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer comStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer fanStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer dpSet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ddSet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enable;

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

    public void setZbqStatus(Integer zbqStatus) 
    {
        this.zbqStatus = zbqStatus;
    }

    public Integer getZbqStatus() 
    {
        return zbqStatus;
    }

    public void setYbqStatus(Integer ybqStatus) 
    {
        this.ybqStatus = ybqStatus;
    }

    public Integer getYbqStatus() 
    {
        return ybqStatus;
    }

    public void setZbqNum(Integer zbqNum) 
    {
        this.zbqNum = zbqNum;
    }

    public Integer getZbqNum() 
    {
        return zbqNum;
    }

    public void setYbqNum(Integer ybqNum) 
    {
        this.ybqNum = ybqNum;
    }

    public Integer getYbqNum() 
    {
        return ybqNum;
    }

    public void setTer1Mode(Integer ter1Mode) 
    {
        this.ter1Mode = ter1Mode;
    }

    public Integer getTer1Mode() 
    {
        return ter1Mode;
    }

    public void setTer1Ter(Integer ter1Ter) 
    {
        this.ter1Ter = ter1Ter;
    }

    public Integer getTer1Ter() 
    {
        return ter1Ter;
    }

    public void setTer2Mode(Integer ter2Mode) 
    {
        this.ter2Mode = ter2Mode;
    }

    public Integer getTer2Mode() 
    {
        return ter2Mode;
    }

    public void setTer2Ter(Integer ter2Ter) 
    {
        this.ter2Ter = ter2Ter;
    }

    public Integer getTer2Ter() 
    {
        return ter2Ter;
    }

    public void setTer3Mode(Integer ter3Mode) 
    {
        this.ter3Mode = ter3Mode;
    }

    public Integer getTer3Mode() 
    {
        return ter3Mode;
    }

    public void setTer3Ter(Integer ter3Ter) 
    {
        this.ter3Ter = ter3Ter;
    }

    public Integer getTer3Ter() 
    {
        return ter3Ter;
    }

    public void setTer4Mode(Integer ter4Mode) 
    {
        this.ter4Mode = ter4Mode;
    }

    public Integer getTer4Mode() 
    {
        return ter4Mode;
    }

    public void setTer4Ter(Integer ter4Ter) 
    {
        this.ter4Ter = ter4Ter;
    }

    public Integer getTer4Ter() 
    {
        return ter4Ter;
    }

    public void setKzb1Stauts(Integer kzb1Stauts) 
    {
        this.kzb1Stauts = kzb1Stauts;
    }

    public Integer getKzb1Stauts() 
    {
        return kzb1Stauts;
    }

    public void setKzb2Stauts(Integer kzb2Stauts) 
    {
        this.kzb2Stauts = kzb2Stauts;
    }

    public Integer getKzb2Stauts() 
    {
        return kzb2Stauts;
    }

    public void setKzb3Stauts(Integer kzb3Stauts) 
    {
        this.kzb3Stauts = kzb3Stauts;
    }

    public Integer getKzb3Stauts() 
    {
        return kzb3Stauts;
    }

    public void setKzb4Stauts(Integer kzb4Stauts) 
    {
        this.kzb4Stauts = kzb4Stauts;
    }

    public Integer getKzb4Stauts() 
    {
        return kzb4Stauts;
    }

    public void setXjbStatus(Integer xjbStatus) 
    {
        this.xjbStatus = xjbStatus;
    }

    public Integer getXjbStatus() 
    {
        return xjbStatus;
    }

    public void setSjb1Status(Integer sjb1Status) 
    {
        this.sjb1Status = sjb1Status;
    }

    public Integer getSjb1Status() 
    {
        return sjb1Status;
    }

    public void setSjb2Status(Integer sjb2Status) 
    {
        this.sjb2Status = sjb2Status;
    }

    public Integer getSjb2Status() 
    {
        return sjb2Status;
    }

    public void setSjb3Status(Integer sjb3Status) 
    {
        this.sjb3Status = sjb3Status;
    }

    public Integer getSjb3Status() 
    {
        return sjb3Status;
    }

    public void setSjb4Status(Integer sjb4Status) 
    {
        this.sjb4Status = sjb4Status;
    }

    public Integer getSjb4Status() 
    {
        return sjb4Status;
    }

    public void setDownStatus(Integer downStatus) 
    {
        this.downStatus = downStatus;
    }

    public Integer getDownStatus() 
    {
        return downStatus;
    }

    public void setStockStatus(Integer stockStatus) 
    {
        this.stockStatus = stockStatus;
    }

    public Integer getStockStatus() 
    {
        return stockStatus;
    }

    public void setMergeStatus(Integer mergeStatus) 
    {
        this.mergeStatus = mergeStatus;
    }

    public Integer getMergeStatus() 
    {
        return mergeStatus;
    }

    public void setRebateStatus(Integer rebateStatus) 
    {
        this.rebateStatus = rebateStatus;
    }

    public Integer getRebateStatus() 
    {
        return rebateStatus;
    }

    public void setDhStatus(Integer dhStatus) 
    {
        this.dhStatus = dhStatus;
    }

    public Integer getDhStatus() 
    {
        return dhStatus;
    }

    public void setKzb1Version(String kzb1Version) 
    {
        this.kzb1Version = kzb1Version;
    }

    public String getKzb1Version() 
    {
        return kzb1Version;
    }

    public void setKzb2Version(String kzb2Version) 
    {
        this.kzb2Version = kzb2Version;
    }

    public String getKzb2Version() 
    {
        return kzb2Version;
    }

    public void setKzb3Version(String kzb3Version) 
    {
        this.kzb3Version = kzb3Version;
    }

    public String getKzb3Version() 
    {
        return kzb3Version;
    }

    public void setKzb4Version(String kzb4Version) 
    {
        this.kzb4Version = kzb4Version;
    }

    public String getKzb4Version() 
    {
        return kzb4Version;
    }

    public void setTer1Set(Integer ter1Set) 
    {
        this.ter1Set = ter1Set;
    }

    public Integer getTer1Set() 
    {
        return ter1Set;
    }

    public void setComStatus(Integer comStatus) 
    {
        this.comStatus = comStatus;
    }

    public Integer getComStatus() 
    {
        return comStatus;
    }

    public void setFanStatus(Integer fanStatus) 
    {
        this.fanStatus = fanStatus;
    }

    public Integer getFanStatus() 
    {
        return fanStatus;
    }

    public void setDpSet(Integer dpSet) 
    {
        this.dpSet = dpSet;
    }

    public Integer getDpSet() 
    {
        return dpSet;
    }

    public void setDdSet(Integer ddSet) 
    {
        this.ddSet = ddSet;
    }

    public Integer getDdSet() 
    {
        return ddSet;
    }

    public void setEnable(Integer enable) 
    {
        this.enable = enable;
    }

    public Integer getEnable() 
    {
        return enable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("zbqStatus", getZbqStatus())
            .append("ybqStatus", getYbqStatus())
            .append("zbqNum", getZbqNum())
            .append("ybqNum", getYbqNum())
            .append("ter1Mode", getTer1Mode())
            .append("ter1Ter", getTer1Ter())
            .append("ter2Mode", getTer2Mode())
            .append("ter2Ter", getTer2Ter())
            .append("ter3Mode", getTer3Mode())
            .append("ter3Ter", getTer3Ter())
            .append("ter4Mode", getTer4Mode())
            .append("ter4Ter", getTer4Ter())
            .append("kzb1Stauts", getKzb1Stauts())
            .append("kzb2Stauts", getKzb2Stauts())
            .append("kzb3Stauts", getKzb3Stauts())
            .append("kzb4Stauts", getKzb4Stauts())
            .append("xjbStatus", getXjbStatus())
            .append("sjb1Status", getSjb1Status())
            .append("sjb2Status", getSjb2Status())
            .append("sjb3Status", getSjb3Status())
            .append("sjb4Status", getSjb4Status())
            .append("downStatus", getDownStatus())
            .append("stockStatus", getStockStatus())
            .append("mergeStatus", getMergeStatus())
            .append("rebateStatus", getRebateStatus())
            .append("dhStatus", getDhStatus())
            .append("kzb1Version", getKzb1Version())
            .append("kzb2Version", getKzb2Version())
            .append("kzb3Version", getKzb3Version())
            .append("kzb4Version", getKzb4Version())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("ter1Set", getTer1Set())
            .append("comStatus", getComStatus())
            .append("fanStatus", getFanStatus())
            .append("dpSet", getDpSet())
            .append("ddSet", getDdSet())
            .append("enable", getEnable())
            .toString();
    }
}
