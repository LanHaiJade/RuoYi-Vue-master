package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineParamsMapper;
import com.ruoyi.system.domain.BaseMachineParams;
import com.ruoyi.system.service.IBaseMachineParamsService;

/**
 * 设备参数Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineParamsServiceImpl implements IBaseMachineParamsService 
{
    @Autowired
    private BaseMachineParamsMapper baseMachineParamsMapper;

    /**
     * 查询设备参数
     * 
     * @param id 设备参数主键
     * @return 设备参数
     */
    @Override
    public BaseMachineParams selectBaseMachineParamsById(Long id)
    {
        return baseMachineParamsMapper.selectBaseMachineParamsById(id);
    }

    /**
     * 查询设备参数列表
     * 
     * @param baseMachineParams 设备参数
     * @return 设备参数
     */
    @Override
    public List<BaseMachineParams> selectBaseMachineParamsList(BaseMachineParams baseMachineParams)
    {
        return baseMachineParamsMapper.selectBaseMachineParamsList(baseMachineParams);
    }

    /**
     * 新增设备参数
     * 
     * @param baseMachineParams 设备参数
     * @return 结果
     */
    @Override
    public int insertBaseMachineParams(BaseMachineParams baseMachineParams)
    {
        return baseMachineParamsMapper.insertBaseMachineParams(baseMachineParams);
    }

    /**
     * 修改设备参数
     * 
     * @param baseMachineParams 设备参数
     * @return 结果
     */
    @Override
    public int updateBaseMachineParams(BaseMachineParams baseMachineParams)
    {
        return baseMachineParamsMapper.updateBaseMachineParams(baseMachineParams);
    }

    /**
     * 批量删除设备参数
     * 
     * @param ids 需要删除的设备参数主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineParamsByIds(Long[] ids)
    {
        return baseMachineParamsMapper.deleteBaseMachineParamsByIds(ids);
    }

    /**
     * 删除设备参数信息
     * 
     * @param id 设备参数主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineParamsById(Long id)
    {
        return baseMachineParamsMapper.deleteBaseMachineParamsById(id);
    }
}
