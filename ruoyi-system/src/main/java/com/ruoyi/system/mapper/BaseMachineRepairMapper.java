package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineRepair;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineRepairMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineRepair selectBaseMachineRepairByUserId(Long userId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineRepair> selectBaseMachineRepairList(BaseMachineRepair baseMachineRepair);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineRepair(BaseMachineRepair baseMachineRepair);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineRepair(BaseMachineRepair baseMachineRepair);

    /**
     * 删除【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineRepairByUserId(Long userId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineRepairByUserIds(Long[] userIds);
}
