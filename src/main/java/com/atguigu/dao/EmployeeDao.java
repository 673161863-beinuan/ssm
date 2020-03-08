package com.atguigu.dao;

import com.atguigu.bean.Employee;

import java.util.List;

public interface EmployeeDao {

    //根据id查出对应的员工
    public Employee getEmployeeById(Integer id);

    public List<Employee> getEmpls();

}
