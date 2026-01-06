package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserMicroMapper;
import com.ruoyi.common.domain.BaseUserMicro;
import com.ruoyi.system.service.IBaseUserMicroService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserMicroServiceImpl implements IBaseUserMicroService 
{
    @Autowired
    private BaseUserMicroMapper baseUserMicroMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserMicro selectBaseUserMicroById(Long id)
    {
        return baseUserMicroMapper.selectBaseUserMicroById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserMicro> selectBaseUserMicroList(BaseUserMicro baseUserMicro)
    {
        return baseUserMicroMapper.selectBaseUserMicroList(baseUserMicro);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserMicro(BaseUserMicro baseUserMicro)
    {
        baseUserMicro.setCreateTime(DateUtils.getNowDate());
        return baseUserMicroMapper.insertBaseUserMicro(baseUserMicro);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserMicro 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserMicro(BaseUserMicro baseUserMicro)
    {
        baseUserMicro.setUpdateTime(DateUtils.getNowDate());
        return baseUserMicroMapper.updateBaseUserMicro(baseUserMicro);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserMicroByIds(Long[] ids)
    {
        return baseUserMicroMapper.deleteBaseUserMicroByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserMicroById(Long id)
    {
        return baseUserMicroMapper.deleteBaseUserMicroById(id);
    }
}
