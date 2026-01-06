package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineInfoMapper;
import com.ruoyi.common.domain.BaseMachineInfo;
import com.ruoyi.system.service.IBaseMachineInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineInfoServiceImpl implements IBaseMachineInfoService 
{
    @Autowired
    private BaseMachineInfoMapper baseMachineInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineInfo selectBaseMachineInfoById(Integer id)
    {
        return baseMachineInfoMapper.selectBaseMachineInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineInfo> selectBaseMachineInfoList(BaseMachineInfo baseMachineInfo)
    {
        return baseMachineInfoMapper.selectBaseMachineInfoList(baseMachineInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineInfo(BaseMachineInfo baseMachineInfo)
    {
        baseMachineInfo.setCreateTime(DateUtils.getNowDate());
        return baseMachineInfoMapper.insertBaseMachineInfo(baseMachineInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineInfo(BaseMachineInfo baseMachineInfo)
    {
        baseMachineInfo.setUpdateTime(DateUtils.getNowDate());
        return baseMachineInfoMapper.updateBaseMachineInfo(baseMachineInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineInfoByIds(Integer[] ids)
    {
        return baseMachineInfoMapper.deleteBaseMachineInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineInfoById(Integer id)
    {
        return baseMachineInfoMapper.deleteBaseMachineInfoById(id);
    }
}
