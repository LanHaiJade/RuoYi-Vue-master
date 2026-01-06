package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 base_iccardrerecord
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseIccardrerecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 操作内容 */
    @Excel(name = "操作内容")
    private String message;

    /** 状态，1开卡时间，2销卡时间，3管理员充值，4挂失（禁用），5启用，6补卡，7二维码充值 */
    @Excel(name = "状态，1开卡时间，2销卡时间，3管理员充值，4挂失", readConverterExp = "禁=用")
    private Long state;

    /** 卡号 */
    @Excel(name = "卡号")
    private String cardNumber;

    /** 操作用户名 */
    @Excel(name = "操作用户名")
    private String ctrlUserName;

    /** 所属运营商用户ID */
    @Excel(name = "所属运营商用户ID")
    private Long userId;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 卡片持有人 */
    @Excel(name = "卡片持有人")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    public String getMessage() 
    {
        return message;
    }

    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }

    public void setCardNumber(String cardNumber) 
    {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() 
    {
        return cardNumber;
    }

    public void setCtrlUserName(String ctrlUserName) 
    {
        this.ctrlUserName = ctrlUserName;
    }

    public String getCtrlUserName() 
    {
        return ctrlUserName;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("message", getMessage())
            .append("state", getState())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("cardNumber", getCardNumber())
            .append("ctrlUserName", getCtrlUserName())
            .append("userId", getUserId())
            .append("amount", getAmount())
            .append("name", getName())
            .toString();
    }
}
