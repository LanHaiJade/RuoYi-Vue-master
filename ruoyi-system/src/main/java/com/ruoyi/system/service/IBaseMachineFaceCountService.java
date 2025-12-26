package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineFaceCount;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineFaceCountService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineFaceCount selectBaseMachineFaceCountById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineFaceCount> selectBaseMachineFaceCountList(BaseMachineFaceCount baseMachineFaceCount);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineFaceCount(BaseMachineFaceCount baseMachineFaceCount);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineFaceCount(BaseMachineFaceCount baseMachineFaceCount);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineFaceCountByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineFaceCountById(Long id);
}
