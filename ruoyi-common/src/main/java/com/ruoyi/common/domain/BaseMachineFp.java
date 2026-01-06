package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_machine_fp
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineFp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID自增 */
    private Long id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String sbId;

    /** 扶贫网机柜编号 */
    @Excel(name = "扶贫网机柜编号")
    private String machinesn;

    /** 门贴 */
    @Excel(name = "门贴")
    private String doosposturl;

    /** 0未注册1已注册 */
    @Excel(name = "0未注册1已注册")
    private Integer bindRack;

    /** 0未激活1已激活 */
    @Excel(name = "0未激活1已激活")
    private Integer registerRack;

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

    public void setMachinesn(String machinesn) 
    {
        this.machinesn = machinesn;
    }

    public String getMachinesn() 
    {
        return machinesn;
    }

    public void setDoosposturl(String doosposturl) 
    {
        this.doosposturl = doosposturl;
    }

    public String getDoosposturl() 
    {
        return doosposturl;
    }

    public void setBindRack(Integer bindRack) 
    {
        this.bindRack = bindRack;
    }

    public Integer getBindRack() 
    {
        return bindRack;
    }

    public void setRegisterRack(Integer registerRack) 
    {
        this.registerRack = registerRack;
    }

    public Integer getRegisterRack() 
    {
        return registerRack;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("machinesn", getMachinesn())
            .append("doosposturl", getDoosposturl())
            .append("bindRack", getBindRack())
            .append("registerRack", getRegisterRack())
            .toString();
    }
}
