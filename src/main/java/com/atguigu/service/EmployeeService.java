package com.atguigu.service;

import com.atguigu.bean.Employee;
import com.atguigu.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getEmpls(){
        List<Employee> empls = employeeDao.getEmpls();
        for (Employee employee : empls) {
        	System.out.println(employee);
		}
        return  empls;
    }
}
