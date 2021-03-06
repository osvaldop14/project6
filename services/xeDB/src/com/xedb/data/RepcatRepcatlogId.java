package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * RepcatRepcatlogId generated by hbm2java
 */
public class RepcatRepcatlogId  implements java.io.Serializable {


     private BigDecimal id;
     private String source;
     private String role;
     private String master;

    

    
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public String getMaster() {
        return this.master;
    }
    
    public void setMaster(String master) {
        this.master = master;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RepcatRepcatlogId) ) return false;
		 RepcatRepcatlogId castOther = ( RepcatRepcatlogId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getSource()==castOther.getSource()) || ( this.getSource()!=null && castOther.getSource()!=null && this.getSource().equals(castOther.getSource()) ) )
 && ( (this.getRole()==castOther.getRole()) || ( this.getRole()!=null && castOther.getRole()!=null && this.getRole().equals(castOther.getRole()) ) )
 && ( (this.getMaster()==castOther.getMaster()) || ( this.getMaster()!=null && castOther.getMaster()!=null && this.getMaster().equals(castOther.getMaster()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getSource() == null ? 0 : this.getSource().hashCode() );
         result = 37 * result + ( getRole() == null ? 0 : this.getRole().hashCode() );
         result = 37 * result + ( getMaster() == null ? 0 : this.getMaster().hashCode() );
         return result;
   }   


}


