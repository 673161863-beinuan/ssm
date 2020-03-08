package com.atguigu.dao;

import com.atguigu.bean.Dept;

public interface DeptDao {

    //根据id查询部门表
    public Dept getDeptById(Integer id);
}