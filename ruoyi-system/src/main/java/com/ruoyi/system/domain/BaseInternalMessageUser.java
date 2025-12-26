package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 站内信用户映射对象 base_internal_message_user
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseInternalMessageUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 站内信信息ID */
    @Excel(name = "站内信信息ID")
    private Long interMsgId;

    /** 1已读 */
    @Excel(name = "1已读")
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

    public void setInterMsgId(Long interMsgId) 
    {
        this.interMsgId = interMsgId;
    }

    public Long getInterMsgId() 
    {
        return interMsgId;
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
            .append("interMsgId", getInterMsgId())
            .append("status", getStatus())
            .toString();
    }
}
