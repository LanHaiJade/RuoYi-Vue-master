package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseYellowTicketMapper;
import com.ruoyi.common.domain.BaseYellowTicket;
import com.ruoyi.system.service.IBaseYellowTicketService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseYellowTicketServiceImpl implements IBaseYellowTicketService 
{
    @Autowired
    private BaseYellowTicketMapper baseYellowTicketMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseYellowTicket selectBaseYellowTicketById(Integer id)
    {
        return baseYellowTicketMapper.selectBaseYellowTicketById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseYellowTicket> selectBaseYellowTicketList(BaseYellowTicket baseYellowTicket)
    {
        return baseYellowTicketMapper.selectBaseYellowTicketList(baseYellowTicket);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseYellowTicket(BaseYellowTicket baseYellowTicket)
    {
        baseYellowTicket.setCreateTime(DateUtils.getNowDate());
        return baseYellowTicketMapper.insertBaseYellowTicket(baseYellowTicket);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseYellowTicket 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseYellowTicket(BaseYellowTicket baseYellowTicket)
    {
        baseYellowTicket.setUpdateTime(DateUtils.getNowDate());
        return baseYellowTicketMapper.updateBaseYellowTicket(baseYellowTicket);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseYellowTicketByIds(Integer[] ids)
    {
        return baseYellowTicketMapper.deleteBaseYellowTicketByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseYellowTicketById(Integer id)
    {
        return baseYellowTicketMapper.deleteBaseYellowTicketById(id);
    }
}
