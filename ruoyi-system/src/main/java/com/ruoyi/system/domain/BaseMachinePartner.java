package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_machine_partner
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachinePartner extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long userId;

    /** $column.columnComment */
    private Long machineId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer roleType;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setMachineId(Long machineId) 
    {
        this.machineId = machineId;
    }

    public Long getMachineId() 
    {
        return machineId;
    }

    public void setRoleType(Integer roleType) 
    {
        this.roleType = roleType;
    }

    public Integer getRoleType() 
    {
        return roleType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("machineId", getMachineId())
            .append("roleType", getRoleType())
            .toString();
    }
}
