package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.common.domain.BasePayinfoDetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BasePayinfoDetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BasePayinfoDetail selectBasePayinfoDetailById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BasePayinfoDetail> selectBasePayinfoDetailList(BasePayinfoDetail basePayinfoDetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 结果
     */
    public int insertBasePayinfoDetail(BasePayinfoDetail basePayinfoDetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param basePayinfoDetail 【请填写功能名称】
     * @return 结果
     */
    public int updateBasePayinfoDetail(BasePayinfoDetail basePayinfoDetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBasePayinfoDetailById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasePayinfoDetailByIds(Long[] ids);
}
