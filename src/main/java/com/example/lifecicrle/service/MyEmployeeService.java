package com.example.lifecicrle.service;

import com.example.lifecicrle.bean.Employee;

public class MyEmployeeService {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public MyEmployeeService() {
        System.out.println("MyEmployeeService no-args constructor called");
    }

    //pre-destroy method
    public void destroy() throws Exception{
        System.out.println("EmployeeService Closing resource");
    }


    //post-init method
    public void init() throws Exception{
        System.out.println("MyEmployeeService initilizing to dummy value");
        if(this.employee.getName() == null){
            this.employee.setName("yyy");
        }
    }
    
    
}
