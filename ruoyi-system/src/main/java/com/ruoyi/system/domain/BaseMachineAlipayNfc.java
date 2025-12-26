package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_machine_alipay_nfc
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineAlipayNfc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer machineId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nfcId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transactionId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }

    public void setMachineId(Integer machineId) 
    {
        this.machineId = machineId;
    }

    public Integer getMachineId() 
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

    public void setNfcId(String nfcId) 
    {
        this.nfcId = nfcId;
    }

    public String getNfcId() 
    {
        return nfcId;
    }

    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("machineId", getMachineId())
            .append("sbId", getSbId())
            .append("nfcId", getNfcId())
            .append("transactionId", getTransactionId())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
