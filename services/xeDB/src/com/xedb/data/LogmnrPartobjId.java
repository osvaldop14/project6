package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrPartobjId generated by hbm2java
 */
public class LogmnrPartobjId  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal obj_;

    

	
    
    
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public BigDecimal getObj_() {
        return this.obj_;
    }
    
    public void setObj_(BigDecimal obj_) {
        this.obj_ = obj_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrPartobjId) ) return false;
		 LogmnrPartobjId castOther = ( LogmnrPartobjId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getObj_()==castOther.getObj_()) || ( this.getObj_()!=null && castOther.getObj_()!=null && this.getObj_().equals(castOther.getObj_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getObj_() == null ? 0 : this.getObj_().hashCode() );
         return result;
   }   


}

