package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseFpWorkSheetMapper;
import com.ruoyi.system.domain.BaseFpWorkSheet;
import com.ruoyi.system.service.IBaseFpWorkSheetService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseFpWorkSheetServiceImpl implements IBaseFpWorkSheetService 
{
    @Autowired
    private BaseFpWorkSheetMapper baseFpWorkSheetMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseFpWorkSheet selectBaseFpWorkSheetById(Integer id)
    {
        return baseFpWorkSheetMapper.selectBaseFpWorkSheetById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseFpWorkSheet> selectBaseFpWorkSheetList(BaseFpWorkSheet baseFpWorkSheet)
    {
        return baseFpWorkSheetMapper.selectBaseFpWorkSheetList(baseFpWorkSheet);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseFpWorkSheet(BaseFpWorkSheet baseFpWorkSheet)
    {
        return baseFpWorkSheetMapper.insertBaseFpWorkSheet(baseFpWorkSheet);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseFpWorkSheet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseFpWorkSheet(BaseFpWorkSheet baseFpWorkSheet)
    {
        return baseFpWorkSheetMapper.updateBaseFpWorkSheet(baseFpWorkSheet);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFpWorkSheetByIds(Integer[] ids)
    {
        return baseFpWorkSheetMapper.deleteBaseFpWorkSheetByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseFpWorkSheetById(Integer id)
    {
        return baseFpWorkSheetMapper.deleteBaseFpWorkSheetById(id);
    }
}
