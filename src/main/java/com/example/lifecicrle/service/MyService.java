package com.example.lifecicrle.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {

    @PostConstruct
    public void init(){
        System.out.println("Myservice init method called");
    }
    public MyService() {
        System.out.println("Myservice no-args constructor called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Myservice destroy method called");
    }
    
}
