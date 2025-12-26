package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserNoticeMapper;
import com.ruoyi.system.domain.BaseUserNotice;
import com.ruoyi.system.service.IBaseUserNoticeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserNoticeServiceImpl implements IBaseUserNoticeService 
{
    @Autowired
    private BaseUserNoticeMapper baseUserNoticeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUserNotice selectBaseUserNoticeById(Long id)
    {
        return baseUserNoticeMapper.selectBaseUserNoticeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUserNotice> selectBaseUserNoticeList(BaseUserNotice baseUserNotice)
    {
        return baseUserNoticeMapper.selectBaseUserNoticeList(baseUserNotice);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseUserNotice(BaseUserNotice baseUserNotice)
    {
        return baseUserNoticeMapper.insertBaseUserNotice(baseUserNotice);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseUserNotice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseUserNotice(BaseUserNotice baseUserNotice)
    {
        return baseUserNoticeMapper.updateBaseUserNotice(baseUserNotice);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserNoticeByIds(Long[] ids)
    {
        return baseUserNoticeMapper.deleteBaseUserNoticeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserNoticeById(Long id)
    {
        return baseUserNoticeMapper.deleteBaseUserNoticeById(id);
    }
}
