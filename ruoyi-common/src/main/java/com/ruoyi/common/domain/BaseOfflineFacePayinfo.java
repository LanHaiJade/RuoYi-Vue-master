package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_offline_face_payinfo
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseOfflineFacePayinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 刷脸用户姓名 */
    @Excel(name = "刷脸用户姓名")
    private String userName;

    /** 刷脸用户id */
    @Excel(name = "刷脸用户id")
    private String outUserId;

    /** 微信用户公众号ID */
    @Excel(name = "微信用户公众号ID")
    private String openId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setOutUserId(String outUserId) 
    {
        this.outUserId = outUserId;
    }

    public String getOutUserId() 
    {
        return outUserId;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("userName", getUserName())
            .append("outUserId", getOutUserId())
            .append("openId", getOpenId())
            .toString();
    }
}
