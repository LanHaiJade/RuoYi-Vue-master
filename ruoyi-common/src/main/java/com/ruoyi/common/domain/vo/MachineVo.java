package com.ruoyi.common.domain.vo;

import com.ruoyi.common.core.domain.BaseVo;

import java.util.Date;

public class MachineVo extends BaseVo {

    private String sbId;
    private String sbName;
    private String sbNo;
    private String version;
    private Integer machineType;
    private String machineTypeName;
    private String machineTypeNameEn;
    private Integer controlStatus;
    private String controlStatusName;
    private String controlStatusNameEn;
    private String endTime;
    private String serEndTime;
    private Integer network;
    private boolean isOnLine;
    private Integer status;
    private Integer onLineStatus;//-1全部，0在线，4离线
    private Date onlineTime;

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Integer getOnLineStatus() {
        return onLineStatus;
    }

    public void setOnLineStatus(Integer onLineStatus) {
        this.onLineStatus = onLineStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSbId() {
        return sbId;
    }

    public void setSbId(String sbId) {
        this.sbId = sbId;
    }

    public String getSbName() {
        return sbName;
    }

    public void setSbName(String sbName) {
        this.sbName = sbName;
    }

    public String getSbNo() {
        return sbNo;
    }

    public void setSbNo(String sbNo) {
        this.sbNo = sbNo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMachineType() {
        return machineType;
    }

    public void setMachineType(Integer machineType) {
        this.machineType = machineType;
    }

    public String getMachineTypeName() {
        return machineTypeName;
    }

    public void setMachineTypeName(String machineTypeName) {
        this.machineTypeName = machineTypeName;
    }

    public String getMachineTypeNameEn() {
        return machineTypeNameEn;
    }

    public void setMachineTypeNameEn(String machineTypeNameEn) {
        this.machineTypeNameEn = machineTypeNameEn;
    }

    public Integer getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(Integer controlStatus) {
        this.controlStatus = controlStatus;
    }

    public String getControlStatusName() {
        return controlStatusName;
    }

    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }

    public String getControlStatusNameEn() {
        return controlStatusNameEn;
    }

    public void setControlStatusNameEn(String controlStatusNameEn) {
        this.controlStatusNameEn = controlStatusNameEn;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSerEndTime() {
        return serEndTime;
    }

    public void setSerEndTime(String serEndTime) {
        this.serEndTime = serEndTime;
    }

    public Integer getNetwork() {
        return network;
    }

    public void setNetwork(Integer network) {
        this.network = network;
    }

    public boolean isOnLine() {
        return isOnLine;
    }

    public void setOnLine(boolean onLine) {
        isOnLine = onLine;
    }


}
