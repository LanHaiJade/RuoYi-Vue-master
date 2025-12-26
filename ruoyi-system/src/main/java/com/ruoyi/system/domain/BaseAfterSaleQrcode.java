package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_after_sale_qrcode
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseAfterSaleQrcode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 工作人员姓名 */
    @Excel(name = "工作人员姓名")
    private String workerName;

    /** 工作人员二维码url */
    @Excel(name = "工作人员二维码url")
    private String qrcodeUrl;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setWorkerName(String workerName) 
    {
        this.workerName = workerName;
    }

    public String getWorkerName() 
    {
        return workerName;
    }

    public void setQrcodeUrl(String qrcodeUrl) 
    {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getQrcodeUrl() 
    {
        return qrcodeUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workerName", getWorkerName())
            .append("qrcodeUrl", getQrcodeUrl())
            .append("createTime", getCreateTime())
            .toString();
    }
}
