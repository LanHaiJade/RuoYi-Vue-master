package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 base_sys_menu
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public class BaseSysMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long menuId;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String menuName;

    /** 层级 */
    @Excel(name = "层级")
    private String level;

    /** 父菜单ID */
    @Excel(name = "父菜单ID")
    private Long parentId;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer orderNum;

    /** 路径 */
    @Excel(name = "路径")
    private String path;

    /** 菜单图标 */
    @Excel(name = "菜单图标")
    private String icon;

    /** 标记 */
    @Excel(name = "标记")
    private String tag;

    public void setMenuId(Long menuId) 
    {
        this.menuId = menuId;
    }

    public Long getMenuId() 
    {
        return menuId;
    }

    public void setMenuName(String menuName) 
    {
        this.menuName = menuName;
    }

    public String getMenuName() 
    {
        return menuName;
    }

    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }

    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }

    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }

    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }

    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }

    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("menuId", getMenuId())
            .append("menuName", getMenuName())
            .append("level", getLevel())
            .append("parentId", getParentId())
            .append("orderNum", getOrderNum())
            .append("path", getPath())
            .append("icon", getIcon())
            .append("tag", getTag())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
