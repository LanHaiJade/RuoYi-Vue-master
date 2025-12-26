package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineMonitorRecharge;

/**
 * 监控续费充值记录Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineMonitorRechargeMapper 
{
    /**
     * 查询监控续费充值记录
     * 
     * @param id 监控续费充值记录主键
     * @return 监控续费充值记录
     */
    public BaseMachineMonitorRecharge selectBaseMachineMonitorRechargeById(Long id);

    /**
     * 查询监控续费充值记录列表
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 监控续费充值记录集合
     */
    public List<BaseMachineMonitorRecharge> selectBaseMachineMonitorRechargeList(BaseMachineMonitorRecharge baseMachineMonitorRecharge);

    /**
     * 新增监控续费充值记录
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 结果
     */
    public int insertBaseMachineMonitorRecharge(BaseMachineMonitorRecharge baseMachineMonitorRecharge);

    /**
     * 修改监控续费充值记录
     * 
     * @param baseMachineMonitorRecharge 监控续费充值记录
     * @return 结果
     */
    public int updateBaseMachineMonitorRecharge(BaseMachineMonitorRecharge baseMachineMonitorRecharge);

    /**
     * 删除监控续费充值记录
     * 
     * @param id 监控续费充值记录主键
     * @return 结果
     */
    public int deleteBaseMachineMonitorRechargeById(Long id);

    /**
     * 批量删除监控续费充值记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineMonitorRechargeByIds(Long[] ids);
}
