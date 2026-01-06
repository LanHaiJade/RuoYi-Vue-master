package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_yellow_ticket
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseYellowTicket extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 业务员 */
    @Excel(name = "业务员")
    private String salesman;

    /** 机型 */
    @Excel(name = "机型")
    private String model;

    /** 数量 */
    @Excel(name = "数量")
    private String quantity;

    /** 体积 */
    @Excel(name = "体积")
    private String bulk;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String clientName;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String clientPhone;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String clientAddress;

    /** 运费 */
    @Excel(name = "运费")
    private String fare;

    /** 物流 */
    @Excel(name = "物流")
    private String logistic;

    /** 出厂车牌号码 */
    @Excel(name = "出厂车牌号码")
    private String license;

    /** 是否通知发货 */
    @Excel(name = "是否通知发货")
    private String ship;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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

    public void setSalesman(String salesman) 
    {
        this.salesman = salesman;
    }

    public String getSalesman() 
    {
        return salesman;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    public void setQuantity(String quantity) 
    {
        this.quantity = quantity;
    }

    public String getQuantity() 
    {
        return quantity;
    }

    public void setBulk(String bulk) 
    {
        this.bulk = bulk;
    }

    public String getBulk() 
    {
        return bulk;
    }

    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }

    public String getClientName() 
    {
        return clientName;
    }

    public void setClientPhone(String clientPhone) 
    {
        this.clientPhone = clientPhone;
    }

    public String getClientPhone() 
    {
        return clientPhone;
    }

    public void setClientAddress(String clientAddress) 
    {
        this.clientAddress = clientAddress;
    }

    public String getClientAddress() 
    {
        return clientAddress;
    }

    public void setFare(String fare) 
    {
        this.fare = fare;
    }

    public String getFare() 
    {
        return fare;
    }

    public void setLogistic(String logistic) 
    {
        this.logistic = logistic;
    }

    public String getLogistic() 
    {
        return logistic;
    }

    public void setLicense(String license) 
    {
        this.license = license;
    }

    public String getLicense() 
    {
        return license;
    }

    public void setShip(String ship) 
    {
        this.ship = ship;
    }

    public String getShip() 
    {
        return ship;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("salesman", getSalesman())
            .append("model", getModel())
            .append("quantity", getQuantity())
            .append("bulk", getBulk())
            .append("clientName", getClientName())
            .append("clientPhone", getClientPhone())
            .append("clientAddress", getClientAddress())
            .append("fare", getFare())
            .append("remark", getRemark())
            .append("logistic", getLogistic())
            .append("license", getLicense())
            .append("ship", getShip())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}
