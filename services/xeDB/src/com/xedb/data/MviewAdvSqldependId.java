package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Arrays;

/**
 * MviewAdvSqldependId generated by hbm2java
 */
public class MviewAdvSqldependId  implements java.io.Serializable {


     private BigDecimal collectionid_;
     private BigDecimal instId;
     private byte[] fromAddress;
     private BigDecimal fromHash;
     private String toOwner;
     private String toName;
     private BigDecimal toType;
     private BigDecimal cardinality;

    

    
   
    public BigDecimal getCollectionid_() {
        return this.collectionid_;
    }
    
    public void setCollectionid_(BigDecimal collectionid_) {
        this.collectionid_ = collectionid_;
    }
    public BigDecimal getInstId() {
        return this.instId;
    }
    
    public void setInstId(BigDecimal instId) {
        this.instId = instId;
    }
    public byte[] getFromAddress() {
        return this.fromAddress;
    }
    
    public void setFromAddress(byte[] fromAddress) {
        this.fromAddress = fromAddress;
    }
    public BigDecimal getFromHash() {
        return this.fromHash;
    }
    
    public void setFromHash(BigDecimal fromHash) {
        this.fromHash = fromHash;
    }
    public String getToOwner() {
        return this.toOwner;
    }
    
    public void setToOwner(String toOwner) {
        this.toOwner = toOwner;
    }
    public String getToName() {
        return this.toName;
    }
    
    public void setToName(String toName) {
        this.toName = toName;
    }
    public BigDecimal getToType() {
        return this.toType;
    }
    
    public void setToType(BigDecimal toType) {
        this.toType = toType;
    }
    public BigDecimal getCardinality() {
        return this.cardinality;
    }
    
    public void setCardinality(BigDecimal cardinality) {
        this.cardinality = cardinality;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MviewAdvSqldependId) ) return false;
		 MviewAdvSqldependId castOther = ( MviewAdvSqldependId ) other; 
         
		 return ( (this.getCollectionid_()==castOther.getCollectionid_()) || ( this.getCollectionid_()!=null && castOther.getCollectionid_()!=null && this.getCollectionid_().equals(castOther.getCollectionid_()) ) )
 && ( (this.getInstId()==castOther.getInstId()) || ( this.getInstId()!=null && castOther.getInstId()!=null && this.getInstId().equals(castOther.getInstId()) ) )
 && ( (this.getFromAddress()==castOther.getFromAddress()) || ( this.getFromAddress()!=null && castOther.getFromAddress()!=null && Arrays.equals(this.getFromAddress(), castOther.getFromAddress()) ) )
 && ( (this.getFromHash()==castOther.getFromHash()) || ( this.getFromHash()!=null && castOther.getFromHash()!=null && this.getFromHash().equals(castOther.getFromHash()) ) )
 && ( (this.getToOwner()==castOther.getToOwner()) || ( this.getToOwner()!=null && castOther.getToOwner()!=null && this.getToOwner().equals(castOther.getToOwner()) ) )
 && ( (this.getToName()==castOther.getToName()) || ( this.getToName()!=null && castOther.getToName()!=null && this.getToName().equals(castOther.getToName()) ) )
 && ( (this.getToType()==castOther.getToType()) || ( this.getToType()!=null && castOther.getToType()!=null && this.getToType().equals(castOther.getToType()) ) )
 && ( (this.getCardinality()==castOther.getCardinality()) || ( this.getCardinality()!=null && castOther.getCardinality()!=null && this.getCardinality().equals(castOther.getCardinality()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCollectionid_() == null ? 0 : this.getCollectionid_().hashCode() );
         result = 37 * result + ( getInstId() == null ? 0 : this.getInstId().hashCode() );
         int fromAddressHashcode = 0;
         byte[] fromAddressProperty = this.getFromAddress();
         if(fromAddressProperty != null) {
             fromAddressHashcode = 1;
             for (int i=0; i<fromAddressProperty.length; i++) {
                 fromAddressHashcode = 37 * fromAddressHashcode + fromAddressProperty[i];
             }
         }

         result = 37 * result + fromAddressHashcode;

         result = 37 * result + ( getFromHash() == null ? 0 : this.getFromHash().hashCode() );
         result = 37 * result + ( getToOwner() == null ? 0 : this.getToOwner().hashCode() );
         result = 37 * result + ( getToName() == null ? 0 : this.getToName().hashCode() );
         result = 37 * result + ( getToType() == null ? 0 : this.getToType().hashCode() );
         result = 37 * result + ( getCardinality() == null ? 0 : this.getCardinality().hashCode() );
         return result;
   }   


}

