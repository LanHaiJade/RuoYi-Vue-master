package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品优惠对象 base_goods_discount
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseGoodsDiscount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 商品ID */
    @Excel(name = "商品ID")
    private Long goodsId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String sbId;

    /** 运营商用户ID */
    @Excel(name = "运营商用户ID")
    private Long userId;

    /** 优惠折扣/满减优惠金额 */
    @Excel(name = "优惠折扣/满减优惠金额")
    private BigDecimal discount;

    /** 类型：1折扣2满减 */
    @Excel(name = "类型：1折扣2满减")
    private Long type;

    /** 满减金额 */
    @Excel(name = "满减金额")
    private BigDecimal maxPrice;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }

    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }

    public void setMaxPrice(BigDecimal maxPrice) 
    {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMaxPrice() 
    {
        return maxPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsId", getGoodsId())
            .append("sbId", getSbId())
            .append("userId", getUserId())
            .append("discount", getDiscount())
            .append("type", getType())
            .append("maxPrice", getMaxPrice())
            .toString();
    }
}
