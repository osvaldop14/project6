package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * AqQueueTables generated by hbm2java
 */
public class AqQueueTables  implements java.io.Serializable {


     private BigDecimal objno;
     private String schema;
     private String name;
     private BigDecimal udataType;
     private BigDecimal flags;
     private BigDecimal sortCols;
     private String timezone;
     private String tableComment;

    

	
    
    
   
    public BigDecimal getObjno() {
        return this.objno;
    }
    
    public void setObjno(BigDecimal objno) {
        this.objno = objno;
    }
    public String getSchema() {
        return this.schema;
    }
    
    public void setSchema(String schema) {
        this.schema = schema;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getUdataType() {
        return this.udataType;
    }
    
    public void setUdataType(BigDecimal udataType) {
        this.udataType = udataType;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getSortCols() {
        return this.sortCols;
    }
    
    public void setSortCols(BigDecimal sortCols) {
        this.sortCols = sortCols;
    }
    public String getTimezone() {
        return this.timezone;
    }
    
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    public String getTableComment() {
        return this.tableComment;
    }
    
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }




}


