package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIpMapper;
import com.ruoyi.common.domain.BaseIp;
import com.ruoyi.system.service.IBaseIpService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIpServiceImpl implements IBaseIpService 
{
    @Autowired
    private BaseIpMapper baseIpMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIp selectBaseIpById(Long id)
    {
        return baseIpMapper.selectBaseIpById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseIp 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseIp> selectBaseIpList(BaseIp baseIp)
    {
        return baseIpMapper.selectBaseIpList(baseIp);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseIp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseIp(BaseIp baseIp)
    {
        return baseIpMapper.insertBaseIp(baseIp);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseIp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseIp(BaseIp baseIp)
    {
        return baseIpMapper.updateBaseIp(baseIp);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIpByIds(Long[] ids)
    {
        return baseIpMapper.deleteBaseIpByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIpById(Long id)
    {
        return baseIpMapper.deleteBaseIpById(id);
    }
}
