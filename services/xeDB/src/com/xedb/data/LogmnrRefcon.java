package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrRefcon generated by hbm2java
 */
public class LogmnrRefcon  implements java.io.Serializable {


     private LogmnrRefconId id;
     private BigDecimal col_;
     private BigDecimal reftyp;
     private byte[] stabid;
     private byte[] expctoid;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrRefconId getId() {
        return this.id;
    }
    
    public void setId(LogmnrRefconId id) {
        this.id = id;
    }
    public BigDecimal getCol_() {
        return this.col_;
    }
    
    public void setCol_(BigDecimal col_) {
        this.col_ = col_;
    }
    public BigDecimal getReftyp() {
        return this.reftyp;
    }
    
    public void setReftyp(BigDecimal reftyp) {
        this.reftyp = reftyp;
    }
    public byte[] getStabid() {
        return this.stabid;
    }
    
    public void setStabid(byte[] stabid) {
        this.stabid = stabid;
    }
    public byte[] getExpctoid() {
        return this.expctoid;
    }
    
    public void setExpctoid(byte[] expctoid) {
        this.expctoid = expctoid;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


