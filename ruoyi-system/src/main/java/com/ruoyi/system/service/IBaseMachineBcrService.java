package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineBcr;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineBcrService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineBcr selectBaseMachineBcrById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineBcr> selectBaseMachineBcrList(BaseMachineBcr baseMachineBcr);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineBcr(BaseMachineBcr baseMachineBcr);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineBcr(BaseMachineBcr baseMachineBcr);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineBcrByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineBcrById(Integer id);
}
