package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvOutput generated by hbm2java
 */
public class MviewAdvOutput  implements java.io.Serializable {


     private MviewAdvOutputId id;
     private MviewAdvLog mviewAdvLog;
     private BigDecimal outputType;
     private String actionType;
     private String summaryOwner;
     private String summaryName;
     private String groupByColumns;
     private String whereClause;
     private String fromClause;
     private String measuresList;
     private String factTables;
     private String groupingLevels;
     private BigDecimal querylen;
     private String queryText;
     private BigDecimal storageInBytes;
     private BigDecimal pctPerformanceGain;
     private BigDecimal frequency;
     private BigDecimal cumulativeBenefit;
     private BigDecimal benefitToCostRatio;
     private BigDecimal validated;

    

	
    
    
   
    public MviewAdvOutputId getId() {
        return this.id;
    }
    
    public void setId(MviewAdvOutputId id) {
        this.id = id;
    }
    public MviewAdvLog getMviewAdvLog() {
        return this.mviewAdvLog;
    }
    
    public void setMviewAdvLog(MviewAdvLog mviewAdvLog) {
        this.mviewAdvLog = mviewAdvLog;
    }
    public BigDecimal getOutputType() {
        return this.outputType;
    }
    
    public void setOutputType(BigDecimal outputType) {
        this.outputType = outputType;
    }
    public String getActionType() {
        return this.actionType;
    }
    
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    public String getSummaryOwner() {
        return this.summaryOwner;
    }
    
    public void setSummaryOwner(String summaryOwner) {
        this.summaryOwner = summaryOwner;
    }
    public String getSummaryName() {
        return this.summaryName;
    }
    
    public void setSummaryName(String summaryName) {
        this.summaryName = summaryName;
    }
    public String getGroupByColumns() {
        return this.groupByColumns;
    }
    
    public void setGroupByColumns(String groupByColumns) {
        this.groupByColumns = groupByColumns;
    }
    public String getWhereClause() {
        return this.whereClause;
    }
    
    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }
    public String getFromClause() {
        return this.fromClause;
    }
    
    public void setFromClause(String fromClause) {
        this.fromClause = fromClause;
    }
    public String getMeasuresList() {
        return this.measuresList;
    }
    
    public void setMeasuresList(String measuresList) {
        this.measuresList = measuresList;
    }
    public String getFactTables() {
        return this.factTables;
    }
    
    public void setFactTables(String factTables) {
        this.factTables = factTables;
    }
    public String getGroupingLevels() {
        return this.groupingLevels;
    }
    
    public void setGroupingLevels(String groupingLevels) {
        this.groupingLevels = groupingLevels;
    }
    public BigDecimal getQuerylen() {
        return this.querylen;
    }
    
    public void setQuerylen(BigDecimal querylen) {
        this.querylen = querylen;
    }
    public String getQueryText() {
        return this.queryText;
    }
    
    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }
    public BigDecimal getStorageInBytes() {
        return this.storageInBytes;
    }
    
    public void setStorageInBytes(BigDecimal storageInBytes) {
        this.storageInBytes = storageInBytes;
    }
    public BigDecimal getPctPerformanceGain() {
        return this.pctPerformanceGain;
    }
    
    public void setPctPerformanceGain(BigDecimal pctPerformanceGain) {
        this.pctPerformanceGain = pctPerformanceGain;
    }
    public BigDecimal getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }
    public BigDecimal getCumulativeBenefit() {
        return this.cumulativeBenefit;
    }
    
    public void setCumulativeBenefit(BigDecimal cumulativeBenefit) {
        this.cumulativeBenefit = cumulativeBenefit;
    }
    public BigDecimal getBenefitToCostRatio() {
        return this.benefitToCostRatio;
    }
    
    public void setBenefitToCostRatio(BigDecimal benefitToCostRatio) {
        this.benefitToCostRatio = benefitToCostRatio;
    }
    public BigDecimal getValidated() {
        return this.validated;
    }
    
    public void setValidated(BigDecimal validated) {
        this.validated = validated;
    }




}


