package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMemberWeixinRiskMapper;
import com.ruoyi.system.domain.BaseMemberWeixinRisk;
import com.ruoyi.system.service.IBaseMemberWeixinRiskService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMemberWeixinRiskServiceImpl implements IBaseMemberWeixinRiskService 
{
    @Autowired
    private BaseMemberWeixinRiskMapper baseMemberWeixinRiskMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMemberWeixinRisk selectBaseMemberWeixinRiskById(Integer id)
    {
        return baseMemberWeixinRiskMapper.selectBaseMemberWeixinRiskById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMemberWeixinRisk 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMemberWeixinRisk> selectBaseMemberWeixinRiskList(BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        return baseMemberWeixinRiskMapper.selectBaseMemberWeixinRiskList(baseMemberWeixinRisk);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMemberWeixinRisk 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMemberWeixinRisk(BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        baseMemberWeixinRisk.setCreateTime(DateUtils.getNowDate());
        return baseMemberWeixinRiskMapper.insertBaseMemberWeixinRisk(baseMemberWeixinRisk);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMemberWeixinRisk 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMemberWeixinRisk(BaseMemberWeixinRisk baseMemberWeixinRisk)
    {
        baseMemberWeixinRisk.setUpdateTime(DateUtils.getNowDate());
        return baseMemberWeixinRiskMapper.updateBaseMemberWeixinRisk(baseMemberWeixinRisk);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinRiskByIds(Integer[] ids)
    {
        return baseMemberWeixinRiskMapper.deleteBaseMemberWeixinRiskByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinRiskById(Integer id)
    {
        return baseMemberWeixinRiskMapper.deleteBaseMemberWeixinRiskById(id);
    }
}
