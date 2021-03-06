package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrSessionEvolveId generated by hbm2java
 */
public class LogmnrSessionEvolveId  implements java.io.Serializable {


     private BigDecimal session_;
     private BigDecimal dbId;
     private BigDecimal resetScn;
     private BigDecimal resetTimestamp;

    

    
   
    public BigDecimal getSession_() {
        return this.session_;
    }
    
    public void setSession_(BigDecimal session_) {
        this.session_ = session_;
    }
    public BigDecimal getDbId() {
        return this.dbId;
    }
    
    public void setDbId(BigDecimal dbId) {
        this.dbId = dbId;
    }
    public BigDecimal getResetScn() {
        return this.resetScn;
    }
    
    public void setResetScn(BigDecimal resetScn) {
        this.resetScn = resetScn;
    }
    public BigDecimal getResetTimestamp() {
        return this.resetTimestamp;
    }
    
    public void setResetTimestamp(BigDecimal resetTimestamp) {
        this.resetTimestamp = resetTimestamp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrSessionEvolveId) ) return false;
		 LogmnrSessionEvolveId castOther = ( LogmnrSessionEvolveId ) other; 
         
		 return ( (this.getSession_()==castOther.getSession_()) || ( this.getSession_()!=null && castOther.getSession_()!=null && this.getSession_().equals(castOther.getSession_()) ) )
 && ( (this.getDbId()==castOther.getDbId()) || ( this.getDbId()!=null && castOther.getDbId()!=null && this.getDbId().equals(castOther.getDbId()) ) )
 && ( (this.getResetScn()==castOther.getResetScn()) || ( this.getResetScn()!=null && castOther.getResetScn()!=null && this.getResetScn().equals(castOther.getResetScn()) ) )
 && ( (this.getResetTimestamp()==castOther.getResetTimestamp()) || ( this.getResetTimestamp()!=null && castOther.getResetTimestamp()!=null && this.getResetTimestamp().equals(castOther.getResetTimestamp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSession_() == null ? 0 : this.getSession_().hashCode() );
         result = 37 * result + ( getDbId() == null ? 0 : this.getDbId().hashCode() );
         result = 37 * result + ( getResetScn() == null ? 0 : this.getResetScn().hashCode() );
         result = 37 * result + ( getResetTimestamp() == null ? 0 : this.getResetTimestamp().hashCode() );
         return result;
   }   


}


