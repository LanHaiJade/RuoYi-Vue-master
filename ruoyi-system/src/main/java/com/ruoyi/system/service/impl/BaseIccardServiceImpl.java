package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.domain.*;
import com.ruoyi.common.domain.dto.RechargeIcDto;
import com.ruoyi.common.domain.vo.BaseIccardVo;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.common.utils.sm.ExcelImportUtil;
import com.ruoyi.common.utils.sm.NumberConvertUtils;
import com.ruoyi.system.mapper.BaseIccardRechargeMapper;
import com.ruoyi.system.mapper.BaseIccardrerecordMapper;
import com.ruoyi.system.mapper.BaseUserMapper;
import org.apache.poi.ss.formula.functions.T;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BaseIccardMapper;
import com.ruoyi.system.service.IBaseIccardService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import static com.ruoyi.common.utils.PageUtils.startPage;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2025-12-24
 */
@Service
public class BaseIccardServiceImpl implements IBaseIccardService {
    private static final Logger log = LoggerFactory.getLogger(BaseIccardServiceImpl.class);
    @Autowired
    private BaseIccardMapper baseIccardMapper;

    @Autowired
    private BaseUserMapper baseUserMapper;

    // 充值记录表
    @Autowired
    private BaseIccardRechargeMapper baseIccardRechargeMapper;

    // 操作记录表
    @Autowired
    private BaseIccardrerecordMapper baseIccardrerecordMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BaseIccard selectBaseIccardById(Long id) {
        return baseIccardMapper.selectBaseIccardById(id);
    }

