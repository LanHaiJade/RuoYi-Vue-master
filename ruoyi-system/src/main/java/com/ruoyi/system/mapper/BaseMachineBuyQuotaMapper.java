package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BaseMachineBuyQuota;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseMachineBuyQuotaMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseMachineBuyQuota selectBaseMachineBuyQuotaById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseMachineBuyQuota> selectBaseMachineBuyQuotaList(BaseMachineBuyQuota baseMachineBuyQuota);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseMachineBuyQuota(BaseMachineBuyQuota baseMachineBuyQuota);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineBuyQuota 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseMachineBuyQuota(BaseMachineBuyQuota baseMachineBuyQuota);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseMachineBuyQuotaById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMachineBuyQuotaByIds(Integer[] ids);
}
