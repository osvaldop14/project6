package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrGtXidIncludeId generated by hbm2java
 */
public class LogmnrGtXidIncludeId  implements java.io.Serializable {


     private BigDecimal xidusn;
     private BigDecimal xidslt;
     private BigDecimal xidsqn;

    

    
   
    public BigDecimal getXidusn() {
        return this.xidusn;
    }
    
    public void setXidusn(BigDecimal xidusn) {
        this.xidusn = xidusn;
    }
    public BigDecimal getXidslt() {
        return this.xidslt;
    }
    
    public void setXidslt(BigDecimal xidslt) {
        this.xidslt = xidslt;
    }
    public BigDecimal getXidsqn() {
        return this.xidsqn;
    }
    
    public void setXidsqn(BigDecimal xidsqn) {
        this.xidsqn = xidsqn;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrGtXidIncludeId) ) return false;
		 LogmnrGtXidIncludeId castOther = ( LogmnrGtXidIncludeId ) other; 
         
		 return ( (this.getXidusn()==castOther.getXidusn()) || ( this.getXidusn()!=null && castOther.getXidusn()!=null && this.getXidusn().equals(castOther.getXidusn()) ) )
 && ( (this.getXidslt()==castOther.getXidslt()) || ( this.getXidslt()!=null && castOther.getXidslt()!=null && this.getXidslt().equals(castOther.getXidslt()) ) )
 && ( (this.getXidsqn()==castOther.getXidsqn()) || ( this.getXidsqn()!=null && castOther.getXidsqn()!=null && this.getXidsqn().equals(castOther.getXidsqn()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getXidusn() == null ? 0 : this.getXidusn().hashCode() );
         result = 37 * result + ( getXidslt() == null ? 0 : this.getXidslt().hashCode() );
         result = 37 * result + ( getXidsqn() == null ? 0 : this.getXidsqn().hashCode() );
         return result;
   }   


}


