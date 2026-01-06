package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseRefundAlert;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseRefundAlertService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseRefundAlert selectBaseRefundAlertById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseRefundAlert> selectBaseRefundAlertList(BaseRefundAlert baseRefundAlert);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseRefundAlert(BaseRefundAlert baseRefundAlert);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseRefundAlert(BaseRefundAlert baseRefundAlert);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseRefundAlertByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseRefundAlertById(Integer id);
}
