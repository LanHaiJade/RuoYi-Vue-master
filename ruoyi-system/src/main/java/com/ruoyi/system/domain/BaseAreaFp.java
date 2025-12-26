package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 省市县对象 base_area_fp
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseAreaFp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String regionid;

    /** 省级编码 */
    @Excel(name = "省级编码")
    private String province;

    /** 省级名称 */
    @Excel(name = "省级名称")
    private String provincename;

    /** 市级编码 */
    @Excel(name = "市级编码")
    private String city;

    /** 市级名称 */
    @Excel(name = "市级名称")
    private String cityname;

    /** 县级编码 */
    @Excel(name = "县级编码")
    private String district;

    /** 县级名称 */
    @Excel(name = "县级名称")
    private String districtname;

    /** 经度 */
    @Excel(name = "经度")
    private String lng;

    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;

    /** 状态0.正常, 1弃用 */
    @Excel(name = "状态0.正常, 1弃用")
    private Integer status;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setRegionid(String regionid)
    {
        this.regionid = regionid;
    }

    public String getRegionid() 
    {
        return regionid;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setProvincename(String provincename) 
    {
        this.provincename = provincename;
    }

    public String getProvincename() 
    {
        return provincename;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCityname(String cityname) 
    {
        this.cityname = cityname;
    }

    public String getCityname() 
    {
        return cityname;
    }

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setDistrictname(String districtname) 
    {
        this.districtname = districtname;
    }

    public String getDistrictname() 
    {
        return districtname;
    }

    public void setLng(String lng) 
    {
        this.lng = lng;
    }

    public String getLng() 
    {
        return lng;
    }

    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("regionid", getRegionid())
            .append("province", getProvince())
            .append("provincename", getProvincename())
            .append("city", getCity())
            .append("cityname", getCityname())
            .append("district", getDistrict())
            .append("districtname", getDistrictname())
            .append("lng", getLng())
            .append("lat", getLat())
            .append("status", getStatus())
            .append("updatetime", getUpdatetime())
            .toString();
    }
}
