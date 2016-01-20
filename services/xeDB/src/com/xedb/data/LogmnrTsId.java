package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrTsId generated by hbm2java
 */
public class LogmnrTsId  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal ts_;

    

    
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public BigDecimal getTs_() {
        return this.ts_;
    }
    
    public void setTs_(BigDecimal ts_) {
        this.ts_ = ts_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrTsId) ) return false;
		 LogmnrTsId castOther = ( LogmnrTsId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getTs_()==castOther.getTs_()) || ( this.getTs_()!=null && castOther.getTs_()!=null && this.getTs_().equals(castOther.getTs_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getTs_() == null ? 0 : this.getTs_().hashCode() );
         return result;
   }   


}

