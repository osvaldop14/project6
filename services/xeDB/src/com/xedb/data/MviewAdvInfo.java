package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvInfo generated by hbm2java
 */
public class MviewAdvInfo  implements java.io.Serializable {


     private MviewAdvInfoId id;
     private MviewAdvLog mviewAdvLog;
     private BigDecimal type;
     private BigDecimal infolen;
     private byte[] info;
     private BigDecimal status;
     private BigDecimal flag;

    

	
    
    
   
    public MviewAdvInfoId getId() {
        return this.id;
    }
    
    public void setId(MviewAdvInfoId id) {
        this.id = id;
    }
    public MviewAdvLog getMviewAdvLog() {
        return this.mviewAdvLog;
    }
    
    public void setMviewAdvLog(MviewAdvLog mviewAdvLog) {
        this.mviewAdvLog = mviewAdvLog;
    }
    public BigDecimal getType() {
        return this.type;
    }
    
    public void setType(BigDecimal type) {
        this.type = type;
    }
    public BigDecimal getInfolen() {
        return this.infolen;
    }
    
    public void setInfolen(BigDecimal infolen) {
        this.infolen = infolen;
    }
    public byte[] getInfo() {
        return this.info;
    }
    
    public void setInfo(byte[] info) {
        this.info = info;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public BigDecimal getFlag() {
        return this.flag;
    }
    
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }




}

