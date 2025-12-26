package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineContractMapper;
import com.ruoyi.system.domain.BaseMachineContract;
import com.ruoyi.system.service.IBaseMachineContractService;

/**
 * 合约机信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineContractServiceImpl implements IBaseMachineContractService 
{
    @Autowired
    private BaseMachineContractMapper baseMachineContractMapper;

    /**
     * 查询合约机信息
     * 
     * @param id 合约机信息主键
     * @return 合约机信息
     */
    @Override
    public BaseMachineContract selectBaseMachineContractById(Long id)
    {
        return baseMachineContractMapper.selectBaseMachineContractById(id);
    }

    /**
     * 查询合约机信息列表
     * 
     * @param baseMachineContract 合约机信息
     * @return 合约机信息
     */
    @Override
    public List<BaseMachineContract> selectBaseMachineContractList(BaseMachineContract baseMachineContract)
    {
        return baseMachineContractMapper.selectBaseMachineContractList(baseMachineContract);
    }

    /**
     * 新增合约机信息
     * 
     * @param baseMachineContract 合约机信息
     * @return 结果
     */
    @Override
    public int insertBaseMachineContract(BaseMachineContract baseMachineContract)
    {
        baseMachineContract.setCreateTime(DateUtils.getNowDate());
        return baseMachineContractMapper.insertBaseMachineContract(baseMachineContract);
    }

    /**
     * 修改合约机信息
     * 
     * @param baseMachineContract 合约机信息
     * @return 结果
     */
    @Override
    public int updateBaseMachineContract(BaseMachineContract baseMachineContract)
    {
        baseMachineContract.setUpdateTime(DateUtils.getNowDate());
        return baseMachineContractMapper.updateBaseMachineContract(baseMachineContract);
    }

    /**
     * 批量删除合约机信息
     * 
     * @param ids 需要删除的合约机信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineContractByIds(Long[] ids)
    {
        return baseMachineContractMapper.deleteBaseMachineContractByIds(ids);
    }

    /**
     * 删除合约机信息信息
     * 
     * @param id 合约机信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineContractById(Long id)
    {
        return baseMachineContractMapper.deleteBaseMachineContractById(id);
    }
}
