package com.hrdb.data;
// Generated 20/01/2016 10:20:06 AM by Hibernate Tools 3.2.4.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department  implements java.io.Serializable {


     private Integer deptid;
     private String name;
     private Integer budget;
     private Integer q1;
     private Integer q2;
     private Integer q3;
     private Integer q4;
     private String deptcode;
     private String location;
     private Integer tenantid;
     private Set employees = new HashSet(0);

    

    
   
    public Integer getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getBudget() {
        return this.budget;
    }
    
    public void setBudget(Integer budget) {
        this.budget = budget;
    }
    public Integer getQ1() {
        return this.q1;
    }
    
    public void setQ1(Integer q1) {
        this.q1 = q1;
    }
    public Integer getQ2() {
        return this.q2;
    }
    
    public void setQ2(Integer q2) {
        this.q2 = q2;
    }
    public Integer getQ3() {
        return this.q3;
    }
    
    public void setQ3(Integer q3) {
        this.q3 = q3;
    }
    public Integer getQ4() {
        return this.q4;
    }
    
    public void setQ4(Integer q4) {
        this.q4 = q4;
    }
    public String getDeptcode() {
        return this.deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }
    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }




}

