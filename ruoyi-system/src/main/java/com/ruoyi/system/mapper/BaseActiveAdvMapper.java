package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseActiveAdv;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseActiveAdvMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveAdv selectBaseActiveAdvById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveAdv> selectBaseActiveAdvList(BaseActiveAdv baseActiveAdv);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveAdv(BaseActiveAdv baseActiveAdv);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveAdv 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveAdv(BaseActiveAdv baseActiveAdv);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveAdvById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseActiveAdvByIds(Long[] ids);
}
