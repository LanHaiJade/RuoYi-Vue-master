package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachinePartnerMapper;
import com.ruoyi.system.domain.BaseMachinePartner;
import com.ruoyi.system.service.IBaseMachinePartnerService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachinePartnerServiceImpl implements IBaseMachinePartnerService 
{
    @Autowired
    private BaseMachinePartnerMapper baseMachinePartnerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachinePartner selectBaseMachinePartnerByUserId(Long userId)
    {
        return baseMachinePartnerMapper.selectBaseMachinePartnerByUserId(userId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachinePartner> selectBaseMachinePartnerList(BaseMachinePartner baseMachinePartner)
    {
        return baseMachinePartnerMapper.selectBaseMachinePartnerList(baseMachinePartner);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachinePartner(BaseMachinePartner baseMachinePartner)
    {
        return baseMachinePartnerMapper.insertBaseMachinePartner(baseMachinePartner);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachinePartner(BaseMachinePartner baseMachinePartner)
    {
        return baseMachinePartnerMapper.updateBaseMachinePartner(baseMachinePartner);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachinePartnerByUserIds(Long[] userIds)
    {
        return baseMachinePartnerMapper.deleteBaseMachinePartnerByUserIds(userIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachinePartnerByUserId(Long userId)
    {
        return baseMachinePartnerMapper.deleteBaseMachinePartnerByUserId(userId);
    }
}
