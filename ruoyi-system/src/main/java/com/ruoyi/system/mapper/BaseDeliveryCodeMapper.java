package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseDeliveryCode;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseDeliveryCodeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseDeliveryCode selectBaseDeliveryCodeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseDeliveryCode> selectBaseDeliveryCodeList(BaseDeliveryCode baseDeliveryCode);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseDeliveryCode(BaseDeliveryCode baseDeliveryCode);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseDeliveryCode 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseDeliveryCode(BaseDeliveryCode baseDeliveryCode);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseDeliveryCodeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseDeliveryCodeByIds(Long[] ids);
}
