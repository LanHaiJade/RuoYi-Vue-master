package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseReplenishRecord;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseReplenishRecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseReplenishRecord selectBaseReplenishRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseReplenishRecord> selectBaseReplenishRecordList(BaseReplenishRecord baseReplenishRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseReplenishRecord(BaseReplenishRecord baseReplenishRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseReplenishRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseReplenishRecord(BaseReplenishRecord baseReplenishRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseReplenishRecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseReplenishRecordByIds(Long[] ids);
}
