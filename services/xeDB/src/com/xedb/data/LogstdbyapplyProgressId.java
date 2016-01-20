package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * LogstdbyapplyProgressId generated by hbm2java
 */
public class LogstdbyapplyProgressId  implements java.io.Serializable {


     private BigDecimal xidusn;
     private BigDecimal xidslt;
     private BigDecimal xidsqn;
     private BigDecimal commitScn;
     private Date commitTime;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;

    

    
   
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
    public BigDecimal getCommitScn() {
        return this.commitScn;
    }
    
    public void setCommitScn(BigDecimal commitScn) {
        this.commitScn = commitScn;
    }
    public Date getCommitTime() {
        return this.commitTime;
    }
    
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
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
		 if ( !(other instanceof LogstdbyapplyProgressId) ) return false;
		 LogstdbyapplyProgressId castOther = ( LogstdbyapplyProgressId ) other; 
         
		 return ( (this.getXidusn()==castOther.getXidusn()) || ( this.getXidusn()!=null && castOther.getXidusn()!=null && this.getXidusn().equals(castOther.getXidusn()) ) )
 && ( (this.getXidslt()==castOther.getXidslt()) || ( this.getXidslt()!=null && castOther.getXidslt()!=null && this.getXidslt().equals(castOther.getXidslt()) ) )
 && ( (this.getXidsqn()==castOther.getXidsqn()) || ( this.getXidsqn()!=null && castOther.getXidsqn()!=null && this.getXidsqn().equals(castOther.getXidsqn()) ) )
 && ( (this.getCommitScn()==castOther.getCommitScn()) || ( this.getCommitScn()!=null && castOther.getCommitScn()!=null && this.getCommitScn().equals(castOther.getCommitScn()) ) )
 && ( (this.getCommitTime()==castOther.getCommitTime()) || ( this.getCommitTime()!=null && castOther.getCommitTime()!=null && this.getCommitTime().equals(castOther.getCommitTime()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getXidusn() == null ? 0 : this.getXidusn().hashCode() );
         result = 37 * result + ( getXidslt() == null ? 0 : this.getXidslt().hashCode() );
         result = 37 * result + ( getXidsqn() == null ? 0 : this.getXidsqn().hashCode() );
         result = 37 * result + ( getCommitScn() == null ? 0 : this.getCommitScn().hashCode() );
         result = 37 * result + ( getCommitTime() == null ? 0 : this.getCommitTime().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         return result;
   }   


}

