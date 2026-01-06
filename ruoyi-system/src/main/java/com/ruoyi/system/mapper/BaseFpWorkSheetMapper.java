package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseFpWorkSheet;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseFpWorkSheetMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseFpWorkSheet selectBaseFpWorkSheetById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseFpWorkSheet> selectBaseFpWorkSheetList(BaseFpWorkSheet baseFpWorkSheet);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseFpWorkSheet(BaseFpWorkSheet baseFpWorkSheet);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseFpWorkSheet(BaseFpWorkSheet baseFpWorkSheet);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseFpWorkSheetById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseFpWorkSheetByIds(Integer[] ids);
}
