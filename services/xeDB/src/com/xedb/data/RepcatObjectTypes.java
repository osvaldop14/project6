package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * RepcatObjectTypes generated by hbm2java
 */
public class RepcatObjectTypes  implements java.io.Serializable {


     private BigDecimal objectTypeId;
     private String objectTypeName;
     private byte[] flags;
     private String spare1;
     private Set repcatSiteObjectses = new HashSet(0);
     private Set repcatTemplateObjectses = new HashSet(0);

    

	
    
    
   
    public BigDecimal getObjectTypeId() {
        return this.objectTypeId;
    }
    
    public void setObjectTypeId(BigDecimal objectTypeId) {
        this.objectTypeId = objectTypeId;
    }
    public String getObjectTypeName() {
        return this.objectTypeName;
    }
    
    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }
    public byte[] getFlags() {
        return this.flags;
    }
    
    public void setFlags(byte[] flags) {
        this.flags = flags;
    }
    public String getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }
    public Set getRepcatSiteObjectses() {
        return this.repcatSiteObjectses;
    }
    
    public void setRepcatSiteObjectses(Set repcatSiteObjectses) {
        this.repcatSiteObjectses = repcatSiteObjectses;
    }
    public Set getRepcatTemplateObjectses() {
        return this.repcatTemplateObjectses;
    }
    
    public void setRepcatTemplateObjectses(Set repcatTemplateObjectses) {
        this.repcatTemplateObjectses = repcatTemplateObjectses;
    }




}

