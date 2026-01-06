package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMemberWeixinMapper;
import com.ruoyi.common.domain.BaseMemberWeixin;
import com.ruoyi.system.service.IBaseMemberWeixinService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMemberWeixinServiceImpl implements IBaseMemberWeixinService 
{
    @Autowired
    private BaseMemberWeixinMapper baseMemberWeixinMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMemberWeixin selectBaseMemberWeixinById(Integer id)
    {
        return baseMemberWeixinMapper.selectBaseMemberWeixinById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMemberWeixin> selectBaseMemberWeixinList(BaseMemberWeixin baseMemberWeixin)
    {
        return baseMemberWeixinMapper.selectBaseMemberWeixinList(baseMemberWeixin);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMemberWeixin(BaseMemberWeixin baseMemberWeixin)
    {
        baseMemberWeixin.setCreateTime(DateUtils.getNowDate());
        return baseMemberWeixinMapper.insertBaseMemberWeixin(baseMemberWeixin);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMemberWeixin 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMemberWeixin(BaseMemberWeixin baseMemberWeixin)
    {
        baseMemberWeixin.setUpdateTime(DateUtils.getNowDate());
        return baseMemberWeixinMapper.updateBaseMemberWeixin(baseMemberWeixin);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinByIds(Integer[] ids)
    {
        return baseMemberWeixinMapper.deleteBaseMemberWeixinByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMemberWeixinById(Integer id)
    {
        return baseMemberWeixinMapper.deleteBaseMemberWeixinById(id);
    }
}
