package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrSessionActionsId generated by hbm2java
 */
public class LogmnrSessionActionsId  implements java.io.Serializable {


     private BigDecimal logmnrsession_;
     private String actionname;

    

    
   
    public BigDecimal getLogmnrsession_() {
        return this.logmnrsession_;
    }
    
    public void setLogmnrsession_(BigDecimal logmnrsession_) {
        this.logmnrsession_ = logmnrsession_;
    }
    public String getActionname() {
        return this.actionname;
    }
    
    public void setActionname(String actionname) {
        this.actionname = actionname;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrSessionActionsId) ) return false;
		 LogmnrSessionActionsId castOther = ( LogmnrSessionActionsId ) other; 
         
		 return ( (this.getLogmnrsession_()==castOther.getLogmnrsession_()) || ( this.getLogmnrsession_()!=null && castOther.getLogmnrsession_()!=null && this.getLogmnrsession_().equals(castOther.getLogmnrsession_()) ) )
 && ( (this.getActionname()==castOther.getActionname()) || ( this.getActionname()!=null && castOther.getActionname()!=null && this.getActionname().equals(castOther.getActionname()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrsession_() == null ? 0 : this.getLogmnrsession_().hashCode() );
         result = 37 * result + ( getActionname() == null ? 0 : this.getActionname().hashCode() );
         return result;
   }   


}


