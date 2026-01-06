package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardMapper;
import com.ruoyi.common.domain.BaseIccard;
import com.ruoyi.system.service.IBaseIccardService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardServiceImpl implements IBaseIccardService 
{
    @Autowired
    private BaseIccardMapper baseIccardMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccard selectBaseIccardById(Long id)
    {
        return baseIccardMapper.selectBaseIccardById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIccard> selectBaseIccardList(BaseIccard baseIccard)
    {
        return baseIccardMapper.selectBaseIccardList(baseIccard);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIccard(BaseIccard baseIccard)
    {
        baseIccard.setCreateTime(DateUtils.getNowDate());
        return baseIccardMapper.insertBaseIccard(baseIccard);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIccard 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIccard(BaseIccard baseIccard)
    {
        baseIccard.setUpdateTime(DateUtils.getNowDate());
        return baseIccardMapper.updateBaseIccard(baseIccard);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardByIds(Long[] ids)
    {
        return baseIccardMapper.deleteBaseIccardByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardById(Long id)
    {
        return baseIccardMapper.deleteBaseIccardById(id);
    }
}
