package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * RepcatSiteObjectsId generated by hbm2java
 */
public class RepcatSiteObjectsId  implements java.io.Serializable {


     private BigDecimal templateSiteId;
     private String sname;
     private String oname;
     private BigDecimal objectTypeId;

    

	
    
    
   
    public BigDecimal getTemplateSiteId() {
        return this.templateSiteId;
    }
    
    public void setTemplateSiteId(BigDecimal templateSiteId) {
        this.templateSiteId = templateSiteId;
    }
    public String getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getOname() {
        return this.oname;
    }
    
    public void setOname(String oname) {
        this.oname = oname;
    }
    public BigDecimal getObjectTypeId() {
        return this.objectTypeId;
    }
    
    public void setObjectTypeId(BigDecimal objectTypeId) {
        this.objectTypeId = objectTypeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RepcatSiteObjectsId) ) return false;
		 RepcatSiteObjectsId castOther = ( RepcatSiteObjectsId ) other; 
         
		 return ( (this.getTemplateSiteId()==castOther.getTemplateSiteId()) || ( this.getTemplateSiteId()!=null && castOther.getTemplateSiteId()!=null && this.getTemplateSiteId().equals(castOther.getTemplateSiteId()) ) )
 && ( (this.getSname()==castOther.getSname()) || ( this.getSname()!=null && castOther.getSname()!=null && this.getSname().equals(castOther.getSname()) ) )
 && ( (this.getOname()==castOther.getOname()) || ( this.getOname()!=null && castOther.getOname()!=null && this.getOname().equals(castOther.getOname()) ) )
 && ( (this.getObjectTypeId()==castOther.getObjectTypeId()) || ( this.getObjectTypeId()!=null && castOther.getObjectTypeId()!=null && this.getObjectTypeId().equals(castOther.getObjectTypeId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTemplateSiteId() == null ? 0 : this.getTemplateSiteId().hashCode() );
         result = 37 * result + ( getSname() == null ? 0 : this.getSname().hashCode() );
         result = 37 * result + ( getOname() == null ? 0 : this.getOname().hashCode() );
         result = 37 * result + ( getObjectTypeId() == null ? 0 : this.getObjectTypeId().hashCode() );
         return result;
   }   


}


