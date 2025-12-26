package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseArea;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseAreaMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseArea selectBaseAreaById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseArea 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseArea> selectBaseAreaList(BaseArea baseArea);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseArea 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseArea(BaseArea baseArea);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseArea 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseArea(BaseArea baseArea);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseAreaById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseAreaByIds(String[] ids);
}
