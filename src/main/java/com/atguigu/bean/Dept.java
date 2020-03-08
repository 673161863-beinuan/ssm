package com.atguigu.bean;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {
    private Integer id;
    private String deptName;
    private List<Employee> empls;

    public Dept() {
    }

    public Dept(Integer id) {
        this.id = id;
    }

    public Dept(Integer id, String deptName, List<Employee> empls) {
        this.id = id;
        this.deptName = deptName;
        this.empls = empls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmpls() {
        return empls;
    }

    public void setEmpls(List<Employee> empls) {
        this.empls = empls;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", empls=" + empls +
                '}';
    }
}
