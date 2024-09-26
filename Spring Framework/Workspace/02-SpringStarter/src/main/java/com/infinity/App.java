package com.infinity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	HelloService service = (HelloService) context.getBean("hello");
    	System.out.println(service.sayHello());
    	
//    	HelloService service = (HelloService) context.getBean("hello");
//    	System.out.println(service.sayHello());
//    	
//    	HelloService service2 = (HelloService) context.getBean("hello");
//    	
//    	System.out.println(service.hashCode());
//    	System.out.println(service2.hashCode());
    }
}
