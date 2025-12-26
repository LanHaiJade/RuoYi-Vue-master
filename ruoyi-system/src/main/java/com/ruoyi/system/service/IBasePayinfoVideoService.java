package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BasePayinfoVideo;

/**
 * 销售订单监控视频Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBasePayinfoVideoService 
{
    /**
     * 查询销售订单监控视频
     * 
     * @param id 销售订单监控视频主键
     * @return 销售订单监控视频
     */
    public BasePayinfoVideo selectBasePayinfoVideoById(Long id);

    /**
     * 查询销售订单监控视频列表
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 销售订单监控视频集合
     */
    public List<BasePayinfoVideo> selectBasePayinfoVideoList(BasePayinfoVideo basePayinfoVideo);

    /**
     * 新增销售订单监控视频
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 结果
     */
    public int insertBasePayinfoVideo(BasePayinfoVideo basePayinfoVideo);

    /**
     * 修改销售订单监控视频
     * 
     * @param basePayinfoVideo 销售订单监控视频
     * @return 结果
     */
    public int updateBasePayinfoVideo(BasePayinfoVideo basePayinfoVideo);

    /**
     * 批量删除销售订单监控视频
     * 
     * @param ids 需要删除的销售订单监控视频主键集合
     * @return 结果
     */
    public int deleteBasePayinfoVideoByIds(Long[] ids);

    /**
     * 删除销售订单监控视频信息
     * 
     * @param id 销售订单监控视频主键
     * @return 结果
     */
    public int deleteBasePayinfoVideoById(Long id);
}
