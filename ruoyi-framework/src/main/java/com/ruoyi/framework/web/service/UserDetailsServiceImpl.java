package com.ruoyi.framework.web.service;

import com.ruoyi.common.enums.sm.RoleType;
import com.ruoyi.common.domain.BaseUser;
import com.ruoyi.common.domain.BaseUserRole;
import com.ruoyi.system.service.IBaseUserRoleService;
import com.ruoyi.system.service.IBaseUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.enums.UserStatus;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.MessageUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.service.ISysUserService;

/**
 * 用户验证处理
 *
 * @author ruoyi
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private ISysUserService userService;
    
    @Autowired
    private SysPasswordService passwordService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private IBaseUserService baseUserService;

    @Autowired
    private IBaseUserRoleService baseUserRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        SysUser user = userService.selectUserByUserName(username);
        BaseUser baseUser = baseUserService.selectBaseUserByPhone(username);
        if(baseUser != null){
            BaseUserRole baseUserRole = baseUserRoleService.selectBaseUserRoleByUserId(baseUser.getId());
            if(baseUserRole.getRoleId() == RoleType.Operator.getType()){
                user = userService.selectUserByUserName("operator");
                user.setUserName(baseUser.getPhone());
                user.setPassword(baseUser.getPassword());
                passwordService.validate(user,1);
            }
        }else{
            if (StringUtils.isNull(user))
            {
                log.info("登录用户：{} 不存在.", username);
                throw new ServiceException(MessageUtils.message("user.not.exists"));
            }
            else if (UserStatus.DELETED.getCode().equals(user.getDelFlag()))
            {
                log.info("登录用户：{} 已被删除.", username);
                throw new ServiceException(MessageUtils.message("user.password.delete"));
            }
            else if (UserStatus.DISABLE.getCode().equals(user.getStatus()))
            {
                log.info("登录用户：{} 已被停用.", username);
                throw new ServiceException(MessageUtils.message("user.blocked"));
            }
            passwordService.validate(user,2);
        }

        return createLoginUser(user);
    }

    public UserDetails createLoginUser(SysUser user)
    {
        return new LoginUser(user.getUserId(), user.getDeptId(), user, permissionService.getMenuPermission(user));
    }
}
