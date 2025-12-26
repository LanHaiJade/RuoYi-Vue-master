package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_user_micro
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseUserMicro extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 唯一申请订单编号 */
    @Excel(name = "唯一申请订单编号")
    private String businessCode;

    /** 姓名 */
    @Excel(name = "姓名")
    private String idCardName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCardNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idCardAddress;

    /** 有效期 */
    @Excel(name = "有效期")
    private String idCardValidTime;

    /** 身份证正面图片media_id */
    @Excel(name = "身份证正面图片media_id")
    private String idCardFrontMediaId;

    /** 身份证正面图片url */
    @Excel(name = "身份证正面图片url")
    private String idCardFrontUrl;

    /** 身份证反面图片media_id */
    @Excel(name = "身份证反面图片media_id")
    private String idCardBackMediaId;

    /** 身份证反面图片url */
    @Excel(name = "身份证反面图片url")
    private String idCardBackUrl;

    /** 开户银行 */
    @Excel(name = "开户银行")
    private String accountBank;

    /** 开户银行省市编码 */
    @Excel(name = "开户银行省市编码")
    private String bankAddressCode;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String accountNumber;

    /** 门店名称 */
    @Excel(name = "门店名称")
    private String storeName;

    /** 门店省市编码 */
    @Excel(name = "门店省市编码")
    private String storeAddressCode;

    /** 门店门口照片MediaID */
    @Excel(name = "门店门口照片MediaID")
    private String storeEntrancePicMediaId;

    /** 门店门口照片url */
    @Excel(name = "门店门口照片url")
    private String storeEntrancePicUrl;

    /** 店内环境照片MediaID */
    @Excel(name = "店内环境照片MediaID")
    private String indoorPicMediaId;

    /** 店内环境照片url */
    @Excel(name = "店内环境照片url")
    private String indoorPicUrl;

    /** 商户简称 */
    @Excel(name = "商户简称")
    private String merchantShortname;

    /** 客服电话 */
    @Excel(name = "客服电话")
    private String servicePhone;

    /** 售卖商品/提供服务描述 */
    @Excel(name = "售卖商品/提供服务描述")
    private String productDesc;

    /** 费率 */
    @Excel(name = "费率")
    private String rate;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String contactPhone;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Integer status;

    /** 反馈信息 */
    @Excel(name = "反馈信息")
    private String message;

    /** 商户申请单号 */
    @Excel(name = "商户申请单号")
    private String applymentId;

    /** 小微商户号 */
    @Excel(name = "小微商户号")
    private String subMchId;

    /** 签约链接 */
    @Excel(name = "签约链接")
    private String signUrl;

    /** 支付配置状态 */
    @Excel(name = "支付配置状态")
    private Integer payConfigStatus;

    /** 门店详细地址 */
    @Excel(name = "门店详细地址")
    private String storeAddress;

    /** 新进件接口标识 */
    @Excel(name = "新进件接口标识")
    private Integer newIf;

    /** 联系邮箱 */
    @Excel(name = "联系邮箱")
    private String contactEmail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer goldplan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer subjectType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String merchantName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licenseNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licensePicUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licensePicMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String companyAddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certPicUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certPicMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String periodBegin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String periodEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String organizationCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orgPeriodBegin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orgPeriodEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String organizationPicUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String organizationPicMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idDocType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idPeriodBegin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idPeriodEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String settlement;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification1Url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification1MediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification2Url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification2MediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification3Url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification3MediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification4Url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification4MediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification5Url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qualification5MediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer bankAccountType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdDocType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdDocCopyUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdDocCopyMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdDocCopyBackUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactIdDocCopyBackMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactPeriodBegin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactPeriodEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String businessAuthorizationLetterUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String businessAuthorizationLetterMediaId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licenseAddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licensePeriodBegin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String licensePeriodEnd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String storeAddressProvinceCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankAddressProvinceCode;

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

    public void setBusinessCode(String businessCode) 
    {
        this.businessCode = businessCode;
    }

    public String getBusinessCode() 
    {
        return businessCode;
    }

    public void setIdCardName(String idCardName) 
    {
        this.idCardName = idCardName;
    }

    public String getIdCardName() 
    {
        return idCardName;
    }

    public void setIdCardNumber(String idCardNumber) 
    {
        this.idCardNumber = idCardNumber;
    }

    public String getIdCardNumber() 
    {
        return idCardNumber;
    }

    public void setIdCardAddress(String idCardAddress) 
    {
        this.idCardAddress = idCardAddress;
    }

    public String getIdCardAddress() 
    {
        return idCardAddress;
    }

    public void setIdCardValidTime(String idCardValidTime) 
    {
        this.idCardValidTime = idCardValidTime;
    }

    public String getIdCardValidTime() 
    {
        return idCardValidTime;
    }

    public void setIdCardFrontMediaId(String idCardFrontMediaId) 
    {
        this.idCardFrontMediaId = idCardFrontMediaId;
    }

    public String getIdCardFrontMediaId() 
    {
        return idCardFrontMediaId;
    }

    public void setIdCardFrontUrl(String idCardFrontUrl) 
    {
        this.idCardFrontUrl = idCardFrontUrl;
    }

    public String getIdCardFrontUrl() 
    {
        return idCardFrontUrl;
    }

    public void setIdCardBackMediaId(String idCardBackMediaId) 
    {
        this.idCardBackMediaId = idCardBackMediaId;
    }

    public String getIdCardBackMediaId() 
    {
        return idCardBackMediaId;
    }

    public void setIdCardBackUrl(String idCardBackUrl) 
    {
        this.idCardBackUrl = idCardBackUrl;
    }

    public String getIdCardBackUrl() 
    {
        return idCardBackUrl;
    }

    public void setAccountBank(String accountBank) 
    {
        this.accountBank = accountBank;
    }

    public String getAccountBank() 
    {
        return accountBank;
    }

    public void setBankAddressCode(String bankAddressCode) 
    {
        this.bankAddressCode = bankAddressCode;
    }

    public String getBankAddressCode() 
    {
        return bankAddressCode;
    }

    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    public void setStoreAddressCode(String storeAddressCode) 
    {
        this.storeAddressCode = storeAddressCode;
    }

    public String getStoreAddressCode() 
    {
        return storeAddressCode;
    }

    public void setStoreEntrancePicMediaId(String storeEntrancePicMediaId) 
    {
        this.storeEntrancePicMediaId = storeEntrancePicMediaId;
    }

    public String getStoreEntrancePicMediaId() 
    {
        return storeEntrancePicMediaId;
    }

    public void setStoreEntrancePicUrl(String storeEntrancePicUrl) 
    {
        this.storeEntrancePicUrl = storeEntrancePicUrl;
    }

    public String getStoreEntrancePicUrl() 
    {
        return storeEntrancePicUrl;
    }

    public void setIndoorPicMediaId(String indoorPicMediaId) 
    {
        this.indoorPicMediaId = indoorPicMediaId;
    }

    public String getIndoorPicMediaId() 
    {
        return indoorPicMediaId;
    }

    public void setIndoorPicUrl(String indoorPicUrl) 
    {
        this.indoorPicUrl = indoorPicUrl;
    }

    public String getIndoorPicUrl() 
    {
        return indoorPicUrl;
    }

    public void setMerchantShortname(String merchantShortname) 
    {
        this.merchantShortname = merchantShortname;
    }

    public String getMerchantShortname() 
    {
        return merchantShortname;
    }

    public void setServicePhone(String servicePhone) 
    {
        this.servicePhone = servicePhone;
    }

    public String getServicePhone() 
    {
        return servicePhone;
    }

    public void setProductDesc(String productDesc) 
    {
        this.productDesc = productDesc;
    }

    public String getProductDesc() 
    {
        return productDesc;
    }

    public void setRate(String rate) 
    {
        this.rate = rate;
    }

    public String getRate() 
    {
        return rate;
    }

    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
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

    public void setApplymentId(String applymentId) 
    {
        this.applymentId = applymentId;
    }

    public String getApplymentId() 
    {
        return applymentId;
    }

    public void setSubMchId(String subMchId) 
    {
        this.subMchId = subMchId;
    }

    public String getSubMchId() 
    {
        return subMchId;
    }

    public void setSignUrl(String signUrl) 
    {
        this.signUrl = signUrl;
    }

    public String getSignUrl() 
    {
        return signUrl;
    }

    public void setPayConfigStatus(Integer payConfigStatus) 
    {
        this.payConfigStatus = payConfigStatus;
    }

    public Integer getPayConfigStatus() 
    {
        return payConfigStatus;
    }

    public void setStoreAddress(String storeAddress) 
    {
        this.storeAddress = storeAddress;
    }

    public String getStoreAddress() 
    {
        return storeAddress;
    }

    public void setNewIf(Integer newIf) 
    {
        this.newIf = newIf;
    }

    public Integer getNewIf() 
    {
        return newIf;
    }

    public void setContactEmail(String contactEmail) 
    {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() 
    {
        return contactEmail;
    }

    public void setGoldplan(Integer goldplan) 
    {
        this.goldplan = goldplan;
    }

    public Integer getGoldplan() 
    {
        return goldplan;
    }

    public void setSubjectType(Integer subjectType) 
    {
        this.subjectType = subjectType;
    }

    public Integer getSubjectType() 
    {
        return subjectType;
    }

    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }

    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    public void setLicensePicUrl(String licensePicUrl) 
    {
        this.licensePicUrl = licensePicUrl;
    }

    public String getLicensePicUrl() 
    {
        return licensePicUrl;
    }

    public void setLicensePicMediaId(String licensePicMediaId) 
    {
        this.licensePicMediaId = licensePicMediaId;
    }

    public String getLicensePicMediaId() 
    {
        return licensePicMediaId;
    }

    public void setCertType(String certType) 
    {
        this.certType = certType;
    }

    public String getCertType() 
    {
        return certType;
    }

    public void setCertNumber(String certNumber) 
    {
        this.certNumber = certNumber;
    }

    public String getCertNumber() 
    {
        return certNumber;
    }

    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() 
    {
        return companyAddress;
    }

    public void setCertPicUrl(String certPicUrl) 
    {
        this.certPicUrl = certPicUrl;
    }

    public String getCertPicUrl() 
    {
        return certPicUrl;
    }

    public void setCertPicMediaId(String certPicMediaId) 
    {
        this.certPicMediaId = certPicMediaId;
    }

    public String getCertPicMediaId() 
    {
        return certPicMediaId;
    }

    public void setPeriodBegin(String periodBegin) 
    {
        this.periodBegin = periodBegin;
    }

    public String getPeriodBegin() 
    {
        return periodBegin;
    }

    public void setPeriodEnd(String periodEnd) 
    {
        this.periodEnd = periodEnd;
    }

    public String getPeriodEnd() 
    {
        return periodEnd;
    }

    public void setOrganizationCode(String organizationCode) 
    {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() 
    {
        return organizationCode;
    }

    public void setOrgPeriodBegin(String orgPeriodBegin) 
    {
        this.orgPeriodBegin = orgPeriodBegin;
    }

    public String getOrgPeriodBegin() 
    {
        return orgPeriodBegin;
    }

    public void setOrgPeriodEnd(String orgPeriodEnd) 
    {
        this.orgPeriodEnd = orgPeriodEnd;
    }

    public String getOrgPeriodEnd() 
    {
        return orgPeriodEnd;
    }

    public void setOrganizationPicUrl(String organizationPicUrl) 
    {
        this.organizationPicUrl = organizationPicUrl;
    }

    public String getOrganizationPicUrl() 
    {
        return organizationPicUrl;
    }

    public void setOrganizationPicMediaId(String organizationPicMediaId) 
    {
        this.organizationPicMediaId = organizationPicMediaId;
    }

    public String getOrganizationPicMediaId() 
    {
        return organizationPicMediaId;
    }

    public void setIdDocType(String idDocType) 
    {
        this.idDocType = idDocType;
    }

    public String getIdDocType() 
    {
        return idDocType;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setContactIdNumber(String contactIdNumber) 
    {
        this.contactIdNumber = contactIdNumber;
    }

    public String getContactIdNumber() 
    {
        return contactIdNumber;
    }

    public void setIdPeriodBegin(String idPeriodBegin) 
    {
        this.idPeriodBegin = idPeriodBegin;
    }

    public String getIdPeriodBegin() 
    {
        return idPeriodBegin;
    }

    public void setIdPeriodEnd(String idPeriodEnd) 
    {
        this.idPeriodEnd = idPeriodEnd;
    }

    public String getIdPeriodEnd() 
    {
        return idPeriodEnd;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }

    public void setSettlement(String settlement) 
    {
        this.settlement = settlement;
    }

    public String getSettlement() 
    {
        return settlement;
    }

    public void setQualification1Url(String qualification1Url) 
    {
        this.qualification1Url = qualification1Url;
    }

    public String getQualification1Url() 
    {
        return qualification1Url;
    }

    public void setQualification1MediaId(String qualification1MediaId) 
    {
        this.qualification1MediaId = qualification1MediaId;
    }

    public String getQualification1MediaId() 
    {
        return qualification1MediaId;
    }

    public void setQualification2Url(String qualification2Url) 
    {
        this.qualification2Url = qualification2Url;
    }

    public String getQualification2Url() 
    {
        return qualification2Url;
    }

    public void setQualification2MediaId(String qualification2MediaId) 
    {
        this.qualification2MediaId = qualification2MediaId;
    }

    public String getQualification2MediaId() 
    {
        return qualification2MediaId;
    }

    public void setQualification3Url(String qualification3Url) 
    {
        this.qualification3Url = qualification3Url;
    }

    public String getQualification3Url() 
    {
        return qualification3Url;
    }

    public void setQualification3MediaId(String qualification3MediaId) 
    {
        this.qualification3MediaId = qualification3MediaId;
    }

    public String getQualification3MediaId() 
    {
        return qualification3MediaId;
    }

    public void setQualification4Url(String qualification4Url) 
    {
        this.qualification4Url = qualification4Url;
    }

    public String getQualification4Url() 
    {
        return qualification4Url;
    }

    public void setQualification4MediaId(String qualification4MediaId) 
    {
        this.qualification4MediaId = qualification4MediaId;
    }

    public String getQualification4MediaId() 
    {
        return qualification4MediaId;
    }

    public void setQualification5Url(String qualification5Url) 
    {
        this.qualification5Url = qualification5Url;
    }

    public String getQualification5Url() 
    {
        return qualification5Url;
    }

    public void setQualification5MediaId(String qualification5MediaId) 
    {
        this.qualification5MediaId = qualification5MediaId;
    }

    public String getQualification5MediaId() 
    {
        return qualification5MediaId;
    }

    public void setBankAccountType(Integer bankAccountType) 
    {
        this.bankAccountType = bankAccountType;
    }

    public Integer getBankAccountType() 
    {
        return bankAccountType;
    }

    public void setContactType(String contactType) 
    {
        this.contactType = contactType;
    }

    public String getContactType() 
    {
        return contactType;
    }

    public void setContactIdDocType(String contactIdDocType) 
    {
        this.contactIdDocType = contactIdDocType;
    }

    public String getContactIdDocType() 
    {
        return contactIdDocType;
    }

    public void setContactIdDocCopyUrl(String contactIdDocCopyUrl) 
    {
        this.contactIdDocCopyUrl = contactIdDocCopyUrl;
    }

    public String getContactIdDocCopyUrl() 
    {
        return contactIdDocCopyUrl;
    }

    public void setContactIdDocCopyMediaId(String contactIdDocCopyMediaId) 
    {
        this.contactIdDocCopyMediaId = contactIdDocCopyMediaId;
    }

    public String getContactIdDocCopyMediaId() 
    {
        return contactIdDocCopyMediaId;
    }

    public void setContactIdDocCopyBackUrl(String contactIdDocCopyBackUrl) 
    {
        this.contactIdDocCopyBackUrl = contactIdDocCopyBackUrl;
    }

    public String getContactIdDocCopyBackUrl() 
    {
        return contactIdDocCopyBackUrl;
    }

    public void setContactIdDocCopyBackMediaId(String contactIdDocCopyBackMediaId) 
    {
        this.contactIdDocCopyBackMediaId = contactIdDocCopyBackMediaId;
    }

    public String getContactIdDocCopyBackMediaId() 
    {
        return contactIdDocCopyBackMediaId;
    }

    public void setContactPeriodBegin(String contactPeriodBegin) 
    {
        this.contactPeriodBegin = contactPeriodBegin;
    }

    public String getContactPeriodBegin() 
    {
        return contactPeriodBegin;
    }

    public void setContactPeriodEnd(String contactPeriodEnd) 
    {
        this.contactPeriodEnd = contactPeriodEnd;
    }

    public String getContactPeriodEnd() 
    {
        return contactPeriodEnd;
    }

    public void setBusinessAuthorizationLetterUrl(String businessAuthorizationLetterUrl) 
    {
        this.businessAuthorizationLetterUrl = businessAuthorizationLetterUrl;
    }

    public String getBusinessAuthorizationLetterUrl() 
    {
        return businessAuthorizationLetterUrl;
    }

    public void setBusinessAuthorizationLetterMediaId(String businessAuthorizationLetterMediaId) 
    {
        this.businessAuthorizationLetterMediaId = businessAuthorizationLetterMediaId;
    }

    public String getBusinessAuthorizationLetterMediaId() 
    {
        return businessAuthorizationLetterMediaId;
    }

    public void setLicenseAddress(String licenseAddress) 
    {
        this.licenseAddress = licenseAddress;
    }

    public String getLicenseAddress() 
    {
        return licenseAddress;
    }

    public void setLicensePeriodBegin(String licensePeriodBegin) 
    {
        this.licensePeriodBegin = licensePeriodBegin;
    }

    public String getLicensePeriodBegin() 
    {
        return licensePeriodBegin;
    }

    public void setLicensePeriodEnd(String licensePeriodEnd) 
    {
        this.licensePeriodEnd = licensePeriodEnd;
    }

    public String getLicensePeriodEnd() 
    {
        return licensePeriodEnd;
    }

    public void setStoreAddressProvinceCode(String storeAddressProvinceCode) 
    {
        this.storeAddressProvinceCode = storeAddressProvinceCode;
    }

    public String getStoreAddressProvinceCode() 
    {
        return storeAddressProvinceCode;
    }

    public void setBankAddressProvinceCode(String bankAddressProvinceCode) 
    {
        this.bankAddressProvinceCode = bankAddressProvinceCode;
    }

    public String getBankAddressProvinceCode() 
    {
        return bankAddressProvinceCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("businessCode", getBusinessCode())
            .append("idCardName", getIdCardName())
            .append("idCardNumber", getIdCardNumber())
            .append("idCardAddress", getIdCardAddress())
            .append("idCardValidTime", getIdCardValidTime())
            .append("idCardFrontMediaId", getIdCardFrontMediaId())
            .append("idCardFrontUrl", getIdCardFrontUrl())
            .append("idCardBackMediaId", getIdCardBackMediaId())
            .append("idCardBackUrl", getIdCardBackUrl())
            .append("accountBank", getAccountBank())
            .append("bankAddressCode", getBankAddressCode())
            .append("accountNumber", getAccountNumber())
            .append("storeName", getStoreName())
            .append("storeAddressCode", getStoreAddressCode())
            .append("storeEntrancePicMediaId", getStoreEntrancePicMediaId())
            .append("storeEntrancePicUrl", getStoreEntrancePicUrl())
            .append("indoorPicMediaId", getIndoorPicMediaId())
            .append("indoorPicUrl", getIndoorPicUrl())
            .append("merchantShortname", getMerchantShortname())
            .append("servicePhone", getServicePhone())
            .append("productDesc", getProductDesc())
            .append("rate", getRate())
            .append("contactPhone", getContactPhone())
            .append("status", getStatus())
            .append("message", getMessage())
            .append("applymentId", getApplymentId())
            .append("subMchId", getSubMchId())
            .append("signUrl", getSignUrl())
            .append("payConfigStatus", getPayConfigStatus())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("storeAddress", getStoreAddress())
            .append("newIf", getNewIf())
            .append("contactEmail", getContactEmail())
            .append("goldplan", getGoldplan())
            .append("subjectType", getSubjectType())
            .append("merchantName", getMerchantName())
            .append("licenseNumber", getLicenseNumber())
            .append("licensePicUrl", getLicensePicUrl())
            .append("licensePicMediaId", getLicensePicMediaId())
            .append("certType", getCertType())
            .append("certNumber", getCertNumber())
            .append("companyAddress", getCompanyAddress())
            .append("certPicUrl", getCertPicUrl())
            .append("certPicMediaId", getCertPicMediaId())
            .append("periodBegin", getPeriodBegin())
            .append("periodEnd", getPeriodEnd())
            .append("organizationCode", getOrganizationCode())
            .append("orgPeriodBegin", getOrgPeriodBegin())
            .append("orgPeriodEnd", getOrgPeriodEnd())
            .append("organizationPicUrl", getOrganizationPicUrl())
            .append("organizationPicMediaId", getOrganizationPicMediaId())
            .append("idDocType", getIdDocType())
            .append("contactName", getContactName())
            .append("contactIdNumber", getContactIdNumber())
            .append("idPeriodBegin", getIdPeriodBegin())
            .append("idPeriodEnd", getIdPeriodEnd())
            .append("bankName", getBankName())
            .append("settlement", getSettlement())
            .append("qualification1Url", getQualification1Url())
            .append("qualification1MediaId", getQualification1MediaId())
            .append("qualification2Url", getQualification2Url())
            .append("qualification2MediaId", getQualification2MediaId())
            .append("qualification3Url", getQualification3Url())
            .append("qualification3MediaId", getQualification3MediaId())
            .append("qualification4Url", getQualification4Url())
            .append("qualification4MediaId", getQualification4MediaId())
            .append("qualification5Url", getQualification5Url())
            .append("qualification5MediaId", getQualification5MediaId())
            .append("bankAccountType", getBankAccountType())
            .append("contactType", getContactType())
            .append("contactIdDocType", getContactIdDocType())
            .append("contactIdDocCopyUrl", getContactIdDocCopyUrl())
            .append("contactIdDocCopyMediaId", getContactIdDocCopyMediaId())
            .append("contactIdDocCopyBackUrl", getContactIdDocCopyBackUrl())
            .append("contactIdDocCopyBackMediaId", getContactIdDocCopyBackMediaId())
            .append("contactPeriodBegin", getContactPeriodBegin())
            .append("contactPeriodEnd", getContactPeriodEnd())
            .append("businessAuthorizationLetterUrl", getBusinessAuthorizationLetterUrl())
            .append("businessAuthorizationLetterMediaId", getBusinessAuthorizationLetterMediaId())
            .append("licenseAddress", getLicenseAddress())
            .append("licensePeriodBegin", getLicensePeriodBegin())
            .append("licensePeriodEnd", getLicensePeriodEnd())
            .append("storeAddressProvinceCode", getStoreAddressProvinceCode())
            .append("bankAddressProvinceCode", getBankAddressProvinceCode())
            .toString();
    }
}
