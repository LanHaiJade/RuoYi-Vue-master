package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineContract;

/**
 * 合约机信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineContractMapper 
{
    /**
     * 查询合约机信息
     * 
     * @param id 合约机信息主键
     * @return 合约机信息
     */
    public BaseMachineContract selectBaseMachineContractById(Long id);

    /**
     * 查询合约机信息列表
     * 
     * @param baseMachineContract 合约机信息
     * @return 合约机信息集合
     */
    public List<BaseMachineContract> selectBaseMachineContractList(BaseMachineContract baseMachineContract);

    /**
     * 新增合约机信息
     * 
     * @param baseMachineContract 合约机信息
     * @return 结果
     */
    public int insertBaseMachineContract(BaseMachineContract baseMachineContract);

    /**
     * 修改合约机信息
     * 
     * @param baseMachineContract 合约机信息
     * @return 结果
     */
    public int updateBaseMachineContract(BaseMachineContract baseMachineContract);

    /**
     * 删除合约机信息
     * 
     * @param id 合约机信息主键
     * @return 结果
     */
    public int deleteBaseMachineContractById(Long id);

    /**
     * 批量删除合约机信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineContractByIds(Long[] ids);
}
