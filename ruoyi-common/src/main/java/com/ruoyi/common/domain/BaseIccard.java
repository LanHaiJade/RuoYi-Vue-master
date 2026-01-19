package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.domain.BaseVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.List;

/**
 * 【IC卡信息表】对象 base_iccard
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseIccard extends BaseVo
{
    private static final long serialVersionUID = 1L;

    
    /*private Long id;//自增唯一id*/

    
    @Excel(name = "卡号", width = 20)
    private String idNo;//IC卡卡号

    
    @Excel(name = "卡名称", width = 15)
    private String cpuNo;//IC卡名称

    
    /*@Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;//所属运营商id*/

    
    @Excel(name = "姓名",width = 10)
    private String name;//姓名

    
    private Long status;//IC卡状态：0正常4禁用5销卡

    
    @Excel(name = "金额", width = 12)
    private BigDecimal balance;//IC卡余额

    
    @Excel(name = "手机号", width = 15)
    private String phone;//手机号信息

    /** 操作人 */
    private Long ctrlUserId;//操作人id

    /** 操作人姓名 */
    private String ctrlUserName;//操作人名称

    @Excel(name = "备注", width = 20)
    private String remark;

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

    /*public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }*/

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
