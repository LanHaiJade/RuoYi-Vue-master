package com.ruoyi.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 公告对象 base_notice
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String baseNoticeId;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 消息内容 */
    @Excel(name = "消息内容")
    private String content;

    /** 公告开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "公告开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginDate;

    /** 公告截止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "公告截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String isDelete;

    /** 删除时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "删除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deleteTime;

    /** 发布者头像 */
    @Excel(name = "发布者头像")
    private String thumb;

    public void setBaseNoticeId(String baseNoticeId) 
    {
        this.baseNoticeId = baseNoticeId;
    }

    public String getBaseNoticeId() 
    {
        return baseNoticeId;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setBeginDate(Date beginDate) 
    {
        this.beginDate = beginDate;
    }

    public Date getBeginDate() 
    {
        return beginDate;
    }

    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
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

    public void setThumb(String thumb) 
    {
        this.thumb = thumb;
    }

    public String getThumb() 
    {
        return thumb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("baseNoticeId", getBaseNoticeId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("beginDate", getBeginDate())
            .append("endDate", getEndDate())
            .append("isDelete", getIsDelete())
            .append("deleteTime", getDeleteTime())
            .append("thumb", getThumb())
            .toString();
    }
}
