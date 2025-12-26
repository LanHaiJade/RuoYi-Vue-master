package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_sys_oper_log
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseSysOperLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 操作功能 */
    @Excel(name = "操作功能")
    private String function;

    /** 更改前信息 */
    @Excel(name = "更改前信息")
    private String beforeChangeInfo;

    /** 更改后信息 */
    @Excel(name = "更改后信息")
    private String afterChangeInfo;

    /** 操作人 */
    @Excel(name = "操作人")
    private String userName;

    /** 角色 */
    @Excel(name = "角色")
    private String roleName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sign;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setFunction(String function) 
    {
        this.function = function;
    }

    public String getFunction() 
    {
        return function;
    }

    public void setBeforeChangeInfo(String beforeChangeInfo) 
    {
        this.beforeChangeInfo = beforeChangeInfo;
    }

    public String getBeforeChangeInfo() 
    {
        return beforeChangeInfo;
    }

    public void setAfterChangeInfo(String afterChangeInfo) 
    {
        this.afterChangeInfo = afterChangeInfo;
    }

    public String getAfterChangeInfo() 
    {
        return afterChangeInfo;
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

    public void setSign(String sign) 
    {
        this.sign = sign;
    }

    public String getSign() 
    {
        return sign;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("function", getFunction())
            .append("beforeChangeInfo", getBeforeChangeInfo())
            .append("afterChangeInfo", getAfterChangeInfo())
            .append("userName", getUserName())
            .append("roleName", getRoleName())
            .append("createTime", getCreateTime())
            .append("phone", getPhone())
            .append("sign", getSign())
            .toString();
    }
}
