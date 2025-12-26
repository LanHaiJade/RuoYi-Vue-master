package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseSimFlowLogoutMapper;
import com.ruoyi.system.domain.BaseSimFlowLogout;
import com.ruoyi.system.service.IBaseSimFlowLogoutService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseSimFlowLogoutServiceImpl implements IBaseSimFlowLogoutService 
{
    @Autowired
    private BaseSimFlowLogoutMapper baseSimFlowLogoutMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseSimFlowLogout selectBaseSimFlowLogoutById(Long id)
    {
        return baseSimFlowLogoutMapper.selectBaseSimFlowLogoutById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseSimFlowLogout 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseSimFlowLogout> selectBaseSimFlowLogoutList(BaseSimFlowLogout baseSimFlowLogout)
    {
        return baseSimFlowLogoutMapper.selectBaseSimFlowLogoutList(baseSimFlowLogout);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseSimFlowLogout 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseSimFlowLogout(BaseSimFlowLogout baseSimFlowLogout)
    {
        baseSimFlowLogout.setCreateTime(DateUtils.getNowDate());
        return baseSimFlowLogoutMapper.insertBaseSimFlowLogout(baseSimFlowLogout);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseSimFlowLogout 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseSimFlowLogout(BaseSimFlowLogout baseSimFlowLogout)
    {
        return baseSimFlowLogoutMapper.updateBaseSimFlowLogout(baseSimFlowLogout);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSimFlowLogoutByIds(Long[] ids)
    {
        return baseSimFlowLogoutMapper.deleteBaseSimFlowLogoutByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseSimFlowLogoutById(Long id)
    {
        return baseSimFlowLogoutMapper.deleteBaseSimFlowLogoutById(id);
    }
}
