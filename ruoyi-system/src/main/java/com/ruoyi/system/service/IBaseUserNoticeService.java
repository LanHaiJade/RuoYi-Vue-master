package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BaseUserNotice;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseUserNoticeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseUserNotice selectBaseUserNoticeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseUserNotice> selectBaseUserNoticeList(BaseUserNotice baseUserNotice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseUserNotice(BaseUserNotice baseUserNotice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseUserNotice(BaseUserNotice baseUserNotice);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseUserNoticeByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseUserNoticeById(Long id);
}
