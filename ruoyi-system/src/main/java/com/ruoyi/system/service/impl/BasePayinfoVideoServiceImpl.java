package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasePayinfoVideoMapper;
import com.ruoyi.common.domain.BasePayinfoVideo;
import com.ruoyi.system.service.IBasePayinfoVideoService;

/**
 * 销售订单监控视频Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BasePayinfoVideoServiceImpl implements IBasePayinfoVideoService 
{
    @Autowired
    private BasePayinfoVideoMapper basePayinfoVideoMapper;

    /**
     * 查询销售订单监控视频
     * 
     * @param id 销售订单监控视频主键
     * @return 销售订单监控视频
     */
    @Override
    public BasePayinfoVideo selectBasePayinfoVideoById(Long id)
    {
        return basePayinfoVideoMapper.selectBasePayinfoVideoById(id);
    }

    /**
     * 查询销售订单监控视频列表
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 销售订单监控视频
     */
    @Override
    public List<BasePayinfoVideo> selectBasePayinfoVideoList(BasePayinfoVideo basePayinfoVideo)
    {
        return basePayinfoVideoMapper.selectBasePayinfoVideoList(basePayinfoVideo);
    }

    /**
     * 新增销售订单监控视频
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 结果
     */
    @Override
    public int insertBasePayinfoVideo(BasePayinfoVideo basePayinfoVideo)
    {
        basePayinfoVideo.setCreateTime(DateUtils.getNowDate());
        return basePayinfoVideoMapper.insertBasePayinfoVideo(basePayinfoVideo);
    }

    /**
     * 修改销售订单监控视频
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 结果
     */
    @Override
    public int updateBasePayinfoVideo(BasePayinfoVideo basePayinfoVideo)
    {
        return basePayinfoVideoMapper.updateBasePayinfoVideo(basePayinfoVideo);
    }

    /**
     * 批量删除销售订单监控视频
     * 
     * @param ids 需要删除的销售订单监控视频主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoVideoByIds(Long[] ids)
    {
        return basePayinfoVideoMapper.deleteBasePayinfoVideoByIds(ids);
    }

    /**
     * 删除销售订单监控视频信息
     * 
     * @param id 销售订单监控视频主键
     * @return 结果
     */
    @Override
    public int deleteBasePayinfoVideoById(Long id)
    {
        return basePayinfoVideoMapper.deleteBasePayinfoVideoById(id);
    }
}
