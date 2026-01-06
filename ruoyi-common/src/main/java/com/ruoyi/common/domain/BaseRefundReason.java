package com.ruoyi.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 退款原因对象 base_refund_reason
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseRefundReason extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String baseRefundReasonId;

    /** 退款原因 */
    @Excel(name = "退款原因")
    private String title;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private String isEnable;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sortNo;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;

    /** 删除时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "删除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deleteTime;

    public void setBaseRefundReasonId(String baseRefundReasonId) 
    {
        this.baseRefundReasonId = baseRefundReasonId;
    }

    public String getBaseRefundReasonId() 
    {
        return baseRefundReasonId;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setIsEnable(String isEnable) 
    {
        this.isEnable = isEnable;
    }

    public String getIsEnable() 
    {
        return isEnable;
    }

    public void setSortNo(Long sortNo) 
    {
        this.sortNo = sortNo;
    }

    public Long getSortNo() 
    {
        return sortNo;
    }

    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
    {
        return isDelete;
    }

    public void setDeleteTime(Date deleteTime) 
    {
        this.deleteTime = deleteTime;
    }

    public Date getDeleteTime() 
    {
        return deleteTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("baseRefundReasonId", getBaseRefundReasonId())
            .append("title", getTitle())
            .append("isEnable", getIsEnable())
            .append("sortNo", getSortNo())
            .append("isDelete", getIsDelete())
            .append("deleteTime", getDeleteTime())
            .toString();
    }
}
