package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrOpqtypeId generated by hbm2java
 */
public class LogmnrOpqtypeId  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal obj_;
     private BigDecimal intcol_;

    

	
    
    
   
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
    public BigDecimal getIntcol_() {
        return this.intcol_;
    }
    
    public void setIntcol_(BigDecimal intcol_) {
        this.intcol_ = intcol_;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrOpqtypeId) ) return false;
		 LogmnrOpqtypeId castOther = ( LogmnrOpqtypeId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getObj_()==castOther.getObj_()) || ( this.getObj_()!=null && castOther.getObj_()!=null && this.getObj_().equals(castOther.getObj_()) ) )
 && ( (this.getIntcol_()==castOther.getIntcol_()) || ( this.getIntcol_()!=null && castOther.getIntcol_()!=null && this.getIntcol_().equals(castOther.getIntcol_()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getObj_() == null ? 0 : this.getObj_().hashCode() );
         result = 37 * result + ( getIntcol_() == null ? 0 : this.getIntcol_().hashCode() );
         return result;
   }   


}


