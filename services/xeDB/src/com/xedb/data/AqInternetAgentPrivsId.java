package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA



/**
 * AqInternetAgentPrivsId generated by hbm2java
 */
public class AqInternetAgentPrivsId  implements java.io.Serializable {


     private String agentName;
     private String dbUsername;

    

    
   
    public String getAgentName() {
        return this.agentName;
    }
    
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }
    
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AqInternetAgentPrivsId) ) return false;
		 AqInternetAgentPrivsId castOther = ( AqInternetAgentPrivsId ) other; 
         
		 return ( (this.getAgentName()==castOther.getAgentName()) || ( this.getAgentName()!=null && castOther.getAgentName()!=null && this.getAgentName().equals(castOther.getAgentName()) ) )
 && ( (this.getDbUsername()==castOther.getDbUsername()) || ( this.getDbUsername()!=null && castOther.getDbUsername()!=null && this.getDbUsername().equals(castOther.getDbUsername()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAgentName() == null ? 0 : this.getAgentName().hashCode() );
         result = 37 * result + ( getDbUsername() == null ? 0 : this.getDbUsername().hashCode() );
         return result;
   }   


}


