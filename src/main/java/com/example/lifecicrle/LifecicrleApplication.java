package com.example.lifecicrle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.lifecicrle.service.EmployeeService;

@SpringBootApplication
public class LifecicrleApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring context initialized");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println("Bean retrieved from Spring context");
		System.out.println("Employee name is: " + employeeService.getEmployee().getName());
		System.out.println(employeeService.getTest());
		ctx.close();
		System.out.println("Spring context closed");
		// SpringApplication.run(LifecicrleApplication.class, args);
	}

}
