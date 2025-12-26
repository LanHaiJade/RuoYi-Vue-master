package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineParams;

/**
 * 设备参数Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineParamsMapper 
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
     * 删除设备参数
     * 
     * @param id 设备参数主键
     * @return 结果
     */
    public int deleteBaseMachineParamsById(Long id);

    /**
     * 批量删除设备参数
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineParamsByIds(Long[] ids);
}
