package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 base_machine_shelf
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineShelf extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long machineId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long goodsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodsName;

    /** 货道类型：null普通货道1合约货道 */
    @Excel(name = "货道类型：null普通货道1合约货道")
    private Integer type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer huodao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer capacity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer stock;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer promotion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal promotionPrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** 商品进价 */
    @Excel(name = "商品进价")
    private BigDecimal costPrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal discount;

    /** 1隐藏null显示 */
    @Excel(name = "1隐藏null显示")
    private Integer hidden;

    /** 商品品牌ID */
    @Excel(name = "商品品牌ID")
    private String brandId;

    /** 商品品牌名称 */
    @Excel(name = "商品品牌名称")
    private String brandName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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

    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }

    public void setHuodao(Integer huodao) 
    {
        this.huodao = huodao;
    }

    public Integer getHuodao() 
    {
        return huodao;
    }

    public void setCapacity(Integer capacity) 
    {
        this.capacity = capacity;
    }

    public Integer getCapacity() 
    {
        return capacity;
    }

    public void setStock(Integer stock) 
    {
        this.stock = stock;
    }

    public Integer getStock() 
    {
        return stock;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setPromotion(Integer promotion) 
    {
        this.promotion = promotion;
    }

    public Integer getPromotion() 
    {
        return promotion;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) 
    {
        this.promotionPrice = promotionPrice;
    }

    public BigDecimal getPromotionPrice() 
    {
        return promotionPrice;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setCostPrice(BigDecimal costPrice) 
    {
        this.costPrice = costPrice;
    }

    public BigDecimal getCostPrice() 
    {
        return costPrice;
    }

    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }

    public void setHidden(Integer hidden) 
    {
        this.hidden = hidden;
    }

    public Integer getHidden() 
    {
        return hidden;
    }

    public void setBrandId(String brandId) 
    {
        this.brandId = brandId;
    }

    public String getBrandId() 
    {
        return brandId;
    }

    public void setBrandName(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("machineId", getMachineId())
            .append("sbId", getSbId())
            .append("sbName", getSbName())
            .append("goodsId", getGoodsId())
            .append("goodsName", getGoodsName())
            .append("type", getType())
            .append("huodao", getHuodao())
            .append("capacity", getCapacity())
            .append("stock", getStock())
            .append("price", getPrice())
            .append("promotion", getPromotion())
            .append("promotionPrice", getPromotionPrice())
            .append("status", getStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("costPrice", getCostPrice())
            .append("discount", getDiscount())
            .append("hidden", getHidden())
            .append("brandId", getBrandId())
            .append("brandName", getBrandName())
            .toString();
    }
}
