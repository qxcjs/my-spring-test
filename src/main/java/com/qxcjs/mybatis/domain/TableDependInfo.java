package com.qxcjs.mybatis.domain;

import java.util.Date;

public class TableDependInfo {
    private Integer findex;

    private Integer fhostKey;

    private String fhostId;

    private Integer fdatabaseKey;

    private String fdatabaseName;

    private Integer ftableKey;

    private String ftableName;

    private Integer fdependHostKey;

    private String fdependHostId;

    private Integer fdependDatabaseKey;

    private String fdependDatabaseName;

    private Integer fdependTableKey;

    private String fdependTableName;

    private String fbelongSystem;

    private Integer fuseFlag;

    private String fremark;

    private Date fcreateTime;

    private Date fmodifyTime;

    private String fmodifyUser;

    private Integer fversion;

    public Integer getFindex() {
        return findex;
    }

    public void setFindex(Integer findex) {
        this.findex = findex;
    }

    public Integer getFhostKey() {
        return fhostKey;
    }

    public void setFhostKey(Integer fhostKey) {
        this.fhostKey = fhostKey;
    }

    public String getFhostId() {
        return fhostId;
    }

    public void setFhostId(String fhostId) {
        this.fhostId = fhostId == null ? null : fhostId.trim();
    }

    public Integer getFdatabaseKey() {
        return fdatabaseKey;
    }

    public void setFdatabaseKey(Integer fdatabaseKey) {
        this.fdatabaseKey = fdatabaseKey;
    }

    public String getFdatabaseName() {
        return fdatabaseName;
    }

    public void setFdatabaseName(String fdatabaseName) {
        this.fdatabaseName = fdatabaseName == null ? null : fdatabaseName.trim();
    }

    public Integer getFtableKey() {
        return ftableKey;
    }

    public void setFtableKey(Integer ftableKey) {
        this.ftableKey = ftableKey;
    }

    public String getFtableName() {
        return ftableName;
    }

    public void setFtableName(String ftableName) {
        this.ftableName = ftableName == null ? null : ftableName.trim();
    }

    public Integer getFdependHostKey() {
        return fdependHostKey;
    }

    public void setFdependHostKey(Integer fdependHostKey) {
        this.fdependHostKey = fdependHostKey;
    }

    public String getFdependHostId() {
        return fdependHostId;
    }

    public void setFdependHostId(String fdependHostId) {
        this.fdependHostId = fdependHostId == null ? null : fdependHostId.trim();
    }

    public Integer getFdependDatabaseKey() {
        return fdependDatabaseKey;
    }

    public void setFdependDatabaseKey(Integer fdependDatabaseKey) {
        this.fdependDatabaseKey = fdependDatabaseKey;
    }

    public String getFdependDatabaseName() {
        return fdependDatabaseName;
    }

    public void setFdependDatabaseName(String fdependDatabaseName) {
        this.fdependDatabaseName = fdependDatabaseName == null ? null : fdependDatabaseName.trim();
    }

    public Integer getFdependTableKey() {
        return fdependTableKey;
    }

    public void setFdependTableKey(Integer fdependTableKey) {
        this.fdependTableKey = fdependTableKey;
    }

    public String getFdependTableName() {
        return fdependTableName;
    }

    public void setFdependTableName(String fdependTableName) {
        this.fdependTableName = fdependTableName == null ? null : fdependTableName.trim();
    }

    public String getFbelongSystem() {
        return fbelongSystem;
    }

    public void setFbelongSystem(String fbelongSystem) {
        this.fbelongSystem = fbelongSystem == null ? null : fbelongSystem.trim();
    }

    public Integer getFuseFlag() {
        return fuseFlag;
    }

    public void setFuseFlag(Integer fuseFlag) {
        this.fuseFlag = fuseFlag;
    }

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark == null ? null : fremark.trim();
    }

    public Date getFcreateTime() {
        return fcreateTime;
    }

    public void setFcreateTime(Date fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    public Date getFmodifyTime() {
        return fmodifyTime;
    }

    public void setFmodifyTime(Date fmodifyTime) {
        this.fmodifyTime = fmodifyTime;
    }

    public String getFmodifyUser() {
        return fmodifyUser;
    }

    public void setFmodifyUser(String fmodifyUser) {
        this.fmodifyUser = fmodifyUser == null ? null : fmodifyUser.trim();
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }
}