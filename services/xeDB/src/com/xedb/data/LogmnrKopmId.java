package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogmnrKopmId generated by hbm2java
 */
public class LogmnrKopmId  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private String name;

    

	
    
    
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrKopmId) ) return false;
		 LogmnrKopmId castOther = ( LogmnrKopmId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         return result;
   }   


}


