package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_feedback
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseFeedback extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 反馈用户ID */
    @Excel(name = "反馈用户ID")
    private Long userId;

    /** 反馈用户姓名 */
    @Excel(name = "反馈用户姓名")
    private String userName;

    /** 反馈用户角色 */
    @Excel(name = "反馈用户角色")
    private String roleName;

    /** 反馈用户电话 */
    @Excel(name = "反馈用户电话")
    private String phone;

    /** 客服回复内容 */
    @Excel(name = "客服回复内容")
    private String reply;

    /** 0未读1已处理2垃圾信息 */
    @Excel(name = "0未读1已处理2垃圾信息")
    private Integer status;

    /** 用户阅读状态：0未读1已读 */
    @Excel(name = "用户阅读状态：0未读1已读")
    private Integer userRead;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setReply(String reply) 
    {
        this.reply = reply;
    }

    public String getReply() 
    {
        return reply;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setUserRead(Integer userRead) 
    {
        this.userRead = userRead;
    }

    public Integer getUserRead() 
    {
        return userRead;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("roleName", getRoleName())
            .append("phone", getPhone())
            .append("reply", getReply())
            .append("status", getStatus())
            .append("userRead", getUserRead())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
