package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_user
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String openId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String password;

    /** $column.columnComment */
    @Excel(name = "${邮箱}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String province;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String city;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String area;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shopAuth;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long payAuth;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String payMethod;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mpAppid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mpSecret;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mpToken;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mchId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String apiKey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String wxP12;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayPid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayAppid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayAuthtoken;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayAlipaypublickey2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipaySigntype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long wxSubmch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long alipaySubmch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oneword;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accountNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accountName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayAccountno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastLogintime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lastLoginip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal balance;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long integral;

    /** 折扣 */
    @Excel(name = "折扣")
    private BigDecimal discount;

    /** 接口登录令牌 */
    @Excel(name = "接口登录令牌")
    private String token;

    /** 支付方式(0:一码付,1:微信和支付宝 */
    @Excel(name = "支付方式(0:一码付,1:微信和支付宝")
    private Integer payType;

    /** 分账费率 */
    @Excel(name = "分账费率")
    private BigDecimal ratedis;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String logo;

    /** 扶贫运营商ID */
    @Excel(name = "扶贫运营商ID")
    private String fpOperatorId;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String company;

    /** 扶贫柜私钥 */
    @Excel(name = "扶贫柜私钥")
    private String fppayPrivatekey;

    /** 扶贫柜公钥 */
    @Excel(name = "扶贫柜公钥")
    private String fppayPublickey;

    /** 用户所属运营商ID */
    @Excel(name = "用户所属运营商ID")
    private Long operatorUserId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipayPrivatekey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer scene;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alipaySmid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String organizationId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String schoolName;

    /** IC卡充值最低充值额度（元） */
    @Excel(name = "IC卡充值最低充值额度", readConverterExp = "元=")
    private BigDecimal iccardQuota;

    /** 会员充值最低充值额度（元） */
    @Excel(name = "会员充值最低充值额度", readConverterExp = "元=")
    private BigDecimal memberQuota;

    /** $column.columnComment */
    @Excel(name = "${联系电话}", readConverterExp = "$column.readConverterExp()")
    private String contactPhone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer split;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer aliConType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ghlMerchantid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ghlTerminalid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ghlPrivatekey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String aliSchoolId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer lrSw;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer priceSw;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer refundSw;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ban;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer registerSign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date pscDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer pscCount;

    /** $column.columnComment */
    @Excel(name = "${国家}", readConverterExp = "$column.readConverterExp()")
    private String country;

    /** $column.columnComment */
    @Excel(name = "${时区}", readConverterExp = "$column.readConverterExp()")
    private Integer timeZone;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }

    public void setShopAuth(Long shopAuth) 
    {
        this.shopAuth = shopAuth;
    }

    public Long getShopAuth() 
    {
        return shopAuth;
    }

    public void setPayAuth(Long payAuth) 
    {
        this.payAuth = payAuth;
    }

    public Long getPayAuth() 
    {
        return payAuth;
    }

    public void setPayMethod(String payMethod) 
    {
        this.payMethod = payMethod;
    }

    public String getPayMethod() 
    {
        return payMethod;
    }

    public void setMpAppid(String mpAppid) 
    {
        this.mpAppid = mpAppid;
    }

    public String getMpAppid() 
    {
        return mpAppid;
    }

    public void setMpSecret(String mpSecret) 
    {
        this.mpSecret = mpSecret;
    }

    public String getMpSecret() 
    {
        return mpSecret;
    }

    public void setMpToken(String mpToken) 
    {
        this.mpToken = mpToken;
    }

    public String getMpToken() 
    {
        return mpToken;
    }

    public void setMchId(String mchId) 
    {
        this.mchId = mchId;
    }

    public String getMchId() 
    {
        return mchId;
    }

    public void setApiKey(String apiKey) 
    {
        this.apiKey = apiKey;
    }

    public String getApiKey() 
    {
        return apiKey;
    }

    public void setWxP12(String wxP12) 
    {
        this.wxP12 = wxP12;
    }

    public String getWxP12() 
    {
        return wxP12;
    }

    public void setAlipayPid(String alipayPid) 
    {
        this.alipayPid = alipayPid;
    }

    public String getAlipayPid() 
    {
        return alipayPid;
    }

    public void setAlipayAppid(String alipayAppid) 
    {
        this.alipayAppid = alipayAppid;
    }

    public String getAlipayAppid() 
    {
        return alipayAppid;
    }

    public void setAlipayAuthtoken(String alipayAuthtoken) 
    {
        this.alipayAuthtoken = alipayAuthtoken;
    }

    public String getAlipayAuthtoken() 
    {
        return alipayAuthtoken;
    }

    public void setAlipayAlipaypublickey2(String alipayAlipaypublickey2) 
    {
        this.alipayAlipaypublickey2 = alipayAlipaypublickey2;
    }

    public String getAlipayAlipaypublickey2() 
    {
        return alipayAlipaypublickey2;
    }

    public void setAlipaySigntype(String alipaySigntype) 
    {
        this.alipaySigntype = alipaySigntype;
    }

    public String getAlipaySigntype() 
    {
        return alipaySigntype;
    }

    public void setWxSubmch(Long wxSubmch) 
    {
        this.wxSubmch = wxSubmch;
    }

    public Long getWxSubmch() 
    {
        return wxSubmch;
    }

    public void setAlipaySubmch(Long alipaySubmch) 
    {
        this.alipaySubmch = alipaySubmch;
    }

    public Long getAlipaySubmch() 
    {
        return alipaySubmch;
    }

    public void setOneword(String oneword) 
    {
        this.oneword = oneword;
    }

    public String getOneword() 
    {
        return oneword;
    }

    public void setAccountNo(String accountNo) 
    {
        this.accountNo = accountNo;
    }

    public String getAccountNo() 
    {
        return accountNo;
    }

    public void setAccountName(String accountName) 
    {
        this.accountName = accountName;
    }

    public String getAccountName() 
    {
        return accountName;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }

    public void setAlipayAccountno(String alipayAccountno) 
    {
        this.alipayAccountno = alipayAccountno;
    }

    public String getAlipayAccountno() 
    {
        return alipayAccountno;
    }

    public void setLastLogintime(Date lastLogintime) 
    {
        this.lastLogintime = lastLogintime;
    }

    public Date getLastLogintime() 
    {
        return lastLogintime;
    }

    public void setLastLoginip(String lastLoginip) 
    {
        this.lastLoginip = lastLoginip;
    }

    public String getLastLoginip() 
    {
        return lastLoginip;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }

    public void setBalance(BigDecimal balance) 
    {
        this.balance = balance;
    }

    public BigDecimal getBalance() 
    {
        return balance;
    }

    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }

    public void setDiscount(BigDecimal discount) 
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount() 
    {
        return discount;
    }

    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }

    public void setPayType(Integer payType) 
    {
        this.payType = payType;
    }

    public Integer getPayType() 
    {
        return payType;
    }

    public void setRatedis(BigDecimal ratedis) 
    {
        this.ratedis = ratedis;
    }

    public BigDecimal getRatedis() 
    {
        return ratedis;
    }

    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }

    public void setFpOperatorId(String fpOperatorId) 
    {
        this.fpOperatorId = fpOperatorId;
    }

    public String getFpOperatorId() 
    {
        return fpOperatorId;
    }

    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }

    public void setFppayPrivatekey(String fppayPrivatekey) 
    {
        this.fppayPrivatekey = fppayPrivatekey;
    }

    public String getFppayPrivatekey() 
    {
        return fppayPrivatekey;
    }

    public void setFppayPublickey(String fppayPublickey) 
    {
        this.fppayPublickey = fppayPublickey;
    }

    public String getFppayPublickey() 
    {
        return fppayPublickey;
    }

    public void setOperatorUserId(Long operatorUserId) 
    {
        this.operatorUserId = operatorUserId;
    }

    public Long getOperatorUserId() 
    {
        return operatorUserId;
    }

    public void setAlipayPrivatekey(String alipayPrivatekey) 
    {
        this.alipayPrivatekey = alipayPrivatekey;
    }

    public String getAlipayPrivatekey() 
    {
        return alipayPrivatekey;
    }

    public void setScene(Integer scene) 
    {
        this.scene = scene;
    }

    public Integer getScene() 
    {
        return scene;
    }

    public void setAlipaySmid(String alipaySmid) 
    {
        this.alipaySmid = alipaySmid;
    }

    public String getAlipaySmid() 
    {
        return alipaySmid;
    }

    public void setOrganizationId(String organizationId) 
    {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() 
    {
        return organizationId;
    }

    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }

    public void setIccardQuota(BigDecimal iccardQuota) 
    {
        this.iccardQuota = iccardQuota;
    }

    public BigDecimal getIccardQuota() 
    {
        return iccardQuota;
    }

    public void setMemberQuota(BigDecimal memberQuota) 
    {
        this.memberQuota = memberQuota;
    }

    public BigDecimal getMemberQuota() 
    {
        return memberQuota;
    }

    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }

    public void setSplit(Integer split) 
    {
        this.split = split;
    }

    public Integer getSplit() 
    {
        return split;
    }

    public void setAliConType(Integer aliConType) 
    {
        this.aliConType = aliConType;
    }

    public Integer getAliConType() 
    {
        return aliConType;
    }

    public void setGhlMerchantid(String ghlMerchantid) 
    {
        this.ghlMerchantid = ghlMerchantid;
    }

    public String getGhlMerchantid() 
    {
        return ghlMerchantid;
    }

    public void setGhlTerminalid(String ghlTerminalid) 
    {
        this.ghlTerminalid = ghlTerminalid;
    }

    public String getGhlTerminalid() 
    {
        return ghlTerminalid;
    }

    public void setGhlPrivatekey(String ghlPrivatekey) 
    {
        this.ghlPrivatekey = ghlPrivatekey;
    }

    public String getGhlPrivatekey() 
    {
        return ghlPrivatekey;
    }

    public void setAliSchoolId(String aliSchoolId) 
    {
        this.aliSchoolId = aliSchoolId;
    }

    public String getAliSchoolId() 
    {
        return aliSchoolId;
    }

    public void setLrSw(Integer lrSw) 
    {
        this.lrSw = lrSw;
    }

    public Integer getLrSw() 
    {
        return lrSw;
    }

    public void setPriceSw(Integer priceSw) 
    {
        this.priceSw = priceSw;
    }

    public Integer getPriceSw() 
    {
        return priceSw;
    }

    public void setRefundSw(Integer refundSw) 
    {
        this.refundSw = refundSw;
    }

    public Integer getRefundSw() 
    {
        return refundSw;
    }

    public void setBan(Integer ban) 
    {
        this.ban = ban;
    }

    public Integer getBan() 
    {
        return ban;
    }

    public void setRegisterSign(Integer registerSign) 
    {
        this.registerSign = registerSign;
    }

    public Integer getRegisterSign() 
    {
        return registerSign;
    }

    public void setPscDate(Date pscDate) 
    {
        this.pscDate = pscDate;
    }

    public Date getPscDate() 
    {
        return pscDate;
    }

    public void setPscCount(Integer pscCount) 
    {
        this.pscCount = pscCount;
    }

    public Integer getPscCount() 
    {
        return pscCount;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }

    public String getCountry() 
    {
        return country;
    }

    public void setTimeZone(Integer timeZone) 
    {
        this.timeZone = timeZone;
    }

    public Integer getTimeZone() 
    {
        return timeZone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("openId", getOpenId())
            .append("userName", getUserName())
            .append("password", getPassword())
            .append("email", getEmail())
            .append("phone", getPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("area", getArea())
            .append("address", getAddress())
            .append("contact", getContact())
            .append("shopAuth", getShopAuth())
            .append("payAuth", getPayAuth())
            .append("payMethod", getPayMethod())
            .append("mpAppid", getMpAppid())
            .append("mpSecret", getMpSecret())
            .append("mpToken", getMpToken())
            .append("mchId", getMchId())
            .append("apiKey", getApiKey())
            .append("wxP12", getWxP12())
            .append("alipayPid", getAlipayPid())
            .append("alipayAppid", getAlipayAppid())
            .append("alipayAuthtoken", getAlipayAuthtoken())
            .append("alipayAlipaypublickey2", getAlipayAlipaypublickey2())
            .append("alipaySigntype", getAlipaySigntype())
            .append("wxSubmch", getWxSubmch())
            .append("alipaySubmch", getAlipaySubmch())
            .append("oneword", getOneword())
            .append("accountNo", getAccountNo())
            .append("accountName", getAccountName())
            .append("bankName", getBankName())
            .append("alipayAccountno", getAlipayAccountno())
            .append("lastLogintime", getLastLogintime())
            .append("lastLoginip", getLastLoginip())
            .append("status", getStatus())
            .append("sort", getSort())
            .append("createTime", getCreateTime())
            .append("balance", getBalance())
            .append("integral", getIntegral())
            .append("discount", getDiscount())
            .append("token", getToken())
            .append("payType", getPayType())
            .append("ratedis", getRatedis())
            .append("logo", getLogo())
            .append("fpOperatorId", getFpOperatorId())
            .append("company", getCompany())
            .append("fppayPrivatekey", getFppayPrivatekey())
            .append("fppayPublickey", getFppayPublickey())
            .append("operatorUserId", getOperatorUserId())
            .append("alipayPrivatekey", getAlipayPrivatekey())
            .append("scene", getScene())
            .append("alipaySmid", getAlipaySmid())
            .append("organizationId", getOrganizationId())
            .append("schoolName", getSchoolName())
            .append("iccardQuota", getIccardQuota())
            .append("memberQuota", getMemberQuota())
            .append("contactPhone", getContactPhone())
            .append("split", getSplit())
            .append("aliConType", getAliConType())
            .append("ghlMerchantid", getGhlMerchantid())
            .append("ghlTerminalid", getGhlTerminalid())
            .append("ghlPrivatekey", getGhlPrivatekey())
            .append("aliSchoolId", getAliSchoolId())
            .append("lrSw", getLrSw())
            .append("priceSw", getPriceSw())
            .append("refundSw", getRefundSw())
            .append("ban", getBan())
            .append("registerSign", getRegisterSign())
            .append("pscDate", getPscDate())
            .append("pscCount", getPscCount())
            .append("country", getCountry())
            .append("timeZone", getTimeZone())
            .toString();
    }
}
