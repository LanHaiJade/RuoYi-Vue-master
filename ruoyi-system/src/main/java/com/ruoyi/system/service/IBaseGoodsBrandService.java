package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseGoodsBrand;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseGoodsBrandService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseGoodsBrand selectBaseGoodsBrandById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseGoodsBrand> selectBaseGoodsBrandList(BaseGoodsBrand baseGoodsBrand);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseGoodsBrand(BaseGoodsBrand baseGoodsBrand);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseGoodsBrand 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseGoodsBrand(BaseGoodsBrand baseGoodsBrand);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseGoodsBrandByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseGoodsBrandById(Long id);
}
