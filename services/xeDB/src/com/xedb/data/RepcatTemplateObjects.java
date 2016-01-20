package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.sql.Clob;
import java.util.HashSet;
import java.util.Set;

/**
 * RepcatTemplateObjects generated by hbm2java
 */
public class RepcatTemplateObjects  implements java.io.Serializable {


     private BigDecimal templateObjectId;
     private RepcatObjectTypes repcatObjectTypes;
     private RepcatRefreshTemplates repcatRefreshTemplates;
     private String objectName;
     private BigDecimal objectVersion_;
     private Clob ddlText;
     private String masterRollbackSeg;
     private String derivedFromSname;
     private String derivedFromOname;
     private BigDecimal flavorId;
     private String schemaName;
     private BigDecimal ddlNum;
     private BigDecimal templateRefgroupId;
     private byte[] flags;
     private String spare1;
     private Set repcatObjectParmses = new HashSet(0);

    

	
    
    
   
    public BigDecimal getTemplateObjectId() {
        return this.templateObjectId;
    }
    
    public void setTemplateObjectId(BigDecimal templateObjectId) {
        this.templateObjectId = templateObjectId;
    }
    public RepcatObjectTypes getRepcatObjectTypes() {
        return this.repcatObjectTypes;
    }
    
    public void setRepcatObjectTypes(RepcatObjectTypes repcatObjectTypes) {
        this.repcatObjectTypes = repcatObjectTypes;
    }
    public RepcatRefreshTemplates getRepcatRefreshTemplates() {
        return this.repcatRefreshTemplates;
    }
    
    public void setRepcatRefreshTemplates(RepcatRefreshTemplates repcatRefreshTemplates) {
        this.repcatRefreshTemplates = repcatRefreshTemplates;
    }
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public BigDecimal getObjectVersion_() {
        return this.objectVersion_;
    }
    
    public void setObjectVersion_(BigDecimal objectVersion_) {
        this.objectVersion_ = objectVersion_;
    }
    public Clob getDdlText() {
        return this.ddlText;
    }
    
    public void setDdlText(Clob ddlText) {
        this.ddlText = ddlText;
    }
    public String getMasterRollbackSeg() {
        return this.masterRollbackSeg;
    }
    
    public void setMasterRollbackSeg(String masterRollbackSeg) {
        this.masterRollbackSeg = masterRollbackSeg;
    }
    public String getDerivedFromSname() {
        return this.derivedFromSname;
    }
    
    public void setDerivedFromSname(String derivedFromSname) {
        this.derivedFromSname = derivedFromSname;
    }
    public String getDerivedFromOname() {
        return this.derivedFromOname;
    }
    
    public void setDerivedFromOname(String derivedFromOname) {
        this.derivedFromOname = derivedFromOname;
    }
    public BigDecimal getFlavorId() {
        return this.flavorId;
    }
    
    public void setFlavorId(BigDecimal flavorId) {
        this.flavorId = flavorId;
    }
    public String getSchemaName() {
        return this.schemaName;
    }
    
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
    public BigDecimal getDdlNum() {
        return this.ddlNum;
    }
    
    public void setDdlNum(BigDecimal ddlNum) {
        this.ddlNum = ddlNum;
    }
    public BigDecimal getTemplateRefgroupId() {
        return this.templateRefgroupId;
    }
    
    public void setTemplateRefgroupId(BigDecimal templateRefgroupId) {
        this.templateRefgroupId = templateRefgroupId;
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
    public Set getRepcatObjectParmses() {
        return this.repcatObjectParmses;
    }
    
    public void setRepcatObjectParmses(Set repcatObjectParmses) {
        this.repcatObjectParmses = repcatObjectParmses;
    }




}


