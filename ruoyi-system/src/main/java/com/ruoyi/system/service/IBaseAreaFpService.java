package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.domain.BaseAreaFp;

/**
 * 省市县Service接口
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
public interface IBaseAreaFpService 
{
    /**
     * 查询省市县
     * 
     * @param regionid 省市县主键
     * @return 省市县
     */
    public BaseAreaFp selectBaseAreaFpByRegionid(String regionid);

    /**
     * 查询省市县列表
     * 
     * @param baseAreaFp 省市县
     * @return 省市县集合
     */
    public List<BaseAreaFp> selectBaseAreaFpList(BaseAreaFp baseAreaFp);

    /**
     * 新增省市县
     * 
     * @param baseAreaFp 省市县
     * @return 结果
     */
    public int insertBaseAreaFp(BaseAreaFp baseAreaFp);

    /**
     * 修改省市县
     * 
     * @param baseAreaFp 省市县
     * @return 结果
     */
    public int updateBaseAreaFp(BaseAreaFp baseAreaFp);

    /**
     * 批量删除省市县
     * 
     * @param regionids 需要删除的省市县主键集合
     * @return 结果
     */
    public int deleteBaseAreaFpByRegionids(String[] regionids);

    /**
     * 删除省市县信息
     * 
     * @param regionid 省市县主键
     * @return 结果
     */
    public int deleteBaseAreaFpByRegionid(String regionid);
}
