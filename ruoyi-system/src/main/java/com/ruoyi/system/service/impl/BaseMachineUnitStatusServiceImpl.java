package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineUnitStatusMapper;
import com.ruoyi.system.domain.BaseMachineUnitStatus;
import com.ruoyi.system.service.IBaseMachineUnitStatusService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineUnitStatusServiceImpl implements IBaseMachineUnitStatusService 
{
    @Autowired
    private BaseMachineUnitStatusMapper baseMachineUnitStatusMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineUnitStatus selectBaseMachineUnitStatusById(Integer id)
    {
        return baseMachineUnitStatusMapper.selectBaseMachineUnitStatusById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineUnitStatus> selectBaseMachineUnitStatusList(BaseMachineUnitStatus baseMachineUnitStatus)
    {
        return baseMachineUnitStatusMapper.selectBaseMachineUnitStatusList(baseMachineUnitStatus);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineUnitStatus(BaseMachineUnitStatus baseMachineUnitStatus)
    {
        baseMachineUnitStatus.setCreateTime(DateUtils.getNowDate());
        return baseMachineUnitStatusMapper.insertBaseMachineUnitStatus(baseMachineUnitStatus);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineUnitStatus 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineUnitStatus(BaseMachineUnitStatus baseMachineUnitStatus)
    {
        baseMachineUnitStatus.setUpdateTime(DateUtils.getNowDate());
        return baseMachineUnitStatusMapper.updateBaseMachineUnitStatus(baseMachineUnitStatus);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineUnitStatusByIds(Integer[] ids)
    {
        return baseMachineUnitStatusMapper.deleteBaseMachineUnitStatusByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineUnitStatusById(Integer id)
    {
        return baseMachineUnitStatusMapper.deleteBaseMachineUnitStatusById(id);
    }
}
