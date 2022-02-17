package com.atguigu.springboot.controller;

import com.atguigu.springboot.dao.EmployeeDao;
import com.atguigu.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmpController {

    @Autowired
    EmployeeDao employeeDao;

    //员工列表
    @GetMapping(value = "/list")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "employee/list";
    }
}
