package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIpCheckMapper;
import com.ruoyi.system.domain.BaseIpCheck;
import com.ruoyi.system.service.IBaseIpCheckService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIpCheckServiceImpl implements IBaseIpCheckService 
{
    @Autowired
    private BaseIpCheckMapper baseIpCheckMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIpCheck selectBaseIpCheckById(Integer id)
    {
        return baseIpCheckMapper.selectBaseIpCheckById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIpCheck> selectBaseIpCheckList(BaseIpCheck baseIpCheck)
    {
        return baseIpCheckMapper.selectBaseIpCheckList(baseIpCheck);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIpCheck(BaseIpCheck baseIpCheck)
    {
        return baseIpCheckMapper.insertBaseIpCheck(baseIpCheck);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIpCheck 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIpCheck(BaseIpCheck baseIpCheck)
    {
        return baseIpCheckMapper.updateBaseIpCheck(baseIpCheck);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIpCheckByIds(Integer[] ids)
    {
        return baseIpCheckMapper.deleteBaseIpCheckByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIpCheckById(Integer id)
    {
        return baseIpCheckMapper.deleteBaseIpCheckById(id);
    }
}
