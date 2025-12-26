package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRechargeMapper;
import com.ruoyi.system.domain.BaseRecharge;
import com.ruoyi.system.service.IBaseRechargeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRechargeServiceImpl implements IBaseRechargeService 
{
    @Autowired
    private BaseRechargeMapper baseRechargeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRecharge selectBaseRechargeById(Long id)
    {
        return baseRechargeMapper.selectBaseRechargeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRecharge> selectBaseRechargeList(BaseRecharge baseRecharge)
    {
        return baseRechargeMapper.selectBaseRechargeList(baseRecharge);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRecharge(BaseRecharge baseRecharge)
    {
        baseRecharge.setCreateTime(DateUtils.getNowDate());
        return baseRechargeMapper.insertBaseRecharge(baseRecharge);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRecharge(BaseRecharge baseRecharge)
    {
        baseRecharge.setUpdateTime(DateUtils.getNowDate());
        return baseRechargeMapper.updateBaseRecharge(baseRecharge);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRechargeByIds(Long[] ids)
    {
        return baseRechargeMapper.deleteBaseRechargeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRechargeById(Long id)
    {
        return baseRechargeMapper.deleteBaseRechargeById(id);
    }
}
