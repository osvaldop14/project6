package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.sql.Blob;
import java.sql.Clob;

/**
 * DefLob generated by hbm2java
 */
public class DefLob  implements java.io.Serializable {


     private byte[] id;
     private String enqTid;
     private Blob blobCol;
     private Clob clobCol;
     private Clob nclobCol;

    

	
    
    
   
    public byte[] getId() {
        return this.id;
    }
    
    public void setId(byte[] id) {
        this.id = id;
    }
    public String getEnqTid() {
        return this.enqTid;
    }
    
    public void setEnqTid(String enqTid) {
        this.enqTid = enqTid;
    }
    public Blob getBlobCol() {
        return this.blobCol;
    }
    
    public void setBlobCol(Blob blobCol) {
        this.blobCol = blobCol;
    }
    public Clob getClobCol() {
        return this.clobCol;
    }
    
    public void setClobCol(Clob clobCol) {
        this.clobCol = clobCol;
    }
    public Clob getNclobCol() {
        return this.nclobCol;
    }
    
    public void setNclobCol(Clob nclobCol) {
        this.nclobCol = nclobCol;
    }




}


