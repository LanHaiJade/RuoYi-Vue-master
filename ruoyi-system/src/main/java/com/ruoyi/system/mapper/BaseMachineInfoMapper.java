package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseMachineInfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineInfo selectBaseMachineInfoById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineInfo> selectBaseMachineInfoList(BaseMachineInfo baseMachineInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineInfo(BaseMachineInfo baseMachineInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineInfo(BaseMachineInfo baseMachineInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineInfoById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineInfoByIds(Integer[] ids);
}
