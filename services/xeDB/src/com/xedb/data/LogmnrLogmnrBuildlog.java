package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrLogmnrBuildlog generated by hbm2java
 */
public class LogmnrLogmnrBuildlog  implements java.io.Serializable {


     private LogmnrLogmnrBuildlogId id;
     private String buildDate;
     private BigDecimal dbTxnScnbas;
     private BigDecimal dbTxnScnwrp;
     private BigDecimal currentBuildState;
     private BigDecimal completionStatus;
     private BigDecimal markedLogFileLowScn;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrLogmnrBuildlogId getId() {
        return this.id;
    }
    
    public void setId(LogmnrLogmnrBuildlogId id) {
        this.id = id;
    }
    public String getBuildDate() {
        return this.buildDate;
    }
    
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }
    public BigDecimal getDbTxnScnbas() {
        return this.dbTxnScnbas;
    }
    
    public void setDbTxnScnbas(BigDecimal dbTxnScnbas) {
        this.dbTxnScnbas = dbTxnScnbas;
    }
    public BigDecimal getDbTxnScnwrp() {
        return this.dbTxnScnwrp;
    }
    
    public void setDbTxnScnwrp(BigDecimal dbTxnScnwrp) {
        this.dbTxnScnwrp = dbTxnScnwrp;
    }
    public BigDecimal getCurrentBuildState() {
        return this.currentBuildState;
    }
    
    public void setCurrentBuildState(BigDecimal currentBuildState) {
        this.currentBuildState = currentBuildState;
    }
    public BigDecimal getCompletionStatus() {
        return this.completionStatus;
    }
    
    public void setCompletionStatus(BigDecimal completionStatus) {
        this.completionStatus = completionStatus;
    }
    public BigDecimal getMarkedLogFileLowScn() {
        return this.markedLogFileLowScn;
    }
    
    public void setMarkedLogFileLowScn(BigDecimal markedLogFileLowScn) {
        this.markedLogFileLowScn = markedLogFileLowScn;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


