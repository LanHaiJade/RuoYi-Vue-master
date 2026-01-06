package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_bin
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseBin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 版本号 */
    @Excel(name = "版本号")
    private String versionNumber;

    /** 下载地址 */
    @Excel(name = "下载地址")
    private String url;

    /** 包名 */
    @Excel(name = "包名")
    private String packetName;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private String machineType;

    /** 强制更新：0不强制1强制 */
    @Excel(name = "强制更新：0不强制1强制")
    private Integer coerce;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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

    public void setVersionNumber(String versionNumber) 
    {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() 
    {
        return versionNumber;
    }

    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    public void setPacketName(String packetName) 
    {
        this.packetName = packetName;
    }

    public String getPacketName() 
    {
        return packetName;
    }

    public void setMachineType(String machineType) 
    {
        this.machineType = machineType;
    }

    public String getMachineType() 
    {
        return machineType;
    }

    public void setCoerce(Integer coerce) 
    {
        this.coerce = coerce;
    }

    public Integer getCoerce() 
    {
        return coerce;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("versionNumber", getVersionNumber())
            .append("url", getUrl())
            .append("packetName", getPacketName())
            .append("machineType", getMachineType())
            .append("coerce", getCoerce())
            .append("remark", getRemark())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
