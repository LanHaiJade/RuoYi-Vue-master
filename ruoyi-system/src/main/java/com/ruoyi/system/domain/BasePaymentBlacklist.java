package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消费者黑名单对象 base_payment_blacklist
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BasePaymentBlacklist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 消费者微信openid */
    @Excel(name = "消费者微信openid")
    private String openId;

    /** 用户名字 */
    @Excel(name = "用户名字")
    private String userName;

    /** 状态（1正常，2已删除） */
    @Excel(name = "状态", readConverterExp = "1=正常，2已删除")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("openId", getOpenId())
            .append("userName", getUserName())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
