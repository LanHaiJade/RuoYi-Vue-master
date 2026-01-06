package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 base_user_alipay
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseUserAlipay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 事务编号 */
    @Excel(name = "事务编号")
    private String batchNo;

    /** 支付宝账号 */
    @Excel(name = "支付宝账号")
    private String account;

    /** 联系姓名 */
    @Excel(name = "联系姓名")
    private String contactName;

    /** 联系手机 */
    @Excel(name = "联系手机")
    private String contactMobile;

    /** 联系邮箱 */
    @Excel(name = "联系邮箱")
    private String contactEmail;

    /** 店铺内景照 */
    @Excel(name = "店铺内景照")
    private String scenePic;

    /** 店铺门头照 */
    @Excel(name = "店铺门头照")
    private String boardPic;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Integer status;

    /** 反馈信息 */
    @Excel(name = "反馈信息")
    private String message;

    /** 应用授权令牌 */
    @Excel(name = "应用授权令牌")
    private String appAuthToken;

    /** 商户pid */
    @Excel(name = "商户pid")
    private String pid;

    /** 应用id */
    @Excel(name = "应用id")
    private String appId;

    /** 确认签约链接 */
    @Excel(name = "确认签约链接")
    private String confirmUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String externalId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String smid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String franchiseeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mccCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ptype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String merchantType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String merchantName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String aliasName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mcc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalCertNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String inDoorImagesUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String inDoorImagesId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outDoorImagesUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outDoorImagesId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certImageUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certImageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certImageBackUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certImageBackId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalCertFrontImageUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalCertFrontImageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalCertBackImageUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String legalCertBackImageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer zStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zmsg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String provinceCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cityCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String districtCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setBatchNo(String batchNo) 
    {
        this.batchNo = batchNo;
    }

    public String getBatchNo() 
    {
        return batchNo;
    }

    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setContactMobile(String contactMobile) 
    {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() 
    {
        return contactMobile;
    }

    public void setContactEmail(String contactEmail) 
    {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() 
    {
        return contactEmail;
    }

    public void setScenePic(String scenePic) 
    {
        this.scenePic = scenePic;
    }

    public String getScenePic() 
    {
        return scenePic;
    }

    public void setBoardPic(String boardPic) 
    {
        this.boardPic = boardPic;
    }

    public String getBoardPic() 
    {
        return boardPic;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    public String getMessage() 
    {
        return message;
    }

    public void setAppAuthToken(String appAuthToken) 
    {
        this.appAuthToken = appAuthToken;
    }

    public String getAppAuthToken() 
    {
        return appAuthToken;
    }

    public void setPid(String pid) 
    {
        this.pid = pid;
    }

    public String getPid() 
    {
        return pid;
    }

    public void setAppId(String appId) 
    {
        this.appId = appId;
    }

    public String getAppId() 
    {
        return appId;
    }

    public void setConfirmUrl(String confirmUrl) 
    {
        this.confirmUrl = confirmUrl;
    }

    public String getConfirmUrl() 
    {
        return confirmUrl;
    }

    public void setExternalId(String externalId) 
    {
        this.externalId = externalId;
    }

    public String getExternalId() 
    {
        return externalId;
    }

    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }

    public void setSmid(String smid) 
    {
        this.smid = smid;
    }

    public String getSmid() 
    {
        return smid;
    }

    public void setIdNo(String idNo) 
    {
        this.idNo = idNo;
    }

    public String getIdNo() 
    {
        return idNo;
    }

    public void setFranchiseeId(String franchiseeId) 
    {
        this.franchiseeId = franchiseeId;
    }

    public String getFranchiseeId() 
    {
        return franchiseeId;
    }

    public void setMccCode(String mccCode) 
    {
        this.mccCode = mccCode;
    }

    public String getMccCode() 
    {
        return mccCode;
    }

    public void setPtype(Integer ptype) 
    {
        this.ptype = ptype;
    }

    public Integer getPtype() 
    {
        return ptype;
    }

    public void setMerchantType(String merchantType) 
    {
        this.merchantType = merchantType;
    }

    public String getMerchantType() 
    {
        return merchantType;
    }

    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }

    public void setAliasName(String aliasName) 
    {
        this.aliasName = aliasName;
    }

    public String getAliasName() 
    {
        return aliasName;
    }

    public void setMcc(String mcc) 
    {
        this.mcc = mcc;
    }

    public String getMcc() 
    {
        return mcc;
    }

    public void setCertNo(String certNo) 
    {
        this.certNo = certNo;
    }

    public String getCertNo() 
    {
        return certNo;
    }

    public void setCertType(String certType) 
    {
        this.certType = certType;
    }

    public String getCertType() 
    {
        return certType;
    }

    public void setLegalName(String legalName) 
    {
        this.legalName = legalName;
    }

    public String getLegalName() 
    {
        return legalName;
    }

    public void setLegalCertNo(String legalCertNo) 
    {
        this.legalCertNo = legalCertNo;
    }

    public String getLegalCertNo() 
    {
        return legalCertNo;
    }

    public void setInDoorImagesUrl(String inDoorImagesUrl) 
    {
        this.inDoorImagesUrl = inDoorImagesUrl;
    }

    public String getInDoorImagesUrl() 
    {
        return inDoorImagesUrl;
    }

    public void setInDoorImagesId(String inDoorImagesId) 
    {
        this.inDoorImagesId = inDoorImagesId;
    }

    public String getInDoorImagesId() 
    {
        return inDoorImagesId;
    }

    public void setOutDoorImagesUrl(String outDoorImagesUrl) 
    {
        this.outDoorImagesUrl = outDoorImagesUrl;
    }

    public String getOutDoorImagesUrl() 
    {
        return outDoorImagesUrl;
    }

    public void setOutDoorImagesId(String outDoorImagesId) 
    {
        this.outDoorImagesId = outDoorImagesId;
    }

    public String getOutDoorImagesId() 
    {
        return outDoorImagesId;
    }

    public void setCertImageUrl(String certImageUrl) 
    {
        this.certImageUrl = certImageUrl;
    }

    public String getCertImageUrl() 
    {
        return certImageUrl;
    }

    public void setCertImageId(String certImageId) 
    {
        this.certImageId = certImageId;
    }

    public String getCertImageId() 
    {
        return certImageId;
    }

    public void setCertImageBackUrl(String certImageBackUrl) 
    {
        this.certImageBackUrl = certImageBackUrl;
    }

    public String getCertImageBackUrl() 
    {
        return certImageBackUrl;
    }

    public void setCertImageBackId(String certImageBackId) 
    {
        this.certImageBackId = certImageBackId;
    }

    public String getCertImageBackId() 
    {
        return certImageBackId;
    }

    public void setLegalCertFrontImageUrl(String legalCertFrontImageUrl) 
    {
        this.legalCertFrontImageUrl = legalCertFrontImageUrl;
    }

    public String getLegalCertFrontImageUrl() 
    {
        return legalCertFrontImageUrl;
    }

    public void setLegalCertFrontImageId(String legalCertFrontImageId) 
    {
        this.legalCertFrontImageId = legalCertFrontImageId;
    }

    public String getLegalCertFrontImageId() 
    {
        return legalCertFrontImageId;
    }

    public void setLegalCertBackImageUrl(String legalCertBackImageUrl) 
    {
        this.legalCertBackImageUrl = legalCertBackImageUrl;
    }

    public String getLegalCertBackImageUrl() 
    {
        return legalCertBackImageUrl;
    }

    public void setLegalCertBackImageId(String legalCertBackImageId) 
    {
        this.legalCertBackImageId = legalCertBackImageId;
    }

    public String getLegalCertBackImageId() 
    {
        return legalCertBackImageId;
    }

    public void setzStatus(Integer zStatus) 
    {
        this.zStatus = zStatus;
    }

    public Integer getzStatus() 
    {
        return zStatus;
    }

    public void setZmsg(String zmsg) 
    {
        this.zmsg = zmsg;
    }

    public String getZmsg() 
    {
        return zmsg;
    }

    public void setProvinceCode(String provinceCode) 
    {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() 
    {
        return provinceCode;
    }

    public void setCityCode(String cityCode) 
    {
        this.cityCode = cityCode;
    }

    public String getCityCode() 
    {
        return cityCode;
    }

    public void setDistrictCode(String districtCode) 
    {
        this.districtCode = districtCode;
    }

    public String getDistrictCode() 
    {
        return districtCode;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("batchNo", getBatchNo())
            .append("account", getAccount())
            .append("contactName", getContactName())
            .append("contactMobile", getContactMobile())
            .append("contactEmail", getContactEmail())
            .append("scenePic", getScenePic())
            .append("boardPic", getBoardPic())
            .append("status", getStatus())
            .append("message", getMessage())
            .append("appAuthToken", getAppAuthToken())
            .append("pid", getPid())
            .append("appId", getAppId())
            .append("confirmUrl", getConfirmUrl())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("externalId", getExternalId())
            .append("orderId", getOrderId())
            .append("smid", getSmid())
            .append("idNo", getIdNo())
            .append("franchiseeId", getFranchiseeId())
            .append("mccCode", getMccCode())
            .append("ptype", getPtype())
            .append("merchantType", getMerchantType())
            .append("merchantName", getMerchantName())
            .append("aliasName", getAliasName())
            .append("mcc", getMcc())
            .append("certNo", getCertNo())
            .append("certType", getCertType())
            .append("legalName", getLegalName())
            .append("legalCertNo", getLegalCertNo())
            .append("inDoorImagesUrl", getInDoorImagesUrl())
            .append("inDoorImagesId", getInDoorImagesId())
            .append("outDoorImagesUrl", getOutDoorImagesUrl())
            .append("outDoorImagesId", getOutDoorImagesId())
            .append("certImageUrl", getCertImageUrl())
            .append("certImageId", getCertImageId())
            .append("certImageBackUrl", getCertImageBackUrl())
            .append("certImageBackId", getCertImageBackId())
            .append("legalCertFrontImageUrl", getLegalCertFrontImageUrl())
            .append("legalCertFrontImageId", getLegalCertFrontImageId())
            .append("legalCertBackImageUrl", getLegalCertBackImageUrl())
            .append("legalCertBackImageId", getLegalCertBackImageId())
            .append("zStatus", getzStatus())
            .append("zmsg", getZmsg())
            .append("provinceCode", getProvinceCode())
            .append("cityCode", getCityCode())
            .append("districtCode", getDistrictCode())
            .append("address", getAddress())
            .toString();
    }
}
