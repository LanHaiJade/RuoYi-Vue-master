package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseMachinePartner;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachinePartnerMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachinePartner selectBaseMachinePartnerByUserId(Long userId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachinePartner> selectBaseMachinePartnerList(BaseMachinePartner baseMachinePartner);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachinePartner(BaseMachinePartner baseMachinePartner);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachinePartner 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachinePartner(BaseMachinePartner baseMachinePartner);

    /**
     * 删除【请填写功能名称】
     * 
     * @param userId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachinePartnerByUserId(Long userId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachinePartnerByUserIds(Long[] userIds);
}
