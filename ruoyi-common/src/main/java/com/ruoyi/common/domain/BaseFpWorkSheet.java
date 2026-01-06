package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_fp_work_sheet
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseFpWorkSheet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNo;

    /** 工单编号 */
    @Excel(name = "工单编号")
    private String worksheetno;

    /** 问题id */
    @Excel(name = "问题id")
    private String problemdefid;

    /** 来源 0 初始化 1在线客服 2运营 3 400电话 4用户小程序端申请 */
    @Excel(name = "来源 0 初始化 1在线客服 2运营 3 400电话 4用户小程序端申请")
    private String source;

    /** 问题描述 */
    @Excel(name = "问题描述")
    private String wsdescription;

    /** 工单图片1 */
    @Excel(name = "工单图片1")
    private String pic1;

    /** 工单图片2 */
    @Excel(name = "工单图片2")
    private String pic2;

    /** 工单图片3 */
    @Excel(name = "工单图片3")
    private String pic3;

    /** 工单图片4 */
    @Excel(name = "工单图片4")
    private String pic4;

    /** 工单图片5 */
    @Excel(name = "工单图片5")
    private String pic5;

    /** 扶贫网运营商ID */
    @Excel(name = "扶贫网运营商ID")
    private String appid;

    /** 密文 */
    @Excel(name = "密文")
    private String ciphertext;

    /** 上报时间 */
    @Excel(name = "上报时间")
    private String reportTime;

    /** 0未解决1已解决 */
    @Excel(name = "0未解决1已解决")
    private Integer status;

    /** 工单反馈结果 */
    @Excel(name = "工单反馈结果")
    private String feedBackInfo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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

    public void setWorksheetno(String worksheetno) 
    {
        this.worksheetno = worksheetno;
    }

    public String getWorksheetno() 
    {
        return worksheetno;
    }

    public void setProblemdefid(String problemdefid) 
    {
        this.problemdefid = problemdefid;
    }

    public String getProblemdefid() 
    {
        return problemdefid;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }

    public void setWsdescription(String wsdescription) 
    {
        this.wsdescription = wsdescription;
    }

    public String getWsdescription() 
    {
        return wsdescription;
    }

    public void setPic1(String pic1) 
    {
        this.pic1 = pic1;
    }

    public String getPic1() 
    {
        return pic1;
    }

    public void setPic2(String pic2) 
    {
        this.pic2 = pic2;
    }

    public String getPic2() 
    {
        return pic2;
    }

    public void setPic3(String pic3) 
    {
        this.pic3 = pic3;
    }

    public String getPic3() 
    {
        return pic3;
    }

    public void setPic4(String pic4) 
    {
        this.pic4 = pic4;
    }

    public String getPic4() 
    {
        return pic4;
    }

    public void setPic5(String pic5) 
    {
        this.pic5 = pic5;
    }

    public String getPic5() 
    {
        return pic5;
    }

    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }

    public void setCiphertext(String ciphertext) 
    {
        this.ciphertext = ciphertext;
    }

    public String getCiphertext() 
    {
        return ciphertext;
    }

    public void setReportTime(String reportTime) 
    {
        this.reportTime = reportTime;
    }

    public String getReportTime() 
    {
        return reportTime;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setFeedBackInfo(String feedBackInfo) 
    {
        this.feedBackInfo = feedBackInfo;
    }

    public String getFeedBackInfo() 
    {
        return feedBackInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("worksheetno", getWorksheetno())
            .append("problemdefid", getProblemdefid())
            .append("source", getSource())
            .append("wsdescription", getWsdescription())
            .append("pic1", getPic1())
            .append("pic2", getPic2())
            .append("pic3", getPic3())
            .append("pic4", getPic4())
            .append("pic5", getPic5())
            .append("appid", getAppid())
            .append("ciphertext", getCiphertext())
            .append("reportTime", getReportTime())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("feedBackInfo", getFeedBackInfo())
            .toString();
    }
}
