package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RepcatTemplateSites generated by hbm2java
 */
public class RepcatTemplateSites  implements java.io.Serializable {


     private BigDecimal templateSiteId;
     private String refreshTemplateName;
     private String refreshGroupName;
     private String templateOwner;
     private String userName;
     private String siteName;
     private BigDecimal repapiSiteId;
     private BigDecimal status;
     private BigDecimal refreshTemplateId;
     private BigDecimal userId;
     private Date instantiationDate;
     private Set repcatSiteObjectses = new HashSet(0);

    

	
    
    
   
    public BigDecimal getTemplateSiteId() {
        return this.templateSiteId;
    }
    
    public void setTemplateSiteId(BigDecimal templateSiteId) {
        this.templateSiteId = templateSiteId;
    }
    public String getRefreshTemplateName() {
        return this.refreshTemplateName;
    }
    
    public void setRefreshTemplateName(String refreshTemplateName) {
        this.refreshTemplateName = refreshTemplateName;
    }
    public String getRefreshGroupName() {
        return this.refreshGroupName;
    }
    
    public void setRefreshGroupName(String refreshGroupName) {
        this.refreshGroupName = refreshGroupName;
    }
    public String getTemplateOwner() {
        return this.templateOwner;
    }
    
    public void setTemplateOwner(String templateOwner) {
        this.templateOwner = templateOwner;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getSiteName() {
        return this.siteName;
    }
    
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    public BigDecimal getRepapiSiteId() {
        return this.repapiSiteId;
    }
    
    public void setRepapiSiteId(BigDecimal repapiSiteId) {
        this.repapiSiteId = repapiSiteId;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public BigDecimal getRefreshTemplateId() {
        return this.refreshTemplateId;
    }
    
    public void setRefreshTemplateId(BigDecimal refreshTemplateId) {
        this.refreshTemplateId = refreshTemplateId;
    }
    public BigDecimal getUserId() {
        return this.userId;
    }
    
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }
    public Date getInstantiationDate() {
        return this.instantiationDate;
    }
    
    public void setInstantiationDate(Date instantiationDate) {
        this.instantiationDate = instantiationDate;
    }
    public Set getRepcatSiteObjectses() {
        return this.repcatSiteObjectses;
    }
    
    public void setRepcatSiteObjectses(Set repcatSiteObjectses) {
        this.repcatSiteObjectses = repcatSiteObjectses;
    }




}


