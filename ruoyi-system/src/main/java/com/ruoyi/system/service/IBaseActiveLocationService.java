package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseActiveLocation;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseActiveLocationService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseActiveLocation selectBaseActiveLocationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseActiveLocation> selectBaseActiveLocationList(BaseActiveLocation baseActiveLocation);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseActiveLocation(BaseActiveLocation baseActiveLocation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseActiveLocation 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseActiveLocation(BaseActiveLocation baseActiveLocation);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseActiveLocationByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseActiveLocationById(Long id);
}
