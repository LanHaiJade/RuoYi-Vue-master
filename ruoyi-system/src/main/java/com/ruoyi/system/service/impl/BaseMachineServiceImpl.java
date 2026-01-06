package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ruoyi.common.constant.ScheduleConstants;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.enums.sm.ControlStatus;
import com.ruoyi.common.enums.sm.MachineType;
import com.ruoyi.common.enums.sm.OnlineStatus;
import com.ruoyi.common.enums.sm.Status;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.sm.DateUtil;
import com.ruoyi.common.utils.sm.SbOnline;
import com.ruoyi.common.domain.BaseSocketStatistics;
import com.ruoyi.common.domain.vo.MachineVo;
import com.ruoyi.common.utils.sm.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseMachineMapper;
import com.ruoyi.common.domain.BaseMachine;
import com.ruoyi.system.service.IBaseMachineService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseMachineServiceImpl implements IBaseMachineService 
{
    @Autowired
    private BaseMachineMapper baseMachineMapper;
    @Autowired
    private RedisCache redisCache;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseMachine selectBaseMachineById(Long id)
    {
        return baseMachineMapper.selectBaseMachineById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BaseMachine> selectBaseMachineList(BaseMachine baseMachine)
    {
        return baseMachineMapper.selectBaseMachineList(baseMachine);
    }

    /**
     * 查询运营商售货机列表
     * @param machineVo
     * @return
     */
    @Override
    public List<BaseMachine> selectBaseMachineList(MachineVo machineVo){
        if(machineVo.getUserId() == null || machineVo.getUserId() < 1) return null;
        if(machineVo.getStatus() != null && machineVo.getStatus() != Status.Normal.getStatus()
            && machineVo.getStatus() != Status.Invalid.getStatus()){
            machineVo.setStatus(null);
        }
        if(machineVo.getOnLineStatus() != null && (machineVo.getOnLineStatus() == OnlineStatus.Offline.getStatus()
                || machineVo.getOnLineStatus() == OnlineStatus.Online.getStatus()) ) {
            machineVo.setOnlineTime(DateUtil.onlineTime(new Date()));
        }else{
            machineVo.setOnLineStatus(OnlineStatus.All.getStatus());
        }
        return baseMachineMapper.selectMachineVoList(machineVo);
    }
    /**
     * 组织售货机列表数据
     * @param baseMachineList
     * @return
     */
    @Override
    public List<MachineVo>  selectMachineVoList(List<BaseMachine> baseMachineList, MachineVo mVo){
        List<MachineVo> machineVoList = new ArrayList<MachineVo>();
        for(BaseMachine baseMachine:baseMachineList){
            MachineVo machineVo = new MachineVo();
            machineVo.setId(baseMachine.getId());
            machineVo.setSbId(baseMachine.getSbId());
            machineVo.setSbName(baseMachine.getSbName());
            machineVo.setSbNo(baseMachine.getSbNo());
            machineVo.setVersion(baseMachine.getVersion());
            machineVo.setMachineType(baseMachine.getMachineType());
            machineVo.setMachineTypeName(MachineType.getName(baseMachine.getMachineType()));
            machineVo.setControlStatus(baseMachine.getControlStatus());
            machineVo.setControlStatusName(ControlStatus.getName(baseMachine.getControlStatus()));
            if(StringUtil.equals("en", mVo.getLanguage())){
                machineVo.setMachineTypeName(MachineType.getEnglishName(baseMachine.getMachineType()));
                machineVo.setControlStatusName(ControlStatus.getNameEn(baseMachine.getControlStatus()));
            }
            machineVo.setCreateTime(DateUtil.time(baseMachine.getCreateTime()));
            machineVo.setEndTime(DateUtil.time(baseMachine.getEndTime()));
            machineVo.setSerEndTime(DateUtil.time(baseMachine.getSerEndTime()));
            machineVo.setUpdateTime(DateUtil.time(baseMachine.getUpdateTime()));
            machineVo.setNetwork(baseMachine.getNetwork());
            machineVo.setStatus(baseMachine.getStatus());
            BaseSocketStatistics socketStatistics = redisCache.getSocketStatistics(machineVo.getSbId());
            boolean isOnLine = SbOnline.getSbIsOnline(socketStatistics);
            machineVo.setOnLine(isOnLine);
            machineVoList.add(machineVo);
        }
        return machineVoList;
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBaseMachine(BaseMachine baseMachine)
    {
        baseMachine.setCreateTime(DateUtils.getNowDate());
        return baseMachineMapper.insertBaseMachine(baseMachine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param baseMachine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBaseMachine(BaseMachine baseMachine)
    {
        baseMachine.setUpdateTime(DateUtils.getNowDate());
        return baseMachineMapper.updateBaseMachine(baseMachine);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineByIds(Long[] ids)
    {
        return baseMachineMapper.deleteBaseMachineByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseMachineById(Long id)
    {
        return baseMachineMapper.deleteBaseMachineById(id);
    }
}
