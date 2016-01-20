package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrUserId generated by hbm2java
 */
public class LogmnrUserId  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal user_;

    

    
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public BigDecimal getUser_() {
        return this.user_;
    }
    
    public void setUser_(BigDecimal user_) {
        this.user_ = user_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrUserId) ) return false;
		 LogmnrUserId castOther = ( LogmnrUserId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getUser_()==castOther.getUser_()) || ( this.getUser_()!=null && castOther.getUser_()!=null && this.getUser_().equals(castOther.getUser_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getUser_() == null ? 0 : this.getUser_().hashCode() );
         return result;
   }   


}

