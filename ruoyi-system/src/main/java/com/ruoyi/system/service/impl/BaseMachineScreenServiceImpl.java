package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineScreenMapper;
import com.ruoyi.system.domain.BaseMachineScreen;
import com.ruoyi.system.service.IBaseMachineScreenService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineScreenServiceImpl implements IBaseMachineScreenService 
{
    @Autowired
    private BaseMachineScreenMapper baseMachineScreenMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineScreen selectBaseMachineScreenById(Long id)
    {
        return baseMachineScreenMapper.selectBaseMachineScreenById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineScreen> selectBaseMachineScreenList(BaseMachineScreen baseMachineScreen)
    {
        return baseMachineScreenMapper.selectBaseMachineScreenList(baseMachineScreen);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineScreen(BaseMachineScreen baseMachineScreen)
    {
        return baseMachineScreenMapper.insertBaseMachineScreen(baseMachineScreen);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineScreen 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineScreen(BaseMachineScreen baseMachineScreen)
    {
        return baseMachineScreenMapper.updateBaseMachineScreen(baseMachineScreen);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineScreenByIds(Long[] ids)
    {
        return baseMachineScreenMapper.deleteBaseMachineScreenByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineScreenById(Long id)
    {
        return baseMachineScreenMapper.deleteBaseMachineScreenById(id);
    }
}
