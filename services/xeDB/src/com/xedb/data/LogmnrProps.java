package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrProps generated by hbm2java
 */
public class LogmnrProps  implements java.io.Serializable {


     private LogmnrPropsId id;
     private String value;
     private String comment;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrPropsId getId() {
        return this.id;
    }
    
    public void setId(LogmnrPropsId id) {
        this.id = id;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}

