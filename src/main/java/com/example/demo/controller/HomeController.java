package com.example.demo.controller;

import com.example.demo.bo.EmployeeBO;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }

    @GetMapping("/json")
    public EmployeeBO json(){
        return employeeService.getEmployee(30L);
    }

    @GetMapping("/list")
    public List<EmployeeBO> list(){
        return employeeService.listEmployee();
    }
}
