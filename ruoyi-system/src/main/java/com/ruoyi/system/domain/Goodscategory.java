package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 商品分类对象 goodscategory
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class Goodscategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 根据uuid规则生成的系统唯一的32位主键 */
    private String categoryid;

    /** 一级类目编码 */
    @Excel(name = "一级类目编码")
    private String category1code;

    /** 一级类目名称 */
    @Excel(name = "一级类目名称")
    private String category1name;

    /** 二级类目编码 */
    @Excel(name = "二级类目编码")
    private String category2code;

    /** 二级类目名称 */
    @Excel(name = "二级类目名称")
    private String category2name;

    /** 分类编码(三级类目编码) */
    @Excel(name = "分类编码(三级类目编码)")
    private String code;

    /** 分类名称(三级类目名称) */
    @Excel(name = "分类名称(三级类目名称)")
    private String categoryname;

    /** 当前表中的父分类id ,取值当前表主键 */
    @Excel(name = "当前表中的父分类id ,取值当前表主键")
    private String parentid;

    /** 图片人存储路径 */
    @Excel(name = "图片人存储路径")
    private String iconurl;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creater;

    /** 修改人 */
    @Excel(name = "修改人")
    private String updater;

    /** 0启用1停用 */
    @Excel(name = "0启用1停用")
    private Integer status;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setCategoryid(String categoryid)
    {
        this.categoryid = categoryid;
    }

    public String getCategoryid() 
    {
        return categoryid;
    }

    public void setCategory1code(String category1code) 
    {
        this.category1code = category1code;
    }

    public String getCategory1code() 
    {
        return category1code;
    }

    public void setCategory1name(String category1name) 
    {
        this.category1name = category1name;
    }

    public String getCategory1name() 
    {
        return category1name;
    }

    public void setCategory2code(String category2code) 
    {
        this.category2code = category2code;
    }

    public String getCategory2code() 
    {
        return category2code;
    }

    public void setCategory2name(String category2name) 
    {
        this.category2name = category2name;
    }

    public String getCategory2name() 
    {
        return category2name;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCategoryname(String categoryname) 
    {
        this.categoryname = categoryname;
    }

    public String getCategoryname() 
    {
        return categoryname;
    }

    public void setParentid(String parentid) 
    {
        this.parentid = parentid;
    }

    public String getParentid() 
    {
        return parentid;
    }

    public void setIconurl(String iconurl) 
    {
        this.iconurl = iconurl;
    }

    public String getIconurl() 
    {
        return iconurl;
    }

    public void setCreater(String creater) 
    {
        this.creater = creater;
    }

    public String getCreater() 
    {
        return creater;
    }

    public void setUpdater(String updater) 
    {
        this.updater = updater;
    }

    public String getUpdater() 
    {
        return updater;
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
            .append("categoryid", getCategoryid())
            .append("category1code", getCategory1code())
            .append("category1name", getCategory1name())
            .append("category2code", getCategory2code())
            .append("category2name", getCategory2name())
            .append("code", getCode())
            .append("categoryname", getCategoryname())
            .append("parentid", getParentid())
            .append("iconurl", getIconurl())
            .append("creater", getCreater())
            .append("createtime", getCreatetime())
            .append("updater", getUpdater())
            .append("updatetime", getUpdatetime())
            .append("status", getStatus())
            .append("remark", getRemark())
            .toString();
    }
}
