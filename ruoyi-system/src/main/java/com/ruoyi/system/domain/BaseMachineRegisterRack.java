package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_machine_register_rack
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseMachineRegisterRack extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String sbId;

    /** 扶贫网机柜编号 */
    @Excel(name = "扶贫网机柜编号")
    private String containerid;

    /** 机柜名称 */
    @Excel(name = "机柜名称")
    private String machinename;

    /** 专柜规模，若没有值，传“-” */
    @Excel(name = "专柜规模，若没有值，传“-”")
    private String spctrsz;

    /** 专柜特色，若没有值，传“-” */
    @Excel(name = "专柜特色，若没有值，传“-”")
    private String spctrspclz;

    /** 专柜简介，若没有值，传“-” */
    @Excel(name = "专柜简介，若没有值，传“-”")
    private String brf;

    /** 营业时间：00:00,23:59 */
    @Excel(name = "营业时间：00:00,23:59")
    private String oprgtm;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String ctcpsnnm;

    /** 联系人手机 */
    @Excel(name = "联系人手机")
    private String ctcpsnmblph;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String eqmtmodl;

    /** 场景值 */
    @Excel(name = "场景值")
    private String sceneid;

    /** 设备状态：正常，运维中，已报损 */
    @Excel(name = "设备状态：正常，运维中，已报损")
    private String eqmtst;

    /** 营业中 0 非营运中 1 */
    @Excel(name = "营业中 0 非营运中 1")
    private String isrun;

    /** 运营时间，用,隔开 */
    @Excel(name = "运营时间，用,隔开")
    private String runtimespan;

    /** 机柜规模，若没有值，传“-” */
    @Excel(name = "机柜规模，若没有值，传“-”")
    private String scale;

    /** 机柜特色 */
    @Excel(name = "机柜特色")
    private String selllingpoint;

    /** 机柜运营商:****有限公司 */
    @Excel(name = "机柜运营商:****有限公司")
    private String runby;

    /** 机柜描述:以售卖扶贫产品为主的消费扶贫柜 */
    @Excel(name = "机柜描述:以售卖扶贫产品为主的消费扶贫柜")
    private String desription;

    /** 真实地址 */
    @Excel(name = "真实地址")
    private String dailaddress;

    /** 展示地址 */
    @Excel(name = "展示地址")
    private String location;

    /** 经度 */
    @Excel(name = "经度")
    private String lon;

    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;

    /** 机柜图片 */
    @Excel(name = "机柜图片")
    private String pic;

    /** 识别模式 */
    @Excel(name = "识别模式")
    private Integer recomode;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String mobile;

    /** 地区id */
    @Excel(name = "地区id")
    private String regionid;

    /** 省id */
    @Excel(name = "省id")
    private String provinceid;

    /** 省名称 */
    @Excel(name = "省名称")
    private String province;

    /** 市id */
    @Excel(name = "市id")
    private String cityid;

    /** 市名称 */
    @Excel(name = "市名称")
    private String cityname;

    /** 县id */
    @Excel(name = "县id")
    private String countyid;

    /** 县名称 */
    @Excel(name = "县名称")
    private String county;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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

    public void setContainerid(String containerid) 
    {
        this.containerid = containerid;
    }

    public String getContainerid() 
    {
        return containerid;
    }

    public void setMachinename(String machinename) 
    {
        this.machinename = machinename;
    }

    public String getMachinename() 
    {
        return machinename;
    }

    public void setSpctrsz(String spctrsz) 
    {
        this.spctrsz = spctrsz;
    }

    public String getSpctrsz() 
    {
        return spctrsz;
    }

    public void setSpctrspclz(String spctrspclz) 
    {
        this.spctrspclz = spctrspclz;
    }

    public String getSpctrspclz() 
    {
        return spctrspclz;
    }

    public void setBrf(String brf) 
    {
        this.brf = brf;
    }

    public String getBrf() 
    {
        return brf;
    }

    public void setOprgtm(String oprgtm) 
    {
        this.oprgtm = oprgtm;
    }

    public String getOprgtm() 
    {
        return oprgtm;
    }

    public void setCtcpsnnm(String ctcpsnnm) 
    {
        this.ctcpsnnm = ctcpsnnm;
    }

    public String getCtcpsnnm() 
    {
        return ctcpsnnm;
    }

    public void setCtcpsnmblph(String ctcpsnmblph) 
    {
        this.ctcpsnmblph = ctcpsnmblph;
    }

    public String getCtcpsnmblph() 
    {
        return ctcpsnmblph;
    }

    public void setEqmtmodl(String eqmtmodl) 
    {
        this.eqmtmodl = eqmtmodl;
    }

    public String getEqmtmodl() 
    {
        return eqmtmodl;
    }

    public void setSceneid(String sceneid) 
    {
        this.sceneid = sceneid;
    }

    public String getSceneid() 
    {
        return sceneid;
    }

    public void setEqmtst(String eqmtst) 
    {
        this.eqmtst = eqmtst;
    }

    public String getEqmtst() 
    {
        return eqmtst;
    }

    public void setIsrun(String isrun) 
    {
        this.isrun = isrun;
    }

    public String getIsrun() 
    {
        return isrun;
    }

    public void setRuntimespan(String runtimespan) 
    {
        this.runtimespan = runtimespan;
    }

    public String getRuntimespan() 
    {
        return runtimespan;
    }

    public void setScale(String scale) 
    {
        this.scale = scale;
    }

    public String getScale() 
    {
        return scale;
    }

    public void setSelllingpoint(String selllingpoint) 
    {
        this.selllingpoint = selllingpoint;
    }

    public String getSelllingpoint() 
    {
        return selllingpoint;
    }

    public void setRunby(String runby) 
    {
        this.runby = runby;
    }

    public String getRunby() 
    {
        return runby;
    }

    public void setDesription(String desription) 
    {
        this.desription = desription;
    }

    public String getDesription() 
    {
        return desription;
    }

    public void setDailaddress(String dailaddress) 
    {
        this.dailaddress = dailaddress;
    }

    public String getDailaddress() 
    {
        return dailaddress;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    public void setLon(String lon) 
    {
        this.lon = lon;
    }

    public String getLon() 
    {
        return lon;
    }

    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }

    public void setPic(String pic) 
    {
        this.pic = pic;
    }

    public String getPic() 
    {
        return pic;
    }

    public void setRecomode(Integer recomode) 
    {
        this.recomode = recomode;
    }

    public Integer getRecomode() 
    {
        return recomode;
    }

    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }

    public void setRegionid(String regionid) 
    {
        this.regionid = regionid;
    }

    public String getRegionid() 
    {
        return regionid;
    }

    public void setProvinceid(String provinceid) 
    {
        this.provinceid = provinceid;
    }

    public String getProvinceid() 
    {
        return provinceid;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setCityid(String cityid) 
    {
        this.cityid = cityid;
    }

    public String getCityid() 
    {
        return cityid;
    }

    public void setCityname(String cityname) 
    {
        this.cityname = cityname;
    }

    public String getCityname() 
    {
        return cityname;
    }

    public void setCountyid(String countyid) 
    {
        this.countyid = countyid;
    }

    public String getCountyid() 
    {
        return countyid;
    }

    public void setCounty(String county) 
    {
        this.county = county;
    }

    public String getCounty() 
    {
        return county;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sbId", getSbId())
            .append("containerid", getContainerid())
            .append("machinename", getMachinename())
            .append("spctrsz", getSpctrsz())
            .append("spctrspclz", getSpctrspclz())
            .append("brf", getBrf())
            .append("oprgtm", getOprgtm())
            .append("ctcpsnnm", getCtcpsnnm())
            .append("ctcpsnmblph", getCtcpsnmblph())
            .append("eqmtmodl", getEqmtmodl())
            .append("sceneid", getSceneid())
            .append("eqmtst", getEqmtst())
            .append("isrun", getIsrun())
            .append("runtimespan", getRuntimespan())
            .append("scale", getScale())
            .append("selllingpoint", getSelllingpoint())
            .append("runby", getRunby())
            .append("desription", getDesription())
            .append("dailaddress", getDailaddress())
            .append("location", getLocation())
            .append("lon", getLon())
            .append("lat", getLat())
            .append("pic", getPic())
            .append("recomode", getRecomode())
            .append("mobile", getMobile())
            .append("regionid", getRegionid())
            .append("provinceid", getProvinceid())
            .append("province", getProvince())
            .append("cityid", getCityid())
            .append("cityname", getCityname())
            .append("countyid", getCountyid())
            .append("county", getCounty())
            .toString();
    }
}
