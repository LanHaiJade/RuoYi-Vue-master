package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_offline_face_user
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseOfflineFaceUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 学校名称 */
    @Excel(name = "学校名称")
    private String schoolName;

    /** IDCARD:身份证EEP_HK_MACAU:港澳通行证PASSPORT_NO:护照 */
    @Excel(name = "IDCARD:身份证EEP_HK_MACAU:港澳通行证PASSPORT_NO:护照")
    private String certType;

    /** 证件号 */
    @Excel(name = "证件号")
    private String certId;

    /** STUDENT:学生,STAFF:职员 */
    @Excel(name = "STUDENT:学生,STAFF:职员")
    private String userType;

    /** 学生信息user_type为STUDENT时必填 */
    @Excel(name = "学生信息user_type为STUDENT时必填")
    private String className;

    /** 职工信息user_type为STAFF时必填 */
    @Excel(name = "职工信息user_type为STAFF时必填")
    private String occupation;

    /** 机构id */
    @Excel(name = "机构id")
    private String organizationId;

    /** 手机 */
    @Excel(name = "手机")
    private String account;

    /** 微信用户openId */
    @Excel(name = "微信用户openId")
    private String openId;

    /** 微信侧刷脸用户ID */
    @Excel(name = "微信侧刷脸用户ID")
    private String userId;

    /** 每日购买额度限制。0表示不限制 */
    @Excel(name = "每日购买额度限制。0表示不限制")
    private Integer limitAmount;

    /** 每日购买次数限制。0表示不限制 */
    @Excel(name = "每日购买次数限制。0表示不限制")
    private Integer buyNum;

    /** 商户侧刷脸用户ID */
    @Excel(name = "商户侧刷脸用户ID")
    private String outUserId;

    /** NOT_CONTRACTED：未签约,TERMINATED：已解约,CONTRACTED：已签约 */
    @Excel(name = "NOT_CONTRACTED：未签约,TERMINATED：已解约,CONTRACTED：已签约")
    private String contractState;

    /** 1true已录入,0false未录入 */
    @Excel(name = "1true已录入,0false未录入")
    private Integer faceImageOk;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }

    public void setCertType(String certType) 
    {
        this.certType = certType;
    }

    public String getCertType() 
    {
        return certType;
    }

    public void setCertId(String certId) 
    {
        this.certId = certId;
    }

    public String getCertId() 
    {
        return certId;
    }

    public void setUserType(String userType) 
    {
        this.userType = userType;
    }

    public String getUserType() 
    {
        return userType;
    }

    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }

    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }

    public void setOrganizationId(String organizationId) 
    {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() 
    {
        return organizationId;
    }

    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }

    public void setLimitAmount(Integer limitAmount) 
    {
        this.limitAmount = limitAmount;
    }

    public Integer getLimitAmount() 
    {
        return limitAmount;
    }

    public void setBuyNum(Integer buyNum) 
    {
        this.buyNum = buyNum;
    }

    public Integer getBuyNum() 
    {
        return buyNum;
    }

    public void setOutUserId(String outUserId) 
    {
        this.outUserId = outUserId;
    }

    public String getOutUserId() 
    {
        return outUserId;
    }

    public void setContractState(String contractState) 
    {
        this.contractState = contractState;
    }

    public String getContractState() 
    {
        return contractState;
    }

    public void setFaceImageOk(Integer faceImageOk) 
    {
        this.faceImageOk = faceImageOk;
    }

    public Integer getFaceImageOk() 
    {
        return faceImageOk;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("schoolName", getSchoolName())
            .append("certType", getCertType())
            .append("certId", getCertId())
            .append("userType", getUserType())
            .append("className", getClassName())
            .append("occupation", getOccupation())
            .append("organizationId", getOrganizationId())
            .append("account", getAccount())
            .append("openId", getOpenId())
            .append("userId", getUserId())
            .append("limitAmount", getLimitAmount())
            .append("buyNum", getBuyNum())
            .append("outUserId", getOutUserId())
            .append("contractState", getContractState())
            .append("faceImageOk", getFaceImageOk())
            .toString();
    }
}
