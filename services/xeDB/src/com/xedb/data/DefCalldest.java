package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA



/**
 * DefCalldest generated by hbm2java
 */
public class DefCalldest  implements java.io.Serializable {


     private DefCalldestId id;
     private DefDestination defDestination;
     private String schemaName;
     private String packageName;

    

	
    
    
   
    public DefCalldestId getId() {
        return this.id;
    }
    
    public void setId(DefCalldestId id) {
        this.id = id;
    }
    public DefDestination getDefDestination() {
        return this.defDestination;
    }
    
    public void setDefDestination(DefDestination defDestination) {
        this.defDestination = defDestination;
    }
    public String getSchemaName() {
        return this.schemaName;
    }
    
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
    public String getPackageName() {
        return this.packageName;
    }
    
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }




}


