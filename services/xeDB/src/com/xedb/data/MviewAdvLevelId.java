package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvLevelId generated by hbm2java
 */
public class MviewAdvLevelId  implements java.io.Serializable {


     private BigDecimal runid_;
     private BigDecimal levelid_;

    

    
   
    public BigDecimal getRunid_() {
        return this.runid_;
    }
    
    public void setRunid_(BigDecimal runid_) {
        this.runid_ = runid_;
    }
    public BigDecimal getLevelid_() {
        return this.levelid_;
    }
    
    public void setLevelid_(BigDecimal levelid_) {
        this.levelid_ = levelid_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MviewAdvLevelId) ) return false;
		 MviewAdvLevelId castOther = ( MviewAdvLevelId ) other; 
         
		 return ( (this.getRunid_()==castOther.getRunid_()) || ( this.getRunid_()!=null && castOther.getRunid_()!=null && this.getRunid_().equals(castOther.getRunid_()) ) )
 && ( (this.getLevelid_()==castOther.getLevelid_()) || ( this.getLevelid_()!=null && castOther.getLevelid_()!=null && this.getLevelid_().equals(castOther.getLevelid_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRunid_() == null ? 0 : this.getRunid_().hashCode() );
         result = 37 * result + ( getLevelid_() == null ? 0 : this.getLevelid_().hashCode() );
         return result;
   }   


}

