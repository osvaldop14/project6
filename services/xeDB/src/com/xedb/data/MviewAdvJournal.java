package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * MviewAdvJournal generated by hbm2java
 */
public class MviewAdvJournal  implements java.io.Serializable {


     private MviewAdvJournalId id;
     private MviewAdvLog mviewAdvLog;
     private Date timestamp;
     private BigDecimal flags;
     private BigDecimal num;
     private String text;
     private BigDecimal textlen;

    

	
    
    
   
    public MviewAdvJournalId getId() {
        return this.id;
    }
    
    public void setId(MviewAdvJournalId id) {
        this.id = id;
    }
    public MviewAdvLog getMviewAdvLog() {
        return this.mviewAdvLog;
    }
    
    public void setMviewAdvLog(MviewAdvLog mviewAdvLog) {
        this.mviewAdvLog = mviewAdvLog;
    }
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getNum() {
        return this.num;
    }
    
    public void setNum(BigDecimal num) {
        this.num = num;
    }
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public BigDecimal getTextlen() {
        return this.textlen;
    }
    
    public void setTextlen(BigDecimal textlen) {
        this.textlen = textlen;
    }




}


