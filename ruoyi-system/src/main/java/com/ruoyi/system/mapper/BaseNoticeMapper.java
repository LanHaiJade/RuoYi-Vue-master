package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BaseNotice;

/**
 * 公告Mapper接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface BaseNoticeMapper 
{
    /**
     * 查询公告
     * 
     * @param baseNoticeId 公告主键
     * @return 公告
     */
    public BaseNotice selectBaseNoticeByBaseNoticeId(String baseNoticeId);

    /**
     * 查询公告列表
     * 
     * @param baseNotice 公告
     * @return 公告集合
     */
    public List<BaseNotice> selectBaseNoticeList(BaseNotice baseNotice);

    /**
     * 新增公告
     * 
     * @param baseNotice 公告
     * @return 结果
     */
    public int insertBaseNotice(BaseNotice baseNotice);

    /**
     * 修改公告
     * 
     * @param baseNotice 公告
     * @return 结果
     */
    public int updateBaseNotice(BaseNotice baseNotice);

    /**
     * 删除公告
     * 
     * @param baseNoticeId 公告主键
     * @return 结果
     */
    public int deleteBaseNoticeByBaseNoticeId(String baseNoticeId);

    /**
     * 批量删除公告
     * 
     * @param baseNoticeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseNoticeByBaseNoticeIds(String[] baseNoticeIds);
}
