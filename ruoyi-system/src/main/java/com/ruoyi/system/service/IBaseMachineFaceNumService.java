package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineFaceNum;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineFaceNumService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineFaceNum selectBaseMachineFaceNumById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineFaceNum> selectBaseMachineFaceNumList(BaseMachineFaceNum baseMachineFaceNum);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineFaceNum(BaseMachineFaceNum baseMachineFaceNum);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineFaceNum(BaseMachineFaceNum baseMachineFaceNum);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseMachineFaceNumByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineFaceNumById(Integer id);
}
