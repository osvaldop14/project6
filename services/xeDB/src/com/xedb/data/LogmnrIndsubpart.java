package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrIndsubpart generated by hbm2java
 */
public class LogmnrIndsubpart  implements java.io.Serializable {


     private LogmnrIndsubpartId id;
     private BigDecimal dataobj_;
     private BigDecimal subpart_;
     private BigDecimal ts_;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrIndsubpartId getId() {
        return this.id;
    }
    
    public void setId(LogmnrIndsubpartId id) {
        this.id = id;
    }
    public BigDecimal getDataobj_() {
        return this.dataobj_;
    }
    
    public void setDataobj_(BigDecimal dataobj_) {
        this.dataobj_ = dataobj_;
    }
    public BigDecimal getSubpart_() {
        return this.subpart_;
    }
    
    public void setSubpart_(BigDecimal subpart_) {
        this.subpart_ = subpart_;
    }
    public BigDecimal getTs_() {
        return this.ts_;
    }
    
    public void setTs_(BigDecimal ts_) {
        this.ts_ = ts_;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


