package com.xedb.data;
// Generated 20/01/2016 09:51:24 AM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;

/**
 * MviewAdvRollup generated by hbm2java
 */
public class MviewAdvRollup  implements java.io.Serializable {


     private MviewAdvRollupId id;
     private MviewAdvLog mviewAdvLog;
     private MviewAdvLevel mviewAdvLevelByMview$AdvRollupCfk;
     private MviewAdvLevel mviewAdvLevelByMview$AdvRollupPfk;
     private BigDecimal flags;

    

    
   
    public MviewAdvRollupId getId() {
        return this.id;
    }
    
    public void setId(MviewAdvRollupId id) {
        this.id = id;
    }
    public MviewAdvLog getMviewAdvLog() {
        return this.mviewAdvLog;
    }
    
    public void setMviewAdvLog(MviewAdvLog mviewAdvLog) {
        this.mviewAdvLog = mviewAdvLog;
    }
    public MviewAdvLevel getMviewAdvLevelByMview$AdvRollupCfk() {
        return this.mviewAdvLevelByMview$AdvRollupCfk;
    }
    
    public void setMviewAdvLevelByMview$AdvRollupCfk(MviewAdvLevel mviewAdvLevelByMview$AdvRollupCfk) {
        this.mviewAdvLevelByMview$AdvRollupCfk = mviewAdvLevelByMview$AdvRollupCfk;
    }
    public MviewAdvLevel getMviewAdvLevelByMview$AdvRollupPfk() {
        return this.mviewAdvLevelByMview$AdvRollupPfk;
    }
    
    public void setMviewAdvLevelByMview$AdvRollupPfk(MviewAdvLevel mviewAdvLevelByMview$AdvRollupPfk) {
        this.mviewAdvLevelByMview$AdvRollupPfk = mviewAdvLevelByMview$AdvRollupPfk;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }




}


