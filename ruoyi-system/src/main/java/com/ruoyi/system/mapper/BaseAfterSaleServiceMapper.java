package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseAfterSaleService;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseAfterSaleServiceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseAfterSaleService selectBaseAfterSaleServiceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseAfterSaleService> selectBaseAfterSaleServiceList(BaseAfterSaleService baseAfterSaleService);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseAfterSaleService(BaseAfterSaleService baseAfterSaleService);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseAfterSaleService 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseAfterSaleService(BaseAfterSaleService baseAfterSaleService);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseAfterSaleServiceById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseAfterSaleServiceByIds(Long[] ids);
}
