package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMemberWeixinRechargeMapper;
import com.ruoyi.system.domain.BaseMemberWeixinRecharge;
import com.ruoyi.system.service.IBaseMemberWeixinRechargeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMemberWeixinRechargeServiceImpl implements IBaseMemberWeixinRechargeService 
{
    @Autowired
    private BaseMemberWeixinRechargeMapper baseMemberWeixinRechargeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMemberWeixinRecharge selectBaseMemberWeixinRechargeById(Integer id)
    {
        return baseMemberWeixinRechargeMapper.selectBaseMemberWeixinRechargeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMemberWeixinRecharge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMemberWeixinRecharge> selectBaseMemberWeixinRechargeList(BaseMemberWeixinRecharge baseMemberWeixinRecharge)
    {
        return baseMemberWeixinRechargeMapper.selectBaseMemberWeixinRechargeList(baseMemberWeixinRecharge);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMemberWeixinRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMemberWeixinRecharge(BaseMemberWeixinRecharge baseMemberWeixinRecharge)
    {
        baseMemberWeixinRecharge.setCreateTime(DateUtils.getNowDate());
        return baseMemberWeixinRechargeMapper.insertBaseMemberWeixinRecharge(baseMemberWeixinRecharge);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMemberWeixinRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMemberWeixinRecharge(BaseMemberWeixinRecharge baseMemberWeixinRecharge)
    {
        baseMemberWeixinRecharge.setUpdateTime(DateUtils.getNowDate());
        return baseMemberWeixinRechargeMapper.updateBaseMemberWeixinRecharge(baseMemberWeixinRecharge);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinRechargeByIds(Integer[] ids)
    {
        return baseMemberWeixinRechargeMapper.deleteBaseMemberWeixinRechargeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinRechargeById(Integer id)
    {
        return baseMemberWeixinRechargeMapper.deleteBaseMemberWeixinRechargeById(id);
    }
}
