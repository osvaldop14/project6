package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvJournalId generated by hbm2java
 */
public class MviewAdvJournalId  implements java.io.Serializable {


     private BigDecimal runid_;
     private BigDecimal seq_;

    

    
   
    public BigDecimal getRunid_() {
        return this.runid_;
    }
    
    public void setRunid_(BigDecimal runid_) {
        this.runid_ = runid_;
    }
    public BigDecimal getSeq_() {
        return this.seq_;
    }
    
    public void setSeq_(BigDecimal seq_) {
        this.seq_ = seq_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MviewAdvJournalId) ) return false;
		 MviewAdvJournalId castOther = ( MviewAdvJournalId ) other; 
         
		 return ( (this.getRunid_()==castOther.getRunid_()) || ( this.getRunid_()!=null && castOther.getRunid_()!=null && this.getRunid_().equals(castOther.getRunid_()) ) )
 && ( (this.getSeq_()==castOther.getSeq_()) || ( this.getSeq_()!=null && castOther.getSeq_()!=null && this.getSeq_().equals(castOther.getSeq_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRunid_() == null ? 0 : this.getRunid_().hashCode() );
         result = 37 * result + ( getSeq_() == null ? 0 : this.getSeq_().hashCode() );
         return result;
   }   


}


