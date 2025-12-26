package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_payinfo_detail
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BasePayinfoDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payinfoId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long goodsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodsName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long number;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodsAttr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long huoDao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasDelivery;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasRefund;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bjl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer payType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal oldamount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal disamount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String discountInfo;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setPayinfoId(Long payinfoId) 
    {
        this.payinfoId = payinfoId;
    }

    public Long getPayinfoId() 
    {
        return payinfoId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }

    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }

    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setGoodsAttr(String goodsAttr) 
    {
        this.goodsAttr = goodsAttr;
    }

    public String getGoodsAttr() 
    {
        return goodsAttr;
    }

    public void setHuoDao(Long huoDao) 
    {
        this.huoDao = huoDao;
    }

    public Long getHuoDao() 
    {
        return huoDao;
    }

    public void setPayStatus(Long payStatus) 
    {
        this.payStatus = payStatus;
    }

    public Long getPayStatus() 
    {
        return payStatus;
    }

    public void setHasDelivery(Long hasDelivery) 
    {
        this.hasDelivery = hasDelivery;
    }

    public Long getHasDelivery() 
    {
        return hasDelivery;
    }

    public void setHasRefund(Long hasRefund) 
    {
        this.hasRefund = hasRefund;
    }

    public Long getHasRefund() 
    {
        return hasRefund;
    }

    public void setBjl(String bjl) 
    {
        this.bjl = bjl;
    }

    public String getBjl() 
    {
        return bjl;
    }

    public void setPayType(Integer payType) 
    {
        this.payType = payType;
    }

    public Integer getPayType() 
    {
        return payType;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setOldamount(BigDecimal oldamount) 
    {
        this.oldamount = oldamount;
    }

    public BigDecimal getOldamount() 
    {
        return oldamount;
    }

    public void setDisamount(BigDecimal disamount) 
    {
        this.disamount = disamount;
    }

    public BigDecimal getDisamount() 
    {
        return disamount;
    }

    public void setDiscountInfo(String discountInfo) 
    {
        this.discountInfo = discountInfo;
    }

    public String getDiscountInfo() 
    {
        return discountInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("payinfoId", getPayinfoId())
            .append("userId", getUserId())
            .append("sbId", getSbId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("number", getNumber())
            .append("price", getPrice())
            .append("amount", getAmount())
            .append("goodsAttr", getGoodsAttr())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("huoDao", getHuoDao())
            .append("payStatus", getPayStatus())
            .append("hasDelivery", getHasDelivery())
            .append("hasRefund", getHasRefund())
            .append("bjl", getBjl())
            .append("payType", getPayType())
            .append("orderNo", getOrderNo())
            .append("oldamount", getOldamount())
            .append("disamount", getDisamount())
            .append("discountInfo", getDiscountInfo())
            .toString();
    }
}
