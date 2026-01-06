package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_sim_flow_limit
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseSimFlowLimit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 业务名称 */
    @Excel(name = "业务名称")
    private String name;

    /** 限制流量（M） */
    @Excel(name = "限制流量", readConverterExp = "M=")
    private Long flowLimit;

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

    public void setFlowLimit(Long flowLimit) 
    {
        this.flowLimit = flowLimit;
    }

    public Long getFlowLimit() 
    {
        return flowLimit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("flowLimit", getFlowLimit())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
