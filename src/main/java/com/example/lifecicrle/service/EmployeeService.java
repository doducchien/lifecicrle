package com.example.lifecicrle.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.example.lifecicrle.bean.Employee;

public class EmployeeService implements InitializingBean, DisposableBean{
    private Employee employee;
    private String test;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    
    

    public EmployeeService() {
        System.out.println("EmployeeService no-args constructor called");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub

        System.out.println("EmployeeService Closing resource");
        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("EmployeeService initializing to dummy value");
        if(this.employee.getName() == null){
            this.employee.setName("xxx");
        }
        if(this.test == null){
            this.test = "xnxx";
        }
        
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }


    
}
