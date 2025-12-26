package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_token
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseToken extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mpAppid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String token;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long expiresIn;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setMpAppid(String mpAppid) 
    {
        this.mpAppid = mpAppid;
    }

    public String getMpAppid() 
    {
        return mpAppid;
    }

    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }

    public void setExpiresIn(Long expiresIn) 
    {
        this.expiresIn = expiresIn;
    }

    public Long getExpiresIn() 
    {
        return expiresIn;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mpAppid", getMpAppid())
            .append("token", getToken())
            .append("expiresIn", getExpiresIn())
            .append("createTime", getCreateTime())
            .toString();
    }
}
