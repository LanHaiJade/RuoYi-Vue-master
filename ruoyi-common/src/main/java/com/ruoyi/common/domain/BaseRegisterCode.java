package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 运营商注册对象 base_register_code
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseRegisterCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 注册验证码 */
    @Excel(name = "注册验证码")
    private String registerCode;

    /** 验证码类型 */
    @Excel(name = "验证码类型")
    private String codeType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setRegisterCode(String registerCode) 
    {
        this.registerCode = registerCode;
    }

    public String getRegisterCode() 
    {
        return registerCode;
    }

    public void setCodeType(String codeType) 
    {
        this.codeType = codeType;
    }

    public String getCodeType() 
    {
        return codeType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("registerCode", getRegisterCode())
            .append("createTime", getCreateTime())
            .append("codeType", getCodeType())
            .toString();
    }
}
