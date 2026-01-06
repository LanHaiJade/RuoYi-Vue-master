package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineFpMapper;
import com.ruoyi.common.domain.BaseMachineFp;
import com.ruoyi.system.service.IBaseMachineFpService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineFpServiceImpl implements IBaseMachineFpService 
{
    @Autowired
    private BaseMachineFpMapper baseMachineFpMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineFp selectBaseMachineFpById(Long id)
    {
        return baseMachineFpMapper.selectBaseMachineFpById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineFp> selectBaseMachineFpList(BaseMachineFp baseMachineFp)
    {
        return baseMachineFpMapper.selectBaseMachineFpList(baseMachineFp);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineFp(BaseMachineFp baseMachineFp)
    {
        return baseMachineFpMapper.insertBaseMachineFp(baseMachineFp);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFp 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineFp(BaseMachineFp baseMachineFp)
    {
        return baseMachineFpMapper.updateBaseMachineFp(baseMachineFp);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFpByIds(Long[] ids)
    {
        return baseMachineFpMapper.deleteBaseMachineFpByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFpById(Long id)
    {
        return baseMachineFpMapper.deleteBaseMachineFpById(id);
    }
}
