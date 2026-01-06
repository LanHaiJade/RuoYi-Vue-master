package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineShelfInfoMapper;
import com.ruoyi.common.domain.BaseMachineShelfInfo;
import com.ruoyi.system.service.IBaseMachineShelfInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineShelfInfoServiceImpl implements IBaseMachineShelfInfoService 
{
    @Autowired
    private BaseMachineShelfInfoMapper baseMachineShelfInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineShelfInfo selectBaseMachineShelfInfoById(Integer id)
    {
        return baseMachineShelfInfoMapper.selectBaseMachineShelfInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineShelfInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineShelfInfo> selectBaseMachineShelfInfoList(BaseMachineShelfInfo baseMachineShelfInfo)
    {
        return baseMachineShelfInfoMapper.selectBaseMachineShelfInfoList(baseMachineShelfInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineShelfInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineShelfInfo(BaseMachineShelfInfo baseMachineShelfInfo)
    {
        baseMachineShelfInfo.setCreateTime(DateUtils.getNowDate());
        return baseMachineShelfInfoMapper.insertBaseMachineShelfInfo(baseMachineShelfInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineShelfInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineShelfInfo(BaseMachineShelfInfo baseMachineShelfInfo)
    {
        baseMachineShelfInfo.setUpdateTime(DateUtils.getNowDate());
        return baseMachineShelfInfoMapper.updateBaseMachineShelfInfo(baseMachineShelfInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineShelfInfoByIds(Integer[] ids)
    {
        return baseMachineShelfInfoMapper.deleteBaseMachineShelfInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineShelfInfoById(Integer id)
    {
        return baseMachineShelfInfoMapper.deleteBaseMachineShelfInfoById(id);
    }
}
