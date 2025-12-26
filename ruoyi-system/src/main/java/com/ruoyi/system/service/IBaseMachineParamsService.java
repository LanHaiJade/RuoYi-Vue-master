package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineParams;

/**
 * 设备参数Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseMachineParamsService 
{
    /**
     * 查询设备参数
     * 
     * @param id 设备参数主键
     * @return 设备参数
     */
    public BaseMachineParams selectBaseMachineParamsById(Long id);

    /**
     * 查询设备参数列表
     * 
     * @param baseMachineParams 设备参数
     * @return 设备参数集合
     */
    public List<BaseMachineParams> selectBaseMachineParamsList(BaseMachineParams baseMachineParams);

    /**
     * 新增设备参数
     * 
     * @param baseMachineParams 设备参数
     * @return 结果
     */
    public int insertBaseMachineParams(BaseMachineParams baseMachineParams);

    /**
     * 修改设备参数
     * 
     * @param baseMachineParams 设备参数
     * @return 结果
     */
    public int updateBaseMachineParams(BaseMachineParams baseMachineParams);

    /**
     * 批量删除设备参数
     * 
     * @param ids 需要删除的设备参数主键集合
     * @return 结果
     */
    public int deleteBaseMachineParamsByIds(Long[] ids);

    /**
     * 删除设备参数信息
     * 
     * @param id 设备参数主键
     * @return 结果
     */
    public int deleteBaseMachineParamsById(Long id);
}
