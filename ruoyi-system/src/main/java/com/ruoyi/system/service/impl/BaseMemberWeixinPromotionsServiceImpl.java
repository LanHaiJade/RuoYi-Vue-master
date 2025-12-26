package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMemberWeixinPromotionsMapper;
import com.ruoyi.system.domain.BaseMemberWeixinPromotions;
import com.ruoyi.system.service.IBaseMemberWeixinPromotionsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMemberWeixinPromotionsServiceImpl implements IBaseMemberWeixinPromotionsService 
{
    @Autowired
    private BaseMemberWeixinPromotionsMapper baseMemberWeixinPromotionsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMemberWeixinPromotions selectBaseMemberWeixinPromotionsById(Integer id)
    {
        return baseMemberWeixinPromotionsMapper.selectBaseMemberWeixinPromotionsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMemberWeixinPromotions 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMemberWeixinPromotions> selectBaseMemberWeixinPromotionsList(BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        return baseMemberWeixinPromotionsMapper.selectBaseMemberWeixinPromotionsList(baseMemberWeixinPromotions);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMemberWeixinPromotions 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMemberWeixinPromotions(BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        baseMemberWeixinPromotions.setCreateTime(DateUtils.getNowDate());
        return baseMemberWeixinPromotionsMapper.insertBaseMemberWeixinPromotions(baseMemberWeixinPromotions);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMemberWeixinPromotions 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMemberWeixinPromotions(BaseMemberWeixinPromotions baseMemberWeixinPromotions)
    {
        baseMemberWeixinPromotions.setUpdateTime(DateUtils.getNowDate());
        return baseMemberWeixinPromotionsMapper.updateBaseMemberWeixinPromotions(baseMemberWeixinPromotions);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinPromotionsByIds(Integer[] ids)
    {
        return baseMemberWeixinPromotionsMapper.deleteBaseMemberWeixinPromotionsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinPromotionsById(Integer id)
    {
        return baseMemberWeixinPromotionsMapper.deleteBaseMemberWeixinPromotionsById(id);
    }
}
