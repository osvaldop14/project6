package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvEligibleId generated by hbm2java
 */
public class MviewAdvEligibleId  implements java.io.Serializable {


     private BigDecimal sumobjn_;
     private BigDecimal runid_;

    

    
   
    public BigDecimal getSumobjn_() {
        return this.sumobjn_;
    }
    
    public void setSumobjn_(BigDecimal sumobjn_) {
        this.sumobjn_ = sumobjn_;
    }
    public BigDecimal getRunid_() {
        return this.runid_;
    }
    
    public void setRunid_(BigDecimal runid_) {
        this.runid_ = runid_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MviewAdvEligibleId) ) return false;
		 MviewAdvEligibleId castOther = ( MviewAdvEligibleId ) other; 
         
		 return ( (this.getSumobjn_()==castOther.getSumobjn_()) || ( this.getSumobjn_()!=null && castOther.getSumobjn_()!=null && this.getSumobjn_().equals(castOther.getSumobjn_()) ) )
 && ( (this.getRunid_()==castOther.getRunid_()) || ( this.getRunid_()!=null && castOther.getRunid_()!=null && this.getRunid_().equals(castOther.getRunid_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSumobjn_() == null ? 0 : this.getSumobjn_().hashCode() );
         result = 37 * result + ( getRunid_() == null ? 0 : this.getRunid_().hashCode() );
         return result;
   }   


}


