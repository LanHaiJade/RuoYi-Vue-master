package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseTransferSb;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseTransferSbMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseTransferSb selectBaseTransferSbById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseTransferSb> selectBaseTransferSbList(BaseTransferSb baseTransferSb);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseTransferSb(BaseTransferSb baseTransferSb);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseTransferSb 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseTransferSb(BaseTransferSb baseTransferSb);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseTransferSbById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseTransferSbByIds(Integer[] ids);
}
