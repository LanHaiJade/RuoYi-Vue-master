package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineFaceCountMapper;
import com.ruoyi.system.domain.BaseMachineFaceCount;
import com.ruoyi.system.service.IBaseMachineFaceCountService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineFaceCountServiceImpl implements IBaseMachineFaceCountService 
{
    @Autowired
    private BaseMachineFaceCountMapper baseMachineFaceCountMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineFaceCount selectBaseMachineFaceCountById(Long id)
    {
        return baseMachineFaceCountMapper.selectBaseMachineFaceCountById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineFaceCount> selectBaseMachineFaceCountList(BaseMachineFaceCount baseMachineFaceCount)
    {
        return baseMachineFaceCountMapper.selectBaseMachineFaceCountList(baseMachineFaceCount);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineFaceCount(BaseMachineFaceCount baseMachineFaceCount)
    {
        baseMachineFaceCount.setCreateTime(DateUtils.getNowDate());
        return baseMachineFaceCountMapper.insertBaseMachineFaceCount(baseMachineFaceCount);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFaceCount 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineFaceCount(BaseMachineFaceCount baseMachineFaceCount)
    {
        baseMachineFaceCount.setUpdateTime(DateUtils.getNowDate());
        return baseMachineFaceCountMapper.updateBaseMachineFaceCount(baseMachineFaceCount);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFaceCountByIds(Long[] ids)
    {
        return baseMachineFaceCountMapper.deleteBaseMachineFaceCountByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFaceCountById(Long id)
    {
        return baseMachineFaceCountMapper.deleteBaseMachineFaceCountById(id);
    }
}
