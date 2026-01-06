package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 设备参数对象 base_machine_params
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineParams extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String sbId;

    /** 设备数据ID号 */
    @Excel(name = "设备数据ID号")
    private Long machineId;

    /** k12离线刷脸机构ID */
    @Excel(name = "k12离线刷脸机构ID")
    private String organizationId;

    /** k12离线刷脸学校名称 */
    @Excel(name = "k12离线刷脸学校名称")
    private String schoolName;

    /** 限制流量 */
    @Excel(name = "限制流量")
    private Long flowLimit;

    /** 支付宝k12学校ID */
    @Excel(name = "支付宝k12学校ID")
    private String aliK12Id;

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

    public void setMachineId(Long machineId) 
    {
        this.machineId = machineId;
    }

    public Long getMachineId() 
    {
        return machineId;
    }

    public void setOrganizationId(String organizationId) 
    {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() 
    {
        return organizationId;
    }

    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }

    public void setFlowLimit(Long flowLimit) 
    {
        this.flowLimit = flowLimit;
    }

    public Long getFlowLimit() 
    {
        return flowLimit;
    }

    public void setAliK12Id(String aliK12Id) 
    {
        this.aliK12Id = aliK12Id;
    }

    public String getAliK12Id() 
    {
        return aliK12Id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("machineId", getMachineId())
            .append("organizationId", getOrganizationId())
            .append("schoolName", getSchoolName())
            .append("flowLimit", getFlowLimit())
            .append("aliK12Id", getAliK12Id())
            .toString();
    }
}
