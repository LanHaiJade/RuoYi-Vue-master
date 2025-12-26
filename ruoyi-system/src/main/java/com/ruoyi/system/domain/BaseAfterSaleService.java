package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_after_sale_service
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseAfterSaleService extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 响应速度（1满意，2不满意） */
    @Excel(name = "响应速度", readConverterExp = "1=满意，2不满意")
    private String responseSpeed;

    /** 服务态度（1满意，2不满意） */
    @Excel(name = "服务态度", readConverterExp = "1=满意，2不满意")
    private String serviceAttitude;

    /** 专业度（1满意，2不满意） */
    @Excel(name = "专业度", readConverterExp = "1=满意，2不满意")
    private String professionalism;

    /** 评分 */
    @Excel(name = "评分")
    private String serviceScore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productScore;

    /** 其它问题（最多五百字） */
    @Excel(name = "其它问题", readConverterExp = "最=多五百字")
    private String problem;

    /** 客户联系方式 */
    @Excel(name = "客户联系方式")
    private String customerPhone;

    /** 工作人 */
    @Excel(name = "工作人")
    private String workerName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setResponseSpeed(String responseSpeed) 
    {
        this.responseSpeed = responseSpeed;
    }

    public String getResponseSpeed() 
    {
        return responseSpeed;
    }

    public void setServiceAttitude(String serviceAttitude) 
    {
        this.serviceAttitude = serviceAttitude;
    }

    public String getServiceAttitude() 
    {
        return serviceAttitude;
    }

    public void setProfessionalism(String professionalism) 
    {
        this.professionalism = professionalism;
    }

    public String getProfessionalism() 
    {
        return professionalism;
    }

    public void setServiceScore(String serviceScore) 
    {
        this.serviceScore = serviceScore;
    }

    public String getServiceScore() 
    {
        return serviceScore;
    }

    public void setProductScore(String productScore) 
    {
        this.productScore = productScore;
    }

    public String getProductScore() 
    {
        return productScore;
    }

    public void setProblem(String problem) 
    {
        this.problem = problem;
    }

    public String getProblem() 
    {
        return problem;
    }

    public void setCustomerPhone(String customerPhone) 
    {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() 
    {
        return customerPhone;
    }

    public void setWorkerName(String workerName) 
    {
        this.workerName = workerName;
    }

    public String getWorkerName() 
    {
        return workerName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("responseSpeed", getResponseSpeed())
            .append("serviceAttitude", getServiceAttitude())
            .append("professionalism", getProfessionalism())
            .append("serviceScore", getServiceScore())
            .append("productScore", getProductScore())
            .append("problem", getProblem())
            .append("customerPhone", getCustomerPhone())
            .append("workerName", getWorkerName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
