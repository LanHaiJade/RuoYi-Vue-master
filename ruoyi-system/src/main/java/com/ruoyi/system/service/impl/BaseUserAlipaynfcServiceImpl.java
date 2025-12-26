package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserAlipaynfcMapper;
import com.ruoyi.system.domain.BaseUserAlipaynfc;
import com.ruoyi.system.service.IBaseUserAlipaynfcService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserAlipaynfcServiceImpl implements IBaseUserAlipaynfcService 
{
    @Autowired
    private BaseUserAlipaynfcMapper baseUserAlipaynfcMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserAlipaynfc selectBaseUserAlipaynfcById(Integer id)
    {
        return baseUserAlipaynfcMapper.selectBaseUserAlipaynfcById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserAlipaynfc> selectBaseUserAlipaynfcList(BaseUserAlipaynfc baseUserAlipaynfc)
    {
        return baseUserAlipaynfcMapper.selectBaseUserAlipaynfcList(baseUserAlipaynfc);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserAlipaynfc(BaseUserAlipaynfc baseUserAlipaynfc)
    {
        baseUserAlipaynfc.setCreateTime(DateUtils.getNowDate());
        return baseUserAlipaynfcMapper.insertBaseUserAlipaynfc(baseUserAlipaynfc);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserAlipaynfc 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserAlipaynfc(BaseUserAlipaynfc baseUserAlipaynfc)
    {
        baseUserAlipaynfc.setUpdateTime(DateUtils.getNowDate());
        return baseUserAlipaynfcMapper.updateBaseUserAlipaynfc(baseUserAlipaynfc);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAlipaynfcByIds(Integer[] ids)
    {
        return baseUserAlipaynfcMapper.deleteBaseUserAlipaynfcByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserAlipaynfcById(Integer id)
    {
        return baseUserAlipaynfcMapper.deleteBaseUserAlipaynfcById(id);
    }
}
