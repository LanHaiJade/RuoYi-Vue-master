package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售订单监控视频对象 base_payinfo_video
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BasePayinfoVideo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 支付ID */
    @Excel(name = "支付ID")
    private Long payinfoId;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNo;

    /** 监控视频链接 */
    @Excel(name = "监控视频链接")
    private String videoUrl;

    /** 状态0：没上传，1：已上传 */
    @Excel(name = "状态0：没上传，1：已上传")
    private String status;

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

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setVideoUrl(String videoUrl) 
    {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() 
    {
        return videoUrl;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("payinfoId", getPayinfoId())
            .append("orderNo", getOrderNo())
            .append("videoUrl", getVideoUrl())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
