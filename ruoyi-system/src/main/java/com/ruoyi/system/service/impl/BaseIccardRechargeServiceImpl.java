package com.ruoyi.system.service.impl;

import java.util.Collections;
import java.util.List;

import com.ruoyi.common.domain.vo.BaseIccardRechargeVo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardRechargeMapper;
import com.ruoyi.common.domain.BaseIccardRecharge;
import com.ruoyi.system.service.IBaseIccardRechargeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardRechargeServiceImpl implements IBaseIccardRechargeService 
{
    @Autowired
    private BaseIccardRechargeMapper baseIccardRechargeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccardRecharge selectBaseIccardRechargeById(Long id)
    {
        return baseIccardRechargeMapper.selectBaseIccardRechargeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccardRecharge 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIccardRecharge> selectBaseIccardRechargeList(BaseIccardRecharge baseIccardRecharge)
    {
        return baseIccardRechargeMapper.selectBaseIccardRechargeList(baseIccardRecharge);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccardRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIccardRecharge(BaseIccardRecharge baseIccardRecharge)
    {
        baseIccardRecharge.setCreateTime(DateUtils.getNowDate());
        return baseIccardRechargeMapper.insertBaseIccardRecharge(baseIccardRecharge);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccardRecharge 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIccardRecharge(BaseIccardRecharge baseIccardRecharge)
    {
        baseIccardRecharge.setUpdateTime(DateUtils.getNowDate());
        return baseIccardRechargeMapper.updateBaseIccardRecharge(baseIccardRecharge);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardRechargeByIds(Long[] ids)
    {
        return baseIccardRechargeMapper.deleteBaseIccardRechargeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardRechargeById(Long id)
    {
        return baseIccardRechargeMapper.deleteBaseIccardRechargeById(id);
    }

    /**
     * 分页查询
     *
     * @param baseIccardRecharge
     * @return
     */
    @Override
    public List<BaseIccardRechargeVo> selectBaseIccardRechargeVoList(BaseIccardRechargeVo baseIccardRecharge) {
        return baseIccardRechargeMapper.selectBaseIccardRechargeVoList(baseIccardRecharge);
    }
}
