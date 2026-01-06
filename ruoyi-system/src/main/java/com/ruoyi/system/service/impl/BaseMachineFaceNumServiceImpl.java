package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineFaceNumMapper;
import com.ruoyi.common.domain.BaseMachineFaceNum;
import com.ruoyi.system.service.IBaseMachineFaceNumService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineFaceNumServiceImpl implements IBaseMachineFaceNumService 
{
    @Autowired
    private BaseMachineFaceNumMapper baseMachineFaceNumMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachineFaceNum selectBaseMachineFaceNumById(Integer id)
    {
        return baseMachineFaceNumMapper.selectBaseMachineFaceNumById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachineFaceNum> selectBaseMachineFaceNumList(BaseMachineFaceNum baseMachineFaceNum)
    {
        return baseMachineFaceNumMapper.selectBaseMachineFaceNumList(baseMachineFaceNum);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachineFaceNum(BaseMachineFaceNum baseMachineFaceNum)
    {
        baseMachineFaceNum.setCreateTime(DateUtils.getNowDate());
        return baseMachineFaceNumMapper.insertBaseMachineFaceNum(baseMachineFaceNum);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachineFaceNum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachineFaceNum(BaseMachineFaceNum baseMachineFaceNum)
    {
        baseMachineFaceNum.setUpdateTime(DateUtils.getNowDate());
        return baseMachineFaceNumMapper.updateBaseMachineFaceNum(baseMachineFaceNum);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFaceNumByIds(Integer[] ids)
    {
        return baseMachineFaceNumMapper.deleteBaseMachineFaceNumByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineFaceNumById(Integer id)
    {
        return baseMachineFaceNumMapper.deleteBaseMachineFaceNumById(id);
    }
}
