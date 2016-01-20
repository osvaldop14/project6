package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * RepcatResolution generated by hbm2java
 */
public class RepcatResolution  implements java.io.Serializable {


     private RepcatResolutionId id;
     private RepcatConflict repcatConflict;
     private RepcatResolutionMethod repcatResolutionMethod;
     private String functionName;
     private String priorityGroup;
     private String resolutionComment;
     private Set repcatParameterColumns = new HashSet(0);

    

	
    
    
   
    public RepcatResolutionId getId() {
        return this.id;
    }
    
    public void setId(RepcatResolutionId id) {
        this.id = id;
    }
    public RepcatConflict getRepcatConflict() {
        return this.repcatConflict;
    }
    
    public void setRepcatConflict(RepcatConflict repcatConflict) {
        this.repcatConflict = repcatConflict;
    }
    public RepcatResolutionMethod getRepcatResolutionMethod() {
        return this.repcatResolutionMethod;
    }
    
    public void setRepcatResolutionMethod(RepcatResolutionMethod repcatResolutionMethod) {
        this.repcatResolutionMethod = repcatResolutionMethod;
    }
    public String getFunctionName() {
        return this.functionName;
    }
    
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    public String getPriorityGroup() {
        return this.priorityGroup;
    }
    
    public void setPriorityGroup(String priorityGroup) {
        this.priorityGroup = priorityGroup;
    }
    public String getResolutionComment() {
        return this.resolutionComment;
    }
    
    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
    }
    public Set getRepcatParameterColumns() {
        return this.repcatParameterColumns;
    }
    
    public void setRepcatParameterColumns(Set repcatParameterColumns) {
        this.repcatParameterColumns = repcatParameterColumns;
    }




}


