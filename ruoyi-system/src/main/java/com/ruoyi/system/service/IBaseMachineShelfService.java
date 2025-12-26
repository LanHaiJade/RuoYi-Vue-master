package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineShelf;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineShelfService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineShelf selectBaseMachineShelfById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineShelf> selectBaseMachineShelfList(BaseMachineShelf baseMachineShelf);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineShelf(BaseMachineShelf baseMachineShelf);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineShelf(BaseMachineShelf baseMachineShelf);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineShelfByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineShelfById(Long id);
}
