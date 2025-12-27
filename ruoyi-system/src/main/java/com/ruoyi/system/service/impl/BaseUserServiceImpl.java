package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.sm.RoleType;
import com.ruoyi.common.enums.sm.Status;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.sm.StringUtil;
import com.ruoyi.system.domain.BaseUserRole;
import com.ruoyi.system.mapper.BaseUserRoleMapper;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseUserMapper;
import com.ruoyi.system.domain.BaseUser;
import com.ruoyi.system.service.IBaseUserService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseUserServiceImpl implements IBaseUserService 
{
    @Autowired
    private BaseUserMapper baseUserMapper;

    @Autowired
    private BaseUserRoleMapper baseUserRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseUser selectBaseUserById(Long id)
    {
        return baseUserMapper.selectBaseUserById(id);
    }

    /**
     * 根据手机账号查询用户信息
     * @param Phone
     * @return
     */
    @Override
    public BaseUser selectBaseUserByPhone(String Phone)
    {
        return baseUserMapper.selectBaseUserByPhone(Phone);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseUser> selectBaseUserList(BaseUser baseUser)
    {
        return baseUserMapper.selectBaseUserList(baseUser);
    }

    /**
     * 新增运营商
     * @param baseUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public AjaxResult insertBaseUser(BaseUser baseUser)
    {
        if(StringUtil.notNull(baseUser.getPhone())&&StringUtil.notNull(baseUser.getPassword())
            &&StringUtil.notNull(baseUser.getUserName())){
            return AjaxResult.error("Missing required parameters!");
        }
        BaseUser user = baseUserMapper.selectBaseUserByPhone(baseUser.getPhone());
        if(user!=null) return AjaxResult.error("Account already exists!");
        baseUser.setCreateTime(DateUtils.getNowDate());
        baseUser.setDiscount(BigDecimal.valueOf(1));
        baseUser.setRatedis(BigDecimal.valueOf(0));
        baseUser.setShopAuth((long) Status.Invalid.getStatus());
        baseUser.setPayAuth((long) Status.Invalid.getStatus());
        baseUser.setWxSubmch((long) Status.Invalid.getStatus());
        baseUser.setAlipaySubmch((long) Status.Invalid.getStatus());
        baseUser.setBalance(BigDecimal.valueOf(0));
        baseUser.setIntegral(Long.valueOf(0));
        baseUser.setStatus((long) Status.Normal.getStatus());
        baseUser.setSort((long) Status.Normal.getStatus());
        int rows = baseUserMapper.insertBaseUser(baseUser);
        if(rows>0){
            baseUser = baseUserMapper.selectBaseUserByPhone(baseUser.getPhone());
            BaseUserRole userRole = new BaseUserRole();
            userRole.setUserId(baseUser.getId());
            userRole.setRoleId((long) RoleType.Operator.getType());
            baseUserRoleMapper.insertBaseUserRole(userRole);
        }
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 修改【更新用户信息】
     * 
     * @param baseUser 【售货机用户信息】
     * @return 结果
     */
    @Override
    public int updateBaseUser(BaseUser baseUser)
    {
        if(baseUser.getPassword()!=null) baseUser.setPassword(new Sha256Hash(baseUser.getPassword()).toHex());
        return baseUserMapper.updateBaseUser(baseUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserByIds(Long[] ids)
    {
        return baseUserMapper.deleteBaseUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseUserById(Long id)
    {
        return baseUserMapper.deleteBaseUserById(id);
    }
}
