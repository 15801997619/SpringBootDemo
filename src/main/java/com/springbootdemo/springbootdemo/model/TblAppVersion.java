package com.springbootdemo.springbootdemo.model;

public class TblAppVersion {
    private String id;

    private String versionSeq;

    private String updateFlag;

    private String useFlag;

    private String downUrl;

    private String updateMsg;

    private String recCrtTime;

    private String recUpdTime;

    private String resvd;

    private String versionName;

    private String sysType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVersionSeq() {
        return versionSeq;
    }

    public void setVersionSeq(String versionSeq) {
        this.versionSeq = versionSeq == null ? null : versionSeq.trim();
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag == null ? null : updateFlag.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl == null ? null : downUrl.trim();
    }

    public String getUpdateMsg() {
        return updateMsg;
    }

    public void setUpdateMsg(String updateMsg) {
        this.updateMsg = updateMsg == null ? null : updateMsg.trim();
    }

    public String getRecCrtTime() {
        return recCrtTime;
    }

    public void setRecCrtTime(String recCrtTime) {
        this.recCrtTime = recCrtTime == null ? null : recCrtTime.trim();
    }

    public String getRecUpdTime() {
        return recUpdTime;
    }

    public void setRecUpdTime(String recUpdTime) {
        this.recUpdTime = recUpdTime == null ? null : recUpdTime.trim();
    }

    public String getResvd() {
        return resvd;
    }

    public void setResvd(String resvd) {
        this.resvd = resvd == null ? null : resvd.trim();
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType == null ? null : sysType.trim();
    }
}