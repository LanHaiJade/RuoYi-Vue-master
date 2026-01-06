package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineShelfMapper;
import com.ruoyi.common.domain.BaseMachineShelf;
import com.ruoyi.system.service.IBaseMachineShelfService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineShelfServiceImpl implements IBaseMachineShelfService 
{
    @Autowired
    private BaseMachineShelfMapper baseMachineShelfMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineShelf selectBaseMachineShelfById(Long id)
    {
        return baseMachineShelfMapper.selectBaseMachineShelfById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineShelf> selectBaseMachineShelfList(BaseMachineShelf baseMachineShelf)
    {
        return baseMachineShelfMapper.selectBaseMachineShelfList(baseMachineShelf);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineShelf(BaseMachineShelf baseMachineShelf)
    {
        baseMachineShelf.setCreateTime(DateUtils.getNowDate());
        return baseMachineShelfMapper.insertBaseMachineShelf(baseMachineShelf);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineShelf 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineShelf(BaseMachineShelf baseMachineShelf)
    {
        baseMachineShelf.setUpdateTime(DateUtils.getNowDate());
        return baseMachineShelfMapper.updateBaseMachineShelf(baseMachineShelf);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineShelfByIds(Long[] ids)
    {
        return baseMachineShelfMapper.deleteBaseMachineShelfByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineShelfById(Long id)
    {
        return baseMachineShelfMapper.deleteBaseMachineShelfById(id);
    }
}
