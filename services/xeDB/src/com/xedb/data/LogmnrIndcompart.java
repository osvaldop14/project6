package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrIndcompart generated by hbm2java
 */
public class LogmnrIndcompart  implements java.io.Serializable {


     private LogmnrIndcompartId id;
     private BigDecimal dataobj_;
     private BigDecimal bo_;
     private BigDecimal part_;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrIndcompartId getId() {
        return this.id;
    }
    
    public void setId(LogmnrIndcompartId id) {
        this.id = id;
    }
    public BigDecimal getDataobj_() {
        return this.dataobj_;
    }
    
    public void setDataobj_(BigDecimal dataobj_) {
        this.dataobj_ = dataobj_;
    }
    public BigDecimal getBo_() {
        return this.bo_;
    }
    
    public void setBo_(BigDecimal bo_) {
        this.bo_ = bo_;
    }
    public BigDecimal getPart_() {
        return this.part_;
    }
    
    public void setPart_(BigDecimal part_) {
        this.part_ = part_;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


