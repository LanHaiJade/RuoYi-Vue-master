package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseRepairRecord;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseRepairRecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseRepairRecord selectBaseRepairRecordById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseRepairRecord> selectBaseRepairRecordList(BaseRepairRecord baseRepairRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseRepairRecord(BaseRepairRecord baseRepairRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRepairRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseRepairRecord(BaseRepairRecord baseRepairRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseRepairRecordById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseRepairRecordByIds(Long[] ids);
}
