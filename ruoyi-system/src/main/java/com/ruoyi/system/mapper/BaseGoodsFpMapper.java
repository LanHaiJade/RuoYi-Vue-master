package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseGoodsFp;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseGoodsFpMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseGoodsFp selectBaseGoodsFpById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseGoodsFp> selectBaseGoodsFpList(BaseGoodsFp baseGoodsFp);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseGoodsFp(BaseGoodsFp baseGoodsFp);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsFp 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseGoodsFp(BaseGoodsFp baseGoodsFp);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseGoodsFpById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseGoodsFpByIds(Long[] ids);
}
