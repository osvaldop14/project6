package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * LogstdbyskipSupportId generated by hbm2java
 */
public class LogstdbyskipSupportId  implements java.io.Serializable {


     private BigDecimal action;
     private String name;
     private BigDecimal reg;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;

    

	
    
    
   
    public BigDecimal getAction() {
        return this.action;
    }
    
    public void setAction(BigDecimal action) {
        this.action = action;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getReg() {
        return this.reg;
    }
    
    public void setReg(BigDecimal reg) {
        this.reg = reg;
    }
    public BigDecimal getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(BigDecimal spare1) {
        this.spare1 = spare1;
    }
    public BigDecimal getSpare2() {
        return this.spare2;
    }
    
    public void setSpare2(BigDecimal spare2) {
        this.spare2 = spare2;
    }
    public String getSpare3() {
        return this.spare3;
    }
    
    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogstdbyskipSupportId) ) return false;
		 LogstdbyskipSupportId castOther = ( LogstdbyskipSupportId ) other; 
         
		 return ( (this.getAction()==castOther.getAction()) || ( this.getAction()!=null && castOther.getAction()!=null && this.getAction().equals(castOther.getAction()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getReg()==castOther.getReg()) || ( this.getReg()!=null && castOther.getReg()!=null && this.getReg().equals(castOther.getReg()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAction() == null ? 0 : this.getAction().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getReg() == null ? 0 : this.getReg().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         return result;
   }   


}

