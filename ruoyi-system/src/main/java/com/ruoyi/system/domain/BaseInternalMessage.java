package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 站内信消息对象 base_internal_message
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseInternalMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 消息 */
    @Excel(name = "消息")
    private String msg;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 0全部1角色2个人 */
    @Excel(name = "0全部1角色2个人")
    private Integer type;

    /** 类型名称：全部、角色名称、用户手机 */
    @Excel(name = "类型名称：全部、角色名称、用户手机")
    private String typeName;

    /** 类型ID：0全部，当类型为1时此ID为角色ID，当类型为2时此ID为用户ID */
    @Excel(name = "类型ID：0全部，当类型为1时此ID为角色ID，当类型为2时此ID为用户ID")
    private Long typeId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setMsg(String msg) 
    {
        this.msg = msg;
    }

    public String getMsg() 
    {
        return msg;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }

    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }

    public void setTypeId(Long typeId) 
    {
        this.typeId = typeId;
    }

    public Long getTypeId() 
    {
        return typeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("msg", getMsg())
            .append("title", getTitle())
            .append("type", getType())
            .append("typeName", getTypeName())
            .append("typeId", getTypeId())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
