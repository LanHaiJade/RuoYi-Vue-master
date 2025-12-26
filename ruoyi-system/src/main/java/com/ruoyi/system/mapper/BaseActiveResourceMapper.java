package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseActiveResource;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseActiveResourceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveResource selectBaseActiveResourceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveResource> selectBaseActiveResourceList(BaseActiveResource baseActiveResource);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveResource(BaseActiveResource baseActiveResource);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveResource 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveResource(BaseActiveResource baseActiveResource);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveResourceById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseActiveResourceByIds(Long[] ids);
}
