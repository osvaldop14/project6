package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrColtype generated by hbm2java
 */
public class LogmnrColtype  implements java.io.Serializable {


     private LogmnrColtypeId id;
     private BigDecimal col_;
     private byte[] toid;
     private BigDecimal version_;
     private BigDecimal packed;
     private BigDecimal intcols;
     private byte[] intcol_s;
     private BigDecimal flags;
     private BigDecimal typidcol_;
     private BigDecimal synobj_;
     private BigDecimal logmnrFlags;

    

	
    
    
   
    public LogmnrColtypeId getId() {
        return this.id;
    }
    
    public void setId(LogmnrColtypeId id) {
        this.id = id;
    }
    public BigDecimal getCol_() {
        return this.col_;
    }
    
    public void setCol_(BigDecimal col_) {
        this.col_ = col_;
    }
    public byte[] getToid() {
        return this.toid;
    }
    
    public void setToid(byte[] toid) {
        this.toid = toid;
    }
    public BigDecimal getVersion_() {
        return this.version_;
    }
    
    public void setVersion_(BigDecimal version_) {
        this.version_ = version_;
    }
    public BigDecimal getPacked() {
        return this.packed;
    }
    
    public void setPacked(BigDecimal packed) {
        this.packed = packed;
    }
    public BigDecimal getIntcols() {
        return this.intcols;
    }
    
    public void setIntcols(BigDecimal intcols) {
        this.intcols = intcols;
    }
    public byte[] getIntcol_s() {
        return this.intcol_s;
    }
    
    public void setIntcol_s(byte[] intcol_s) {
        this.intcol_s = intcol_s;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getTypidcol_() {
        return this.typidcol_;
    }
    
    public void setTypidcol_(BigDecimal typidcol_) {
        this.typidcol_ = typidcol_;
    }
    public BigDecimal getSynobj_() {
        return this.synobj_;
    }
    
    public void setSynobj_(BigDecimal synobj_) {
        this.synobj_ = synobj_;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}

