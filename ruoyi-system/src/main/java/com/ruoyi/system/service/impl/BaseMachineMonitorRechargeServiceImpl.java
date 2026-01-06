package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineMonitorRechargeMapper;
import com.ruoyi.common.domain.BaseMachineMonitorRecharge;
import com.ruoyi.system.service.IBaseMachineMonitorRechargeService;

/**
 * 监控续费充值记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineMonitorRechargeServiceImpl implements IBaseMachineMonitorRechargeService 
{
    @Autowired
    private BaseMachineMonitorRechargeMapper baseMachineMonitorRechargeMapper;

    /**
     * 查询监控续费充值记录
     * 
     * @param id 监控续费充值记录主键
     * @return 监控续费充值记录
     */
    @Override
    public BaseMachineMonitorRecharge selectBaseMachineMonitorRechargeById(Long id)
    {
        return baseMachineMonitorRechargeMapper.selectBaseMachineMonitorRechargeById(id);
    }

    /**
     * 查询监控续费充值记录列表
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 监控续费充值记录
     */
    @Override
    public List<BaseMachineMonitorRecharge> selectBaseMachineMonitorRechargeList(BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        return baseMachineMonitorRechargeMapper.selectBaseMachineMonitorRechargeList(baseMachineMonitorRecharge);
    }

    /**
     * 新增监控续费充值记录
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 结果
     */
    @Override
    public int insertBaseMachineMonitorRecharge(BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        baseMachineMonitorRecharge.setCreateTime(DateUtils.getNowDate());
        return baseMachineMonitorRechargeMapper.insertBaseMachineMonitorRecharge(baseMachineMonitorRecharge);
    }

    /**
     * 修改监控续费充值记录
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 结果
     */
    @Override
    public int updateBaseMachineMonitorRecharge(BaseMachineMonitorRecharge baseMachineMonitorRecharge)
    {
        baseMachineMonitorRecharge.setUpdateTime(DateUtils.getNowDate());
        return baseMachineMonitorRechargeMapper.updateBaseMachineMonitorRecharge(baseMachineMonitorRecharge);
    }

    /**
     * 批量删除监控续费充值记录
     * 
     * @param ids 需要删除的监控续费充值记录主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineMonitorRechargeByIds(Long[] ids)
    {
        return baseMachineMonitorRechargeMapper.deleteBaseMachineMonitorRechargeByIds(ids);
    }

    /**
     * 删除监控续费充值记录信息
     * 
     * @param id 监控续费充值记录主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineMonitorRechargeById(Long id)
    {
        return baseMachineMonitorRechargeMapper.deleteBaseMachineMonitorRechargeById(id);
    }
}
