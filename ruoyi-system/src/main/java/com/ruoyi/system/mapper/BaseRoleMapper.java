package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseRole;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseRoleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseRole selectBaseRoleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseRole> selectBaseRoleList(BaseRole baseRole);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRole 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseRole(BaseRole baseRole);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRole 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseRole(BaseRole baseRole);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseRoleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseRoleByIds(Long[] ids);
}
