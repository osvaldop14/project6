package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrLogId generated by hbm2java
 */
public class LogmnrLogId  implements java.io.Serializable {


     private BigDecimal session_;
     private BigDecimal thread_;
     private BigDecimal sequence_;
     private BigDecimal firstChange_;
     private BigDecimal dbId;
     private BigDecimal resetlogsChange_;
     private BigDecimal resetTimestamp;

    

    
   
    public BigDecimal getSession_() {
        return this.session_;
    }
    
    public void setSession_(BigDecimal session_) {
        this.session_ = session_;
    }
    public BigDecimal getThread_() {
        return this.thread_;
    }
    
    public void setThread_(BigDecimal thread_) {
        this.thread_ = thread_;
    }
    public BigDecimal getSequence_() {
        return this.sequence_;
    }
    
    public void setSequence_(BigDecimal sequence_) {
        this.sequence_ = sequence_;
    }
    public BigDecimal getFirstChange_() {
        return this.firstChange_;
    }
    
    public void setFirstChange_(BigDecimal firstChange_) {
        this.firstChange_ = firstChange_;
    }
    public BigDecimal getDbId() {
        return this.dbId;
    }
    
    public void setDbId(BigDecimal dbId) {
        this.dbId = dbId;
    }
    public BigDecimal getResetlogsChange_() {
        return this.resetlogsChange_;
    }
    
    public void setResetlogsChange_(BigDecimal resetlogsChange_) {
        this.resetlogsChange_ = resetlogsChange_;
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
		 if ( !(other instanceof LogmnrLogId) ) return false;
		 LogmnrLogId castOther = ( LogmnrLogId ) other; 
         
		 return ( (this.getSession_()==castOther.getSession_()) || ( this.getSession_()!=null && castOther.getSession_()!=null && this.getSession_().equals(castOther.getSession_()) ) )
 && ( (this.getThread_()==castOther.getThread_()) || ( this.getThread_()!=null && castOther.getThread_()!=null && this.getThread_().equals(castOther.getThread_()) ) )
 && ( (this.getSequence_()==castOther.getSequence_()) || ( this.getSequence_()!=null && castOther.getSequence_()!=null && this.getSequence_().equals(castOther.getSequence_()) ) )
 && ( (this.getFirstChange_()==castOther.getFirstChange_()) || ( this.getFirstChange_()!=null && castOther.getFirstChange_()!=null && this.getFirstChange_().equals(castOther.getFirstChange_()) ) )
 && ( (this.getDbId()==castOther.getDbId()) || ( this.getDbId()!=null && castOther.getDbId()!=null && this.getDbId().equals(castOther.getDbId()) ) )
 && ( (this.getResetlogsChange_()==castOther.getResetlogsChange_()) || ( this.getResetlogsChange_()!=null && castOther.getResetlogsChange_()!=null && this.getResetlogsChange_().equals(castOther.getResetlogsChange_()) ) )
 && ( (this.getResetTimestamp()==castOther.getResetTimestamp()) || ( this.getResetTimestamp()!=null && castOther.getResetTimestamp()!=null && this.getResetTimestamp().equals(castOther.getResetTimestamp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSession_() == null ? 0 : this.getSession_().hashCode() );
         result = 37 * result + ( getThread_() == null ? 0 : this.getThread_().hashCode() );
         result = 37 * result + ( getSequence_() == null ? 0 : this.getSequence_().hashCode() );
         result = 37 * result + ( getFirstChange_() == null ? 0 : this.getFirstChange_().hashCode() );
         result = 37 * result + ( getDbId() == null ? 0 : this.getDbId().hashCode() );
         result = 37 * result + ( getResetlogsChange_() == null ? 0 : this.getResetlogsChange_().hashCode() );
         result = 37 * result + ( getResetTimestamp() == null ? 0 : this.getResetTimestamp().hashCode() );
         return result;
   }   


}


