package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_iccard
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseIccard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cpuNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal balance;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phone;

    /** 操作人 */
    @Excel(name = "操作人")
    private Long ctrlUserId;

    /** 操作人姓名 */
    @Excel(name = "操作人姓名")
    private String ctrlUserName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setIdNo(String idNo) 
    {
        this.idNo = idNo;
    }

    public String getIdNo() 
    {
        return idNo;
    }

    public void setCpuNo(String cpuNo) 
    {
        this.cpuNo = cpuNo;
    }

    public String getCpuNo() 
    {
        return cpuNo;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setBalance(BigDecimal balance) 
    {
        this.balance = balance;
    }

    public BigDecimal getBalance() 
    {
        return balance;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setCtrlUserId(Long ctrlUserId) 
    {
        this.ctrlUserId = ctrlUserId;
    }

    public Long getCtrlUserId() 
    {
        return ctrlUserId;
    }

    public void setCtrlUserName(String ctrlUserName) 
    {
        this.ctrlUserName = ctrlUserName;
    }

    public String getCtrlUserName() 
    {
        return ctrlUserName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("idNo", getIdNo())
            .append("cpuNo", getCpuNo())
            .append("userId", getUserId())
            .append("name", getName())
            .append("status", getStatus())
            .append("balance", getBalance())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("phone", getPhone())
            .append("ctrlUserId", getCtrlUserId())
            .append("ctrlUserName", getCtrlUserName())
            .append("remark", getRemark())
            .toString();
    }
}
