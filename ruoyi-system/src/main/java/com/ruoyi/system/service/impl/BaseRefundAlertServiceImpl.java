package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseRefundAlertMapper;
import com.ruoyi.common.domain.BaseRefundAlert;
import com.ruoyi.system.service.IBaseRefundAlertService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseRefundAlertServiceImpl implements IBaseRefundAlertService 
{
    @Autowired
    private BaseRefundAlertMapper baseRefundAlertMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseRefundAlert selectBaseRefundAlertById(Integer id)
    {
        return baseRefundAlertMapper.selectBaseRefundAlertById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseRefundAlert> selectBaseRefundAlertList(BaseRefundAlert baseRefundAlert)
    {
        return baseRefundAlertMapper.selectBaseRefundAlertList(baseRefundAlert);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseRefundAlert(BaseRefundAlert baseRefundAlert)
    {
        return baseRefundAlertMapper.insertBaseRefundAlert(baseRefundAlert);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseRefundAlert 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseRefundAlert(BaseRefundAlert baseRefundAlert)
    {
        baseRefundAlert.setUpdateTime(DateUtils.getNowDate());
        return baseRefundAlertMapper.updateBaseRefundAlert(baseRefundAlert);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundAlertByIds(Integer[] ids)
    {
        return baseRefundAlertMapper.deleteBaseRefundAlertByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseRefundAlertById(Integer id)
    {
        return baseRefundAlertMapper.deleteBaseRefundAlertById(id);
    }
}
