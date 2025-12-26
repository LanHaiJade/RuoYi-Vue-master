package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_goods
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sku;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String slogon;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    private Long isPublic;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long categoryId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long brandId;

    /** 品牌名称 */
    @Excel(name = "品牌名称")
    private String brandName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stock;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String goodsAttr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long hasPublish;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long number;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String manufacturer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String registrationNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String specification;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indication;

    /** 0普通商品1扶贫商品 */
    @Excel(name = "0普通商品1扶贫商品")
    private Integer fpType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal discount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String imgPath;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setSku(String sku) 
    {
        this.sku = sku;
    }

    public String getSku() 
    {
        return sku;
    }

    public void setSlogon(String slogon) 
    {
        this.slogon = slogon;
    }

    public String getSlogon() 
    {
        return slogon;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setIsPublic(Long isPublic) 
    {
        this.isPublic = isPublic;
    }

    public Long getIsPublic() 
    {
        return isPublic;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setBrandId(Long brandId) 
    {
        this.brandId = brandId;
    }

    public Long getBrandId() 
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

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }

    public void setGoodsAttr(String goodsAttr) 
    {
        this.goodsAttr = goodsAttr;
    }

    public String getGoodsAttr() 
    {
        return goodsAttr;
    }

    public void setHasPublish(Long hasPublish) 
    {
        this.hasPublish = hasPublish;
    }

    public Long getHasPublish() 
    {
        return hasPublish;
    }

    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() 
    {
        return manufacturer;
    }

    public void setRegistrationNumber(String registrationNumber) 
    {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() 
    {
        return registrationNumber;
    }

    public void setSpecification(String specification) 
    {
        this.specification = specification;
    }

    public String getSpecification() 
    {
        return specification;
    }

    public void setIndication(String indication) 
    {
        this.indication = indication;
    }

    public String getIndication() 
    {
        return indication;
    }

    public void setFpType(Integer fpType) 
    {
        this.fpType = fpType;
    }

    public Integer getFpType() 
    {
        return fpType;
    }

    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public void setImgPath(String imgPath) 
    {
        this.imgPath = imgPath;
    }

    public String getImgPath() 
    {
        return imgPath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("userId", getUserId())
            .append("sku", getSku())
            .append("slogon", getSlogon())
            .append("status", getStatus())
            .append("isPublic", getIsPublic())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("categoryId", getCategoryId())
            .append("brandId", getBrandId())
            .append("brandName", getBrandName())
            .append("price", getPrice())
            .append("num", getNum())
            .append("content", getContent())
            .append("stock", getStock())
            .append("goodsAttr", getGoodsAttr())
            .append("hasPublish", getHasPublish())
            .append("number", getNumber())
            .append("manufacturer", getManufacturer())
            .append("registrationNumber", getRegistrationNumber())
            .append("specification", getSpecification())
            .append("indication", getIndication())
            .append("fpType", getFpType())
            .append("discount", getDiscount())
            .append("amount", getAmount())
            .append("imgPath", getImgPath())
            .toString();
    }
}
