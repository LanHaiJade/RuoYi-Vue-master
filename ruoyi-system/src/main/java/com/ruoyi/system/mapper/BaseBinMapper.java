package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseBin;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseBinMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseBin selectBaseBinById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseBin 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseBin> selectBaseBinList(BaseBin baseBin);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseBin 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseBin(BaseBin baseBin);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseBin 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseBin(BaseBin baseBin);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseBinById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseBinByIds(Integer[] ids);
}
