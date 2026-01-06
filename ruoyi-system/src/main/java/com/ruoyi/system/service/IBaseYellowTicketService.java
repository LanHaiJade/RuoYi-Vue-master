package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseYellowTicket;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseYellowTicketService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BaseYellowTicket selectBaseYellowTicketById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BaseYellowTicket> selectBaseYellowTicketList(BaseYellowTicket baseYellowTicket);

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 结果
     */
    public int insertBaseYellowTicket(BaseYellowTicket baseYellowTicket);

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 结果
     */
    public int updateBaseYellowTicket(BaseYellowTicket baseYellowTicket);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteBaseYellowTicketByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBaseYellowTicketById(Integer id);
}
