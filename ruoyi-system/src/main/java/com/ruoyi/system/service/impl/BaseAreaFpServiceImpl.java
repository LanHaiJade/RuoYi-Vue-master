package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseAreaFpMapper;
import com.ruoyi.common.domain.BaseAreaFp;
import com.ruoyi.system.service.IBaseAreaFpService;

/**
 * 省市县Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseAreaFpServiceImpl implements IBaseAreaFpService 
{
    @Autowired
    private BaseAreaFpMapper baseAreaFpMapper;

    /**
     * 查询省市县
     * 
     * @param regionid 省市县主键
     * @return 省市县
     */
    @Override
    public BaseAreaFp selectBaseAreaFpByRegionid(String regionid)
    {
        return baseAreaFpMapper.selectBaseAreaFpByRegionid(regionid);
    }

    /**
     * 查询省市县列表
     * 
     * @param baseAreaFp 省市县
     * @return 省市县
     */
    @Override
    public List<BaseAreaFp> selectBaseAreaFpList(BaseAreaFp baseAreaFp)
    {
        return baseAreaFpMapper.selectBaseAreaFpList(baseAreaFp);
    }

    /**
     * 新增省市县
     * 
     * @param baseAreaFp 省市县
     * @return 结果
     */
    @Override
    public int insertBaseAreaFp(BaseAreaFp baseAreaFp)
    {
        return baseAreaFpMapper.insertBaseAreaFp(baseAreaFp);
    }

    /**
     * 修改省市县
     * 
     * @param baseAreaFp 省市县
     * @return 结果
     */
    @Override
    public int updateBaseAreaFp(BaseAreaFp baseAreaFp)
    {
        return baseAreaFpMapper.updateBaseAreaFp(baseAreaFp);
    }

    /**
     * 批量删除省市县
     * 
     * @param regionids 需要删除的省市县主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaFpByRegionids(String[] regionids)
    {
        return baseAreaFpMapper.deleteBaseAreaFpByRegionids(regionids);
    }

    /**
     * 删除省市县信息
     * 
     * @param regionid 省市县主键
     * @return 结果
     */
    @Override
    public int deleteBaseAreaFpByRegionid(String regionid)
    {
        return baseAreaFpMapper.deleteBaseAreaFpByRegionid(regionid);
    }
}
