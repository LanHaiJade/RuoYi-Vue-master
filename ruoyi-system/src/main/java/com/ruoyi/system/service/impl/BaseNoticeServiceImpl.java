package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseNoticeMapper;
import com.ruoyi.system.domain.BaseNotice;
import com.ruoyi.system.service.IBaseNoticeService;

/**
 * 公告Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseNoticeServiceImpl implements IBaseNoticeService 
{
    @Autowired
    private BaseNoticeMapper baseNoticeMapper;

    /**
     * 查询公告
     * 
     * @param baseNoticeId 公告主键
     * @return 公告
     */
    @Override
    public BaseNotice selectBaseNoticeByBaseNoticeId(String baseNoticeId)
    {
        return baseNoticeMapper.selectBaseNoticeByBaseNoticeId(baseNoticeId);
    }

    /**
     * 查询公告列表
     * 
     * @param baseNotice 公告
     * @return 公告
     */
    @Override
    public List<BaseNotice> selectBaseNoticeList(BaseNotice baseNotice)
    {
        return baseNoticeMapper.selectBaseNoticeList(baseNotice);
    }

    /**
     * 新增公告
     * 
     * @param baseNotice 公告
     * @return 结果
     */
    @Override
    public int insertBaseNotice(BaseNotice baseNotice)
    {
        return baseNoticeMapper.insertBaseNotice(baseNotice);
    }

    /**
     * 修改公告
     * 
     * @param baseNotice 公告
     * @return 结果
     */
    @Override
    public int updateBaseNotice(BaseNotice baseNotice)
    {
        return baseNoticeMapper.updateBaseNotice(baseNotice);
    }

    /**
     * 批量删除公告
     * 
     * @param baseNoticeIds 需要删除的公告主键
     * @return 结果
     */
    @Override
    public int deleteBaseNoticeByBaseNoticeIds(String[] baseNoticeIds)
    {
        return baseNoticeMapper.deleteBaseNoticeByBaseNoticeIds(baseNoticeIds);
    }

    /**
     * 删除公告信息
     * 
     * @param baseNoticeId 公告主键
     * @return 结果
     */
    @Override
    public int deleteBaseNoticeByBaseNoticeId(String baseNoticeId)
    {
        return baseNoticeMapper.deleteBaseNoticeByBaseNoticeId(baseNoticeId);
    }
}
