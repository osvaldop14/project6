package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * RepcatResolutionMethodId generated by hbm2java
 */
public class RepcatResolutionMethodId  implements java.io.Serializable {


     private BigDecimal conflictTypeId;
     private String methodName;

    

    
   
    public BigDecimal getConflictTypeId() {
        return this.conflictTypeId;
    }
    
    public void setConflictTypeId(BigDecimal conflictTypeId) {
        this.conflictTypeId = conflictTypeId;
    }
    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RepcatResolutionMethodId) ) return false;
		 RepcatResolutionMethodId castOther = ( RepcatResolutionMethodId ) other; 
         
		 return ( (this.getConflictTypeId()==castOther.getConflictTypeId()) || ( this.getConflictTypeId()!=null && castOther.getConflictTypeId()!=null && this.getConflictTypeId().equals(castOther.getConflictTypeId()) ) )
 && ( (this.getMethodName()==castOther.getMethodName()) || ( this.getMethodName()!=null && castOther.getMethodName()!=null && this.getMethodName().equals(castOther.getMethodName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getConflictTypeId() == null ? 0 : this.getConflictTypeId().hashCode() );
         result = 37 * result + ( getMethodName() == null ? 0 : this.getMethodName().hashCode() );
         return result;
   }   


}


