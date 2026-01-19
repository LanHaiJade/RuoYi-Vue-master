package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 base_payinfo
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BasePayinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;//订单号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long machineId;//设备id

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;//设备号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbName;//设备名称

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;//运营商id

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long goodsId;//商品id

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodsName;//商品名称

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deliveryId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long huodao;//货道号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payType;//支付方式

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long number;//购买数量

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;//商品进价

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amount;//支付金额

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal poundage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String openId;//付款人

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transactionId;//支付渠道订单号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String returnNo;//设备2字节订单号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasDelivery;//出货状态

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasRefund;//退款状态

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasNotice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasPay;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long transferId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payChannelType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long scanWeb;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pickUp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long subMch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deliveryCode;//出货编码

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deliveryInfo;//出货详情

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;//支付状态

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String couponCode;//优惠券号码

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal discount;//折扣信息

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal oldamount;//订单原金额

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal disamount;//订单打折金额

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String discountInfo;//打折详情

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String huodaos;//货道号

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer payAuth;

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

    public void setMachineId(Long machineId) 
    {
        this.machineId = machineId;
    }

    public Long getMachineId() 
    {
        return machineId;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setSbName(String sbName) 
    {
        this.sbName = sbName;
    }

    public String getSbName() 
    {
        return sbName;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
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

    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }

    public void setHuodao(Long huodao) 
    {
        this.huodao = huodao;
    }

    public Long getHuodao() 
    {
        return huodao;
    }

    public void setPayType(Long payType) 
    {
        this.payType = payType;
    }

    public Long getPayType() 
    {
        return payType;
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

    public void setPoundage(BigDecimal poundage) 
    {
        this.poundage = poundage;
    }

    public BigDecimal getPoundage() 
    {
        return poundage;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    public void setTransactionId(String transactionId) 
    {
        this.transactionId = transactionId;
    }

    public String getTransactionId() 
    {
        return transactionId;
    }

    public void setReturnNo(String returnNo) 
    {
        this.returnNo = returnNo;
    }

    public String getReturnNo() 
    {
        return returnNo;
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

    public void setHasNotice(Long hasNotice) 
    {
        this.hasNotice = hasNotice;
    }

    public Long getHasNotice() 
    {
        return hasNotice;
    }

    public void setHasPay(Long hasPay) 
    {
        this.hasPay = hasPay;
    }

    public Long getHasPay() 
    {
        return hasPay;
    }

    public void setTransferId(Long transferId) 
    {
        this.transferId = transferId;
    }

    public Long getTransferId() 
    {
        return transferId;
    }

    public void setPayChannelType(Long payChannelType) 
    {
        this.payChannelType = payChannelType;
    }

    public Long getPayChannelType() 
    {
        return payChannelType;
    }

    public void setScanWeb(Long scanWeb) 
    {
        this.scanWeb = scanWeb;
    }

    public Long getScanWeb() 
    {
        return scanWeb;
    }

    public void setPickUp(Long pickUp) 
    {
        this.pickUp = pickUp;
    }

    public Long getPickUp() 
    {
        return pickUp;
    }

    public void setSubMch(Long subMch) 
    {
        this.subMch = subMch;
    }

    public Long getSubMch() 
    {
        return subMch;
    }

    public void setDeliveryCode(String deliveryCode) 
    {
        this.deliveryCode = deliveryCode;
    }

    public String getDeliveryCode() 
    {
        return deliveryCode;
    }

    public void setDeliveryInfo(String deliveryInfo) 
    {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryInfo() 
    {
        return deliveryInfo;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setCouponCode(String couponCode) 
    {
        this.couponCode = couponCode;
    }

    public String getCouponCode() 
    {
        return couponCode;
    }

    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
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

    public void setHuodaos(String huodaos) 
    {
        this.huodaos = huodaos;
    }

    public String getHuodaos() 
    {
        return huodaos;
    }

    public void setPayAuth(Integer payAuth) 
    {
        this.payAuth = payAuth;
    }

    public Integer getPayAuth() 
    {
        return payAuth;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("machineId", getMachineId())
            .append("sbId", getSbId())
            .append("sbName", getSbName())
            .append("userId", getUserId())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("deliveryId", getDeliveryId())
            .append("huodao", getHuodao())
            .append("payType", getPayType())
            .append("number", getNumber())
            .append("price", getPrice())
            .append("amount", getAmount())
            .append("poundage", getPoundage())
            .append("openId", getOpenId())
            .append("transactionId", getTransactionId())
            .append("returnNo", getReturnNo())
            .append("hasDelivery", getHasDelivery())
            .append("hasRefund", getHasRefund())
            .append("hasNotice", getHasNotice())
            .append("hasPay", getHasPay())
            .append("transferId", getTransferId())
            .append("payChannelType", getPayChannelType())
            .append("scanWeb", getScanWeb())
            .append("pickUp", getPickUp())
            .append("subMch", getSubMch())
            .append("deliveryCode", getDeliveryCode())
            .append("deliveryInfo", getDeliveryInfo())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("couponCode", getCouponCode())
            .append("discount", getDiscount())
            .append("oldamount", getOldamount())
            .append("disamount", getDisamount())
            .append("discountInfo", getDiscountInfo())
            .append("huodaos", getHuodaos())
            .append("payAuth", getPayAuth())
            .toString();
    }
}
