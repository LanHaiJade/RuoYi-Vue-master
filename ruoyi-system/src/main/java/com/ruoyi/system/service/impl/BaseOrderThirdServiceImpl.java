package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseOrderThirdMapper;
import com.ruoyi.common.domain.BaseOrderThird;
import com.ruoyi.system.service.IBaseOrderThirdService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseOrderThirdServiceImpl implements IBaseOrderThirdService 
{
    @Autowired
    private BaseOrderThirdMapper baseOrderThirdMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseOrderThird selectBaseOrderThirdById(Long id)
    {
        return baseOrderThirdMapper.selectBaseOrderThirdById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseOrderThird> selectBaseOrderThirdList(BaseOrderThird baseOrderThird)
    {
        return baseOrderThirdMapper.selectBaseOrderThirdList(baseOrderThird);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseOrderThird(BaseOrderThird baseOrderThird)
    {
        baseOrderThird.setCreateTime(DateUtils.getNowDate());
        return baseOrderThirdMapper.insertBaseOrderThird(baseOrderThird);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseOrderThird 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseOrderThird(BaseOrderThird baseOrderThird)
    {
        baseOrderThird.setUpdateTime(DateUtils.getNowDate());
        return baseOrderThirdMapper.updateBaseOrderThird(baseOrderThird);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOrderThirdByIds(Long[] ids)
    {
        return baseOrderThirdMapper.deleteBaseOrderThirdByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseOrderThirdById(Long id)
    {
        return baseOrderThirdMapper.deleteBaseOrderThirdById(id);
    }
}
