package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineDealerMapper;
import com.ruoyi.common.domain.BaseMachineDealer;
import com.ruoyi.system.service.IBaseMachineDealerService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineDealerServiceImpl implements IBaseMachineDealerService 
{
    @Autowired
    private BaseMachineDealerMapper baseMachineDealerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineDealer selectBaseMachineDealerById(Long id)
    {
        return baseMachineDealerMapper.selectBaseMachineDealerById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineDealer> selectBaseMachineDealerList(BaseMachineDealer baseMachineDealer)
    {
        return baseMachineDealerMapper.selectBaseMachineDealerList(baseMachineDealer);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineDealer(BaseMachineDealer baseMachineDealer)
    {
        baseMachineDealer.setCreateTime(DateUtils.getNowDate());
        return baseMachineDealerMapper.insertBaseMachineDealer(baseMachineDealer);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineDealer 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineDealer(BaseMachineDealer baseMachineDealer)
    {
        baseMachineDealer.setUpdateTime(DateUtils.getNowDate());
        return baseMachineDealerMapper.updateBaseMachineDealer(baseMachineDealer);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineDealerByIds(Long[] ids)
    {
        return baseMachineDealerMapper.deleteBaseMachineDealerByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineDealerById(Long id)
    {
        return baseMachineDealerMapper.deleteBaseMachineDealerById(id);
    }
}
