package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserRechargeMapper;
import com.ruoyi.system.domain.BaseUserRecharge;
import com.ruoyi.system.service.IBaseUserRechargeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserRechargeServiceImpl implements IBaseUserRechargeService 
{
    @Autowired
    private BaseUserRechargeMapper baseUserRechargeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserRecharge selectBaseUserRechargeById(Long id)
    {
        return baseUserRechargeMapper.selectBaseUserRechargeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserRecharge> selectBaseUserRechargeList(BaseUserRecharge baseUserRecharge)
    {
        return baseUserRechargeMapper.selectBaseUserRechargeList(baseUserRecharge);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserRecharge(BaseUserRecharge baseUserRecharge)
    {
        baseUserRecharge.setCreateTime(DateUtils.getNowDate());
        return baseUserRechargeMapper.insertBaseUserRecharge(baseUserRecharge);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserRecharge(BaseUserRecharge baseUserRecharge)
    {
        return baseUserRechargeMapper.updateBaseUserRecharge(baseUserRecharge);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserRechargeByIds(Long[] ids)
    {
        return baseUserRechargeMapper.deleteBaseUserRechargeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserRechargeById(Long id)
    {
        return baseUserRechargeMapper.deleteBaseUserRechargeById(id);
    }
}
