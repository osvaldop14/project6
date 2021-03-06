package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * RepcatPriority generated by hbm2java
 */
public class RepcatPriority  implements java.io.Serializable {


     private RepcatPriorityId id;
     private RepcatPriorityGroup repcatPriorityGroup;
     private byte[] rawValue;
     private String charValue;
     private BigDecimal numberValue;
     private Date dateValue;
     private String varchar2Value;
     private String ncharValue;
     private String nvarchar2Value;
     private String largeCharValue;

    

	
    
    
   
    public RepcatPriorityId getId() {
        return this.id;
    }
    
    public void setId(RepcatPriorityId id) {
        this.id = id;
    }
    public RepcatPriorityGroup getRepcatPriorityGroup() {
        return this.repcatPriorityGroup;
    }
    
    public void setRepcatPriorityGroup(RepcatPriorityGroup repcatPriorityGroup) {
        this.repcatPriorityGroup = repcatPriorityGroup;
    }
    public byte[] getRawValue() {
        return this.rawValue;
    }
    
    public void setRawValue(byte[] rawValue) {
        this.rawValue = rawValue;
    }
    public String getCharValue() {
        return this.charValue;
    }
    
    public void setCharValue(String charValue) {
        this.charValue = charValue;
    }
    public BigDecimal getNumberValue() {
        return this.numberValue;
    }
    
    public void setNumberValue(BigDecimal numberValue) {
        this.numberValue = numberValue;
    }
    public Date getDateValue() {
        return this.dateValue;
    }
    
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }
    public String getVarchar2Value() {
        return this.varchar2Value;
    }
    
    public void setVarchar2Value(String varchar2Value) {
        this.varchar2Value = varchar2Value;
    }
    public String getNcharValue() {
        return this.ncharValue;
    }
    
    public void setNcharValue(String ncharValue) {
        this.ncharValue = ncharValue;
    }
    public String getNvarchar2Value() {
        return this.nvarchar2Value;
    }
    
    public void setNvarchar2Value(String nvarchar2Value) {
        this.nvarchar2Value = nvarchar2Value;
    }
    public String getLargeCharValue() {
        return this.largeCharValue;
    }
    
    public void setLargeCharValue(String largeCharValue) {
        this.largeCharValue = largeCharValue;
    }




}