    /**
     * 查询【会员列表】列表
     *
     * @param baseIccard 【会员列表】
     * @return 【会员列表】
     */
    @Override
    public List<BaseIccard> selectBaseIccardList(BaseIccard baseIccard) {
        return baseIccardMapper.selectBaseIccardList(baseIccard);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param baseIccard 【请填写功能名称】
     * @return 结果
     */
    @Override
    public String insertBaseIccard(BaseIccard baseIccard) {
        // 判断用户ID是否为无效值
        if (baseIccard.getUserId() == null) {
            return "用户ID为空";
        }
        // 判断重复卡号
        if (repeatIc(baseIccard) == 1) {
            return "卡号已存在";
        }
        if (baseIccard.getCtrlUserName() == null) {
            BaseUser baseUser = baseUserMapper.selectBaseUserById(baseIccard.getCtrlUserId());
            if (baseUser != null) {
                baseIccard.setCtrlUserName(baseUser.getUserName());
            }
        }
        baseIccard.setStatus(0L);
        baseIccard.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtils.getNowDate()));
        baseIccard.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtils.getNowDate()));
        // 记录一下开卡操作日志
        BaseIccardrerecord baseIccardrerecord = getCordLog(baseIccard);
        baseIccardrerecord.setMessage("开卡成功");
        baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);

        if (baseIccardMapper.insertBaseIccard(baseIccard) > 0) {
            return "开卡成功";
        }
        return "开卡失败";
    }

    /**
     * 修改【会员卡】
     *
     * @param baseIccard 【会员卡】
     * @return 结果
     */
    @Override
    public String updateBaseIccard(BaseIccard baseIccard) {
        // 判断用户ID是否为无效值
        if (baseIccard.getUserId() == null) {
            return "用户ID为空";
        }
        // 检查IC卡状态
        if (baseIccard.getStatus() != 0) {
            return "请使用正常IC卡";
        }
        // 判断重复卡号
        if (repeatIc(baseIccard) == 1) {
            return "卡号已存在";
        }

        if (baseIccard.getCtrlUserName() == null) {
            BaseUser baseUser = baseUserMapper.selectBaseUserById(baseIccard.getCtrlUserId());
            if (baseUser != null) {
                baseIccard.setCtrlUserName(baseUser.getUserName());
            }
        }
        baseIccard.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtils.getNowDate()));

        // 记录一下修改日志
        BaseIccard baseIccardById = baseIccardMapper.selectBaseIccardById(baseIccard.getId());
        BaseIccardrerecord baseIccardrerecord = getCordLog(baseIccard);
        // 分情况处理
        if (!baseIccard.getCpuNo().equals(baseIccardById.getCpuNo())) {
            baseIccardrerecord.setMessage("修改卡名称：原名称" + baseIccardById.getCpuNo() + "，修改名称为" + baseIccard.getCpuNo());
        }else if (!baseIccard.getName().equals(baseIccardById.getName())) {
            baseIccardrerecord.setMessage("修改姓名：原姓名" + baseIccardById.getName() + ",修改姓名为" + baseIccard.getName());
        }else if (!baseIccard.getPhone().equals(baseIccardById.getPhone())) {
            baseIccardrerecord.setMessage("修改手机号：原手机号" + baseIccardById.getPhone() + ",修改手机号为" + baseIccard.getPhone());
        }else if (!baseIccard.getRemark().equals(baseIccardById.getRemark())) {
            baseIccardrerecord.setMessage("修改备注：原备注" + baseIccardById.getRemark() + ",修改备注为" + baseIccard.getRemark());
        }
        baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);


        if (baseIccardMapper.updateBaseIccard(baseIccard) > 0) {
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardByIds(Long[] ids) {
        return baseIccardMapper.deleteBaseIccardByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBaseIccardById(Long id) {
        return baseIccardMapper.deleteBaseIccardById(id);
    }

    /**
     * 会员卡充值
     *
     * @param rechargeIcDto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String rechargeIc(RechargeIcDto rechargeIcDto) {
        // 参数校验
        BigDecimal decimal = NumberConvertUtils.safeStringToBigDecimal(rechargeIcDto.getAmount());
        if (decimal == null) {
            return "金额为空！";
        }
        // 如果没有主键ID 找到操作人下所有的IC卡进行充值
        if (rechargeIcDto.getIds() == null || rechargeIcDto.getIds().isEmpty()) {
            List<BaseIccard> iccardList = baseIccardMapper.selectBaseIccard(rechargeIcDto.getCtrlUserId(), 0L);
            List<Long> baseIccardIds = new ArrayList<>();
            for (BaseIccard baseIccard : iccardList) {
                baseIccardIds.add(baseIccard.getId());
            }
            rechargeIcDto.setIds(baseIccardIds);
        }

        List<BaseIccardrerecord> baseIccardrerecordList = new ArrayList<>();
        List<BaseIccardRecharge> IccardRechargeList = new ArrayList<>();
        //先检查卡状态 查询目前卡中的余额 并添加数据
        List<BaseIccard> iccardList = baseIccardMapper.selectBaseIccardIds(rechargeIcDto.getIds());
        for (BaseIccard baseIccard : iccardList) {
            if (baseIccard.getStatus() != 0) {
                return "充值列表中存在不正常卡";
            }
        }
        for (BaseIccard baseIccard : iccardList) {
            BaseIccardrerecord baseIccardrerecord = new BaseIccardrerecord();
            BaseIccardRecharge IccardRecharge = new BaseIccardRecharge();
            IccardRecharge.setAfterRechargeAmount(baseIccard.getBalance());

            baseIccard.setBalance(baseIccard.getBalance().add(decimal));

            IccardRecharge.setBeforeRechargeAmount(baseIccard.getBalance());
            IccardRecharge.setRechargeAmount(decimal);
            IccardRecharge.setUpdateTime(DateUtils.getNowDate());
            IccardRecharge.setCreateTime(DateUtils.getNowDate());
            IccardRecharge.setCardNumber(baseIccard.getIdNo());
            IccardRecharge.setUserId(baseIccard.getUserId());
            IccardRecharge.setPayType(0);
            IccardRecharge.setPayStatus(1);
            IccardRecharge.setCpuNo(baseIccard.getCpuNo());
            IccardRecharge.setRemark(baseIccard.getRemark());
            if (rechargeIcDto.getCtrlUserId() != null) {
                BaseUser baseUser = baseUserMapper.selectBaseUserById(rechargeIcDto.getCtrlUserId());
                if (baseUser != null) {
                    baseIccardrerecord.setCtrlUserName(baseUser.getUserName());
                    IccardRecharge.setCtrlUserId(rechargeIcDto.getCtrlUserId());
                    IccardRecharge.setCtrlUserName(baseUser.getUserName());
                    baseIccard.setCtrlUserName(baseUser.getUserName());
                    baseIccard.setCtrlUserId(rechargeIcDto.getCtrlUserId());
                }
            }
            baseIccard.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(DateUtils.getNowDate()));

            baseIccardrerecord.setMessage("卡充值：" + rechargeIcDto.getAmount().toString());
            baseIccardrerecord.setState(baseIccard.getStatus());
            baseIccardrerecord.setUpdateTime(DateUtils.getNowDate());
            baseIccardrerecord.setCreateTime(DateUtils.getNowDate());
            baseIccardrerecord.setCardNumber(baseIccard.getIdNo());
            baseIccardrerecord.setUserId(rechargeIcDto.getCtrlUserId());
            baseIccardrerecord.setAmount(baseIccard.getBalance());
            baseIccardrerecord.setName(baseIccard.getName());

            baseIccardrerecordList.add(baseIccardrerecord);
            IccardRechargeList.add(IccardRecharge);
        }

        // 批量修改余额信息
        baseIccardMapper.updateBaseIccardIds(iccardList);
        // 记录充值记录信息
        baseIccardrerecordMapper.insertBaseIccardrerecordList(baseIccardrerecordList);
        baseIccardRechargeMapper.insertBaseIccardRechargeList(IccardRechargeList);
        return "充值成功";
    }

    /**
     * 补卡
     *
     * @param baseIccard
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String makeupIc(BaseIccard baseIccard) {

        // 判断重复卡号
        if (repeatIc(baseIccard) == 1) {
            return "卡号已存在";
        }
        if (baseIccard.getStatus() != 0) {
            return "请使用正常IC卡";
        }
        // 记录日志
        BaseIccardrerecord baseIccardrerecord = new BaseIccardrerecord();
        BaseIccard baseIccardById = baseIccardMapper.selectBaseIccardById(baseIccard.getId());
        getLog(baseIccard, baseIccardrerecord, baseIccardById);
        baseIccardrerecord.setMessage("补卡：原卡号" + baseIccardById.getIdNo() + ",新卡号" + baseIccard.getIdNo());
        baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);

        int updateBaseIccard = baseIccardMapper.updateBaseIccard(baseIccard);
        if (updateBaseIccard > 0) {
            return "补卡成功";
        }
        return "补卡失败";
    }



    /**
     * 导入IC卡信息
     *
     * @param file
     * @param userId
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String importCardsFromExcel(MultipartFile file, Long userId) {
        try {
            // 1. 读取Excel
            List<BaseIccard> excelDataList = ExcelImportUtil.readExcel(file);

            if (excelDataList.isEmpty()) {
                return "Excel文件中没有数据";
            }
            // 2. 数据处理和去重
            List<BaseIccard> validCards = new ArrayList<>();
            Map<String, BaseIccard> cardMap = new HashMap<>(); // 用于内存去重
            int duplicateCount = 0;
            int invalidCount = 0;

            // 收集所有卡号，用于查询数据库中的重复
            List<String> allCardNos = new ArrayList<>();
            for (BaseIccard card : excelDataList) {
                if (card.getIdNo() != null && !card.getIdNo().trim().isEmpty()) {
                    allCardNos.add(card.getIdNo());
                }
            }

            // 3. 查询数据库中已存在的卡号
            Set<String> existCardNos = new HashSet<>();
            if (!allCardNos.isEmpty()) {
                // 分批查询，避免SQL过长
                int batchSize = 1000;
                for (int i = 0; i < allCardNos.size(); i += batchSize) {
                    int end = Math.min(i + batchSize, allCardNos.size());
                    List<String> batch = allCardNos.subList(i, end);
                    List<BaseIccard> existCards = baseIccardMapper.selectCardsByNos(batch, userId);
                    for (BaseIccard existCard : existCards) {
                        existCardNos.add(existCard.getIdNo());
                    }
                }
            }

            // 赋值一下操作人
            BaseUser baseUser = baseUserMapper.selectBaseUserById(userId);
            // 4. 处理每条数据
            for (BaseIccard card : excelDataList) {
                // 基本验证
                if (card.getIdNo() == null || card.getIdNo().trim().isEmpty()) {
                    invalidCount++;
                    continue;
                }

                if (card.getCpuNo() == null || card.getCpuNo().trim().isEmpty()) {
                    invalidCount++;
                    continue;
                }

                if (card.getName() == null || card.getName().trim().isEmpty()) {
                    invalidCount++;
                    continue;
                }

                if (card.getBalance() == null) {
                    card.setBalance(BigDecimal.ZERO);
                }

                // 设置用户ID
                card.setUserId(userId);
                card.setCtrlUserId(userId);
                card.setCtrlUserName(baseUser.getUserName());

                // 内存去重（同一批数据中的重复）
                if (cardMap.containsKey(card.getIdNo())) {
                    duplicateCount++;
                    continue;
                }

                // 数据库去重（已存在的卡号）
                if (existCardNos.contains(card.getIdNo())) {
                    duplicateCount++;
                    continue;
                }

                cardMap.put(card.getIdNo(), card);
                validCards.add(card);
            }

            // 5. 批量插入
            int insertedCount = 0;
            if (!validCards.isEmpty()) {
                insertedCount = baseIccardMapper.batchInsertBaseIccard(validCards);
            }

            // 记录操作日志
            for (BaseIccard baseIccard : excelDataList) {
                BaseIccardrerecord baseIccardrerecord = new BaseIccardrerecord();
                baseIccardrerecord.setName(baseIccard.getName());
                baseIccardrerecord.setState(baseIccard.getStatus());
                baseIccardrerecord.setCreateTime(DateUtils.getNowDate());
                baseIccardrerecord.setUpdateTime(DateUtils.getNowDate());
                baseIccardrerecord.setCardNumber(baseIccard.getIdNo());
                baseIccardrerecord.setUserId(userId);
                baseIccardrerecord.setAmount(baseIccard.getBalance());
                baseIccardrerecord.setCtrlUserName(baseIccard.getCtrlUserName());
                baseIccardrerecord.setMessage("导入开通会员卡,余额：" + baseIccard.getBalance() + "元");
                baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);
            }


            // 6. 返回结果
            return String.format("导入完成！共读取 %d 条数据，成功导入 %d 条，跳过 %d 条重复数据，%d 条无效数据",
                    excelDataList.size(), insertedCount, duplicateCount, invalidCount);

        } catch (Exception e) {
            e.printStackTrace();
            return "导入失败：" + e.getMessage();
        }
    }

    /**
     * 修改卡状态
     *
     * @param rechargeIcDto
     * @return
     */
    @Override
    public String editStatus(RechargeIcDto rechargeIcDto) {
        try {
            if (rechargeIcDto.getCtrlUserId() == null) {
                return "请校验参数";
            }
            if (rechargeIcDto.getIds() == null || rechargeIcDto.getIds().isEmpty()) {
                return "请校验参数";
            }
            if (rechargeIcDto.getStatus() == null) {
                return "请校验参数";
            }
            List<BaseIccard> iccardList = baseIccardMapper.selectBaseIccardIds(rechargeIcDto.getIds());

            BaseUser baseUser = baseUserMapper.selectBaseUserById(rechargeIcDto.getCtrlUserId());
            for (BaseIccard baseIccard : iccardList) {
                BaseIccardrerecord baseIccardrerecord = getBaseIccardrerecord(rechargeIcDto, baseIccard, baseUser);
                baseIccard.setCtrlUserId(rechargeIcDto.getCtrlUserId());
                baseIccard.setCtrlUserName(baseUser.getUserName());
                if (baseIccard.getStatus() == 5){
                    return "包含已销卡";
                }
                baseIccard.setStatus(rechargeIcDto.getStatus());
                baseIccardrerecordMapper.insertBaseIccardrerecord(baseIccardrerecord);
            }

            baseIccardMapper.updateBaseIccardIds(iccardList);
            return "修改成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "修改失败";
        }
    }

    /**
     * 不分页查询
     * @param baseIccard
     * @return
     */
    @Override
    public List<BaseIccard> selectBaseIccardListNoPage(BaseIccardVo baseIccardVo) {
        return baseIccardMapper.selectBaseIccardListNoPage(baseIccardVo);
    }

    // 状态修改日志记录方法
    public BaseIccardrerecord getBaseIccardrerecord(RechargeIcDto rechargeIcDto, BaseIccard baseIccard, BaseUser baseUser) {
        BaseIccardrerecord baseIccardrerecord = new BaseIccardrerecord();
        baseIccardrerecord.setState(baseIccard.getStatus());
        baseIccardrerecord.setUpdateTime(DateUtils.getNowDate());
        baseIccardrerecord.setCreateTime(DateUtils.getNowDate());
        baseIccardrerecord.setCtrlUserName(baseUser.getUserName());
        baseIccardrerecord.setCardNumber(baseIccard.getIdNo());
        baseIccardrerecord.setUserId(baseIccard.getUserId());
        baseIccardrerecord.setAmount(baseIccard.getBalance());
        baseIccardrerecord.setName(baseIccard.getName());
        if (rechargeIcDto.getStatus() == 0) { // 状态为启用时 记录操作日志
            baseIccardrerecord.setMessage("启用卡");
        } else if (rechargeIcDto.getStatus() == 4) {
            baseIccardrerecord.setMessage("禁用卡");
        } else if (rechargeIcDto.getStatus() == 5) {
            baseIccardrerecord.setMessage("注销卡");
        }
        return baseIccardrerecord;
    }

    // 修改开卡操作日志公共方法
    public BaseIccardrerecord getCordLog(BaseIccard baseIccard) {
        BaseIccardrerecord baseIccardrerecord = new BaseIccardrerecord();
        getLog(baseIccard, baseIccardrerecord, baseIccard);
        return baseIccardrerecord;
    }

    // 修改开卡补卡操作日志填充公共方法
    public void getLog(BaseIccard baseIccard, BaseIccardrerecord baseIccardrerecord, BaseIccard baseIccardById) {
        baseIccardrerecord.setState(baseIccardById.getStatus());
        baseIccardrerecord.setUpdateTime(DateUtils.getNowDate());
        baseIccardrerecord.setCreateTime(DateUtils.getNowDate());
        baseIccardrerecord.setCtrlUserName(baseIccardById.getCtrlUserName());
        baseIccardrerecord.setCardNumber(baseIccard.getIdNo());
        baseIccardrerecord.setUserId(baseIccard.getUserId());
        baseIccardrerecord.setAmount(baseIccardById.getBalance());
        baseIccardrerecord.setName(baseIccardById.getName());
    }


    // 重复卡号处理
    public int repeatIc(BaseIccard baseIccard) {
        // 判断卡号是否重复
        baseIccard.setStatus(0L);
        List<BaseIccard> iccardList = baseIccardMapper.selectBaseIccard(baseIccard.getUserId(), baseIccard.getStatus());
        if (baseIccard.getId() != null) {
            for (BaseIccard iccard : iccardList) {
                // 筛选一下自己 如果是修改，跳过
                if (baseIccard.getId().equals(iccard.getId())) {
                    continue;
                }
                if (baseIccard.getIdNo().equals(iccard.getIdNo())) {
                    return 1;
                }
            }
        } else {
            for (BaseIccard iccard : iccardList) {
                if (baseIccard.getIdNo().equals(iccard.getIdNo())) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

