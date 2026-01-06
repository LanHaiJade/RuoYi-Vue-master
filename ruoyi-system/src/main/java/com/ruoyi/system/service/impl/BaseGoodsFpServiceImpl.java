package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseGoodsFpMapper;
import com.ruoyi.common.domain.BaseGoodsFp;
import com.ruoyi.system.service.IBaseGoodsFpService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseGoodsFpServiceImpl implements IBaseGoodsFpService 
{
    @Autowired
    private BaseGoodsFpMapper baseGoodsFpMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseGoodsFp selectBaseGoodsFpById(Long id)
    {
        return baseGoodsFpMapper.selectBaseGoodsFpById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseGoodsFp> selectBaseGoodsFpList(BaseGoodsFp baseGoodsFp)
    {
        return baseGoodsFpMapper.selectBaseGoodsFpList(baseGoodsFp);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseGoodsFp(BaseGoodsFp baseGoodsFp)
    {
        return baseGoodsFpMapper.insertBaseGoodsFp(baseGoodsFp);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseGoodsFp(BaseGoodsFp baseGoodsFp)
    {
        return baseGoodsFpMapper.updateBaseGoodsFp(baseGoodsFp);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsFpByIds(Long[] ids)
    {
        return baseGoodsFpMapper.deleteBaseGoodsFpByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseGoodsFpById(Long id)
    {
        return baseGoodsFpMapper.deleteBaseGoodsFpById(id);
    }
}
