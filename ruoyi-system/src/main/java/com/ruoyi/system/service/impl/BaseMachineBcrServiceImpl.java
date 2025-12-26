package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineBcrMapper;
import com.ruoyi.system.domain.BaseMachineBcr;
import com.ruoyi.system.service.IBaseMachineBcrService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineBcrServiceImpl implements IBaseMachineBcrService 
{
    @Autowired
    private BaseMachineBcrMapper baseMachineBcrMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineBcr selectBaseMachineBcrById(Integer id)
    {
        return baseMachineBcrMapper.selectBaseMachineBcrById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineBcr> selectBaseMachineBcrList(BaseMachineBcr baseMachineBcr)
    {
        return baseMachineBcrMapper.selectBaseMachineBcrList(baseMachineBcr);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineBcr(BaseMachineBcr baseMachineBcr)
    {
        baseMachineBcr.setCreateTime(DateUtils.getNowDate());
        return baseMachineBcrMapper.insertBaseMachineBcr(baseMachineBcr);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineBcr 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineBcr(BaseMachineBcr baseMachineBcr)
    {
        baseMachineBcr.setUpdateTime(DateUtils.getNowDate());
        return baseMachineBcrMapper.updateBaseMachineBcr(baseMachineBcr);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineBcrByIds(Integer[] ids)
    {
        return baseMachineBcrMapper.deleteBaseMachineBcrByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineBcrById(Integer id)
    {
        return baseMachineBcrMapper.deleteBaseMachineBcrById(id);
    }
}
