package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.sql.Blob;

/**
 * LogmnrAgeSpill generated by hbm2java
 */
public class LogmnrAgeSpill  implements java.io.Serializable {


     private LogmnrAgeSpillId id;
     private BigDecimal offset;
     private Blob spillData;
     private BigDecimal spare1;
     private BigDecimal spare2;

    

	
    
    
   
    public LogmnrAgeSpillId getId() {
        return this.id;
    }
    
    public void setId(LogmnrAgeSpillId id) {
        this.id = id;
    }
    public BigDecimal getOffset() {
        return this.offset;
    }
    
    public void setOffset(BigDecimal offset) {
        this.offset = offset;
    }
    public Blob getSpillData() {
        return this.spillData;
    }
    
    public void setSpillData(Blob spillData) {
        this.spillData = spillData;
    }
    public BigDecimal getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(BigDecimal spare1) {
        this.spare1 = spare1;
    }
    public BigDecimal getSpare2() {
        return this.spare2;
    }
    
    public void setSpare2(BigDecimal spare2) {
        this.spare2 = spare2;
    }




}


