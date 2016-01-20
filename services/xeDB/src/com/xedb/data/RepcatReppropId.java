package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * RepcatReppropId generated by hbm2java
 */
public class RepcatReppropId  implements java.io.Serializable {


     private String sname;
     private String oname;
     private BigDecimal type;
     private String dblink;

    

    
   
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
    public BigDecimal getType() {
        return this.type;
    }
    
    public void setType(BigDecimal type) {
        this.type = type;
    }
    public String getDblink() {
        return this.dblink;
    }
    
    public void setDblink(String dblink) {
        this.dblink = dblink;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RepcatReppropId) ) return false;
		 RepcatReppropId castOther = ( RepcatReppropId ) other; 
         
		 return ( (this.getSname()==castOther.getSname()) || ( this.getSname()!=null && castOther.getSname()!=null && this.getSname().equals(castOther.getSname()) ) )
 && ( (this.getOname()==castOther.getOname()) || ( this.getOname()!=null && castOther.getOname()!=null && this.getOname().equals(castOther.getOname()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getDblink()==castOther.getDblink()) || ( this.getDblink()!=null && castOther.getDblink()!=null && this.getDblink().equals(castOther.getDblink()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSname() == null ? 0 : this.getSname().hashCode() );
         result = 37 * result + ( getOname() == null ? 0 : this.getOname().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getDblink() == null ? 0 : this.getDblink().hashCode() );
         return result;
   }   


}


