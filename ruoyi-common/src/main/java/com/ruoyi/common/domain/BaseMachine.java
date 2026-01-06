package com.ruoyi.common.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 【请填写功能名称】对象 base_machine
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String iccid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String version;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hardVersion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sbNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal zbqYue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal ybqYue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer zbqStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ybqStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ysjStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kzbStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer gprsStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer errorStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer network;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer slotsum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer boxnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ds;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer leftStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer rightStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String leftTemperature;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rightTemperature;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String model;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer controlStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer machineType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer unsold;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer hardwareType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer sort;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String json;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String latitude;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String longitude;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String province;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String city;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String district;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date replenishTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal rent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String moboSn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cameraSn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer buyQuota;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer autoRefund;

    /** 扶贫柜激活状态 0未激活1激活 */
    @Excel(name = "扶贫柜激活状态 0未激活1激活")
    private Integer fpType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String orderNo;

    /** 显示货道配置，0显示全部，其余配置显示部分 */
    @Excel(name = "显示货道配置，0显示全部，其余配置显示部分")
    private String huodaoShow;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date serEndTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal rentSer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer alisettled;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String aliTerId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mtId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer svlc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date svlcTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String erpOrderNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date zbTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shRemark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ghType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ghSh;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ghXk;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date ghTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setSbId(String sbId) 
    {
        this.sbId = sbId;
    }

    public String getSbId() 
    {
        return sbId;
    }

    public void setSbName(String sbName) 
    {
        this.sbName = sbName;
    }

    public String getSbName() 
    {
        return sbName;
    }

    public void setIccid(String iccid) 
    {
        this.iccid = iccid;
    }

    public String getIccid() 
    {
        return iccid;
    }

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setHardVersion(String hardVersion) 
    {
        this.hardVersion = hardVersion;
    }

    public String getHardVersion() 
    {
        return hardVersion;
    }

    public void setSbNo(String sbNo) 
    {
        this.sbNo = sbNo;
    }

    public String getSbNo() 
    {
        return sbNo;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public void setZbqYue(BigDecimal zbqYue) 
    {
        this.zbqYue = zbqYue;
    }

    public BigDecimal getZbqYue() 
    {
        return zbqYue;
    }

    public void setYbqYue(BigDecimal ybqYue) 
    {
        this.ybqYue = ybqYue;
    }

    public BigDecimal getYbqYue() 
    {
        return ybqYue;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setZbqStatus(Integer zbqStatus) 
    {
        this.zbqStatus = zbqStatus;
    }

    public Integer getZbqStatus() 
    {
        return zbqStatus;
    }

    public void setYbqStatus(Integer ybqStatus) 
    {
        this.ybqStatus = ybqStatus;
    }

    public Integer getYbqStatus() 
    {
        return ybqStatus;
    }

    public void setYsjStatus(Integer ysjStatus) 
    {
        this.ysjStatus = ysjStatus;
    }

    public Integer getYsjStatus() 
    {
        return ysjStatus;
    }

    public void setKzbStatus(Integer kzbStatus) 
    {
        this.kzbStatus = kzbStatus;
    }

    public Integer getKzbStatus() 
    {
        return kzbStatus;
    }

    public void setGprsStatus(Integer gprsStatus) 
    {
        this.gprsStatus = gprsStatus;
    }

    public Integer getGprsStatus() 
    {
        return gprsStatus;
    }

    public void setErrorStatus(Integer errorStatus) 
    {
        this.errorStatus = errorStatus;
    }

    public Integer getErrorStatus() 
    {
        return errorStatus;
    }

    public void setNetwork(Integer network) 
    {
        this.network = network;
    }

    public Integer getNetwork() 
    {
        return network;
    }

    public void setSlotsum(Integer slotsum) 
    {
        this.slotsum = slotsum;
    }

    public Integer getSlotsum() 
    {
        return slotsum;
    }

    public void setBoxnum(Integer boxnum) 
    {
        this.boxnum = boxnum;
    }

    public Integer getBoxnum() 
    {
        return boxnum;
    }

    public void setDs(Integer ds) 
    {
        this.ds = ds;
    }

    public Integer getDs() 
    {
        return ds;
    }

    public void setLeftStatus(Integer leftStatus) 
    {
        this.leftStatus = leftStatus;
    }

    public Integer getLeftStatus() 
    {
        return leftStatus;
    }

    public void setRightStatus(Integer rightStatus) 
    {
        this.rightStatus = rightStatus;
    }

    public Integer getRightStatus() 
    {
        return rightStatus;
    }

    public void setLeftTemperature(String leftTemperature) 
    {
        this.leftTemperature = leftTemperature;
    }

    public String getLeftTemperature() 
    {
        return leftTemperature;
    }

    public void setRightTemperature(String rightTemperature) 
    {
        this.rightTemperature = rightTemperature;
    }

    public String getRightTemperature() 
    {
        return rightTemperature;
    }

    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    public void setControlStatus(Integer controlStatus) 
    {
        this.controlStatus = controlStatus;
    }

    public Integer getControlStatus() 
    {
        return controlStatus;
    }

    public void setMachineType(Integer machineType) 
    {
        this.machineType = machineType;
    }

    public Integer getMachineType() 
    {
        return machineType;
    }

    public void setUnsold(Integer unsold) 
    {
        this.unsold = unsold;
    }

    public Integer getUnsold() 
    {
        return unsold;
    }

    public void setHardwareType(Integer hardwareType) 
    {
        this.hardwareType = hardwareType;
    }

    public Integer getHardwareType() 
    {
        return hardwareType;
    }

    public void setSort(Integer sort) 
    {
        this.sort = sort;
    }

    public Integer getSort() 
    {
        return sort;
    }

    public void setJson(String json) 
    {
        this.json = json;
    }

    public String getJson() 
    {
        return json;
    }

    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }

    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }

    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
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

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setReplenishTime(Date replenishTime) 
    {
        this.replenishTime = replenishTime;
    }

    public Date getReplenishTime() 
    {
        return replenishTime;
    }

    public void setRent(BigDecimal rent) 
    {
        this.rent = rent;
    }

    public BigDecimal getRent() 
    {
        return rent;
    }

    public void setMoboSn(String moboSn) 
    {
        this.moboSn = moboSn;
    }

    public String getMoboSn() 
    {
        return moboSn;
    }

    public void setCameraSn(String cameraSn) 
    {
        this.cameraSn = cameraSn;
    }

    public String getCameraSn() 
    {
        return cameraSn;
    }

    public void setBuyQuota(Integer buyQuota) 
    {
        this.buyQuota = buyQuota;
    }

    public Integer getBuyQuota() 
    {
        return buyQuota;
    }

    public void setAutoRefund(Integer autoRefund) 
    {
        this.autoRefund = autoRefund;
    }

    public Integer getAutoRefund() 
    {
        return autoRefund;
    }

    public void setFpType(Integer fpType) 
    {
        this.fpType = fpType;
    }

    public Integer getFpType() 
    {
        return fpType;
    }

    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }

    public void setHuodaoShow(String huodaoShow) 
    {
        this.huodaoShow = huodaoShow;
    }

    public String getHuodaoShow() 
    {
        return huodaoShow;
    }

    public void setSerEndTime(Date serEndTime) 
    {
        this.serEndTime = serEndTime;
    }

    public Date getSerEndTime() 
    {
        return serEndTime;
    }

    public void setRentSer(BigDecimal rentSer) 
    {
        this.rentSer = rentSer;
    }

    public BigDecimal getRentSer() 
    {
        return rentSer;
    }

    public void setAlisettled(Integer alisettled) 
    {
        this.alisettled = alisettled;
    }

    public Integer getAlisettled() 
    {
        return alisettled;
    }

    public void setAliTerId(String aliTerId) 
    {
        this.aliTerId = aliTerId;
    }

    public String getAliTerId() 
    {
        return aliTerId;
    }

    public void setMtId(String mtId) 
    {
        this.mtId = mtId;
    }

    public String getMtId() 
    {
        return mtId;
    }

    public void setSvlc(Integer svlc) 
    {
        this.svlc = svlc;
    }

    public Integer getSvlc() 
    {
        return svlc;
    }

    public void setSvlcTime(Date svlcTime) 
    {
        this.svlcTime = svlcTime;
    }

    public Date getSvlcTime() 
    {
        return svlcTime;
    }

    public void setErpOrderNo(String erpOrderNo) 
    {
        this.erpOrderNo = erpOrderNo;
    }

    public String getErpOrderNo() 
    {
        return erpOrderNo;
    }

    public void setZbTime(Date zbTime) 
    {
        this.zbTime = zbTime;
    }

    public Date getZbTime() 
    {
        return zbTime;
    }

    public void setShRemark(String shRemark) 
    {
        this.shRemark = shRemark;
    }

    public String getShRemark() 
    {
        return shRemark;
    }

    public void setGhType(Integer ghType) 
    {
        this.ghType = ghType;
    }

    public Integer getGhType() 
    {
        return ghType;
    }

    public void setGhSh(String ghSh) 
    {
        this.ghSh = ghSh;
    }

    public String getGhSh() 
    {
        return ghSh;
    }

    public void setGhXk(String ghXk) 
    {
        this.ghXk = ghXk;
    }

    public String getGhXk() 
    {
        return ghXk;
    }

    public void setGhTime(Date ghTime) 
    {
        this.ghTime = ghTime;
    }

    public Date getGhTime() 
    {
        return ghTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("sbName", getSbName())
            .append("iccid", getIccid())
            .append("version", getVersion())
            .append("hardVersion", getHardVersion())
            .append("sbNo", getSbNo())
            .append("userId", getUserId())
            .append("endTime", getEndTime())
            .append("zbqYue", getZbqYue())
            .append("ybqYue", getYbqYue())
            .append("status", getStatus())
            .append("zbqStatus", getZbqStatus())
            .append("ybqStatus", getYbqStatus())
            .append("ysjStatus", getYsjStatus())
            .append("kzbStatus", getKzbStatus())
            .append("gprsStatus", getGprsStatus())
            .append("errorStatus", getErrorStatus())
            .append("network", getNetwork())
            .append("slotsum", getSlotsum())
            .append("boxnum", getBoxnum())
            .append("ds", getDs())
            .append("leftStatus", getLeftStatus())
            .append("rightStatus", getRightStatus())
            .append("leftTemperature", getLeftTemperature())
            .append("rightTemperature", getRightTemperature())
            .append("type", getType())
            .append("model", getModel())
            .append("controlStatus", getControlStatus())
            .append("machineType", getMachineType())
            .append("unsold", getUnsold())
            .append("hardwareType", getHardwareType())
            .append("sort", getSort())
            .append("json", getJson())
            .append("latitude", getLatitude())
            .append("longitude", getLongitude())
            .append("ip", getIp())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("address", getAddress())
            .append("replenishTime", getReplenishTime())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("rent", getRent())
            .append("moboSn", getMoboSn())
            .append("cameraSn", getCameraSn())
            .append("buyQuota", getBuyQuota())
            .append("autoRefund", getAutoRefund())
            .append("fpType", getFpType())
            .append("orderNo", getOrderNo())
            .append("huodaoShow", getHuodaoShow())
            .append("serEndTime", getSerEndTime())
            .append("rentSer", getRentSer())
            .append("alisettled", getAlisettled())
            .append("aliTerId", getAliTerId())
            .append("mtId", getMtId())
            .append("svlc", getSvlc())
            .append("svlcTime", getSvlcTime())
            .append("erpOrderNo", getErpOrderNo())
            .append("zbTime", getZbTime())
            .append("shRemark", getShRemark())
            .append("ghType", getGhType())
            .append("ghSh", getGhSh())
            .append("ghXk", getGhXk())
            .append("ghTime", getGhTime())
            .toString();
    }
}
