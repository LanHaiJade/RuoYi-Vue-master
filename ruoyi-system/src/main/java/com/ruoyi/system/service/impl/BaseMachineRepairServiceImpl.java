package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineRepairMapper;
import com.ruoyi.common.domain.BaseMachineRepair;
import com.ruoyi.system.service.IBaseMachineRepairService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineRepairServiceImpl implements IBaseMachineRepairService 
{
    @Autowired
    private BaseMachineRepairMapper baseMachineRepairMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineRepair selectBaseMachineRepairByUserId(Long userId)
    {
        return baseMachineRepairMapper.selectBaseMachineRepairByUserId(userId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineRepair> selectBaseMachineRepairList(BaseMachineRepair baseMachineRepair)
    {
        return baseMachineRepairMapper.selectBaseMachineRepairList(baseMachineRepair);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineRepair(BaseMachineRepair baseMachineRepair)
    {
        return baseMachineRepairMapper.insertBaseMachineRepair(baseMachineRepair);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineRepair 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineRepair(BaseMachineRepair baseMachineRepair)
    {
        return baseMachineRepairMapper.updateBaseMachineRepair(baseMachineRepair);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineRepairByUserIds(Long[] userIds)
    {
        return baseMachineRepairMapper.deleteBaseMachineRepairByUserIds(userIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineRepairByUserId(Long userId)
    {
        return baseMachineRepairMapper.deleteBaseMachineRepairByUserId(userId);
    }
}
