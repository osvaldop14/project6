package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvGc generated by hbm2java
 */
public class MviewAdvGc  implements java.io.Serializable {


     private BigDecimal gcid_;
     private MviewAdvFjg mviewAdvFjg;
     private BigDecimal gcdeslen;
     private byte[] gcdes;
     private BigDecimal hashvalue;
     private BigDecimal frequency;

    

	
    
    
   
    public BigDecimal getGcid_() {
        return this.gcid_;
    }
    
    public void setGcid_(BigDecimal gcid_) {
        this.gcid_ = gcid_;
    }
    public MviewAdvFjg getMviewAdvFjg() {
        return this.mviewAdvFjg;
    }
    
    public void setMviewAdvFjg(MviewAdvFjg mviewAdvFjg) {
        this.mviewAdvFjg = mviewAdvFjg;
    }
    public BigDecimal getGcdeslen() {
        return this.gcdeslen;
    }
    
    public void setGcdeslen(BigDecimal gcdeslen) {
        this.gcdeslen = gcdeslen;
    }
    public byte[] getGcdes() {
        return this.gcdes;
    }
    
    public void setGcdes(byte[] gcdes) {
        this.gcdes = gcdes;
    }
    public BigDecimal getHashvalue() {
        return this.hashvalue;
    }
    
    public void setHashvalue(BigDecimal hashvalue) {
        this.hashvalue = hashvalue;
    }
    public BigDecimal getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }




}


