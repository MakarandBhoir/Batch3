package com.infinity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-configuration.xml");
        HelloService service = (HelloService) factory.getBean("hello");
        String message = service.sayHello("Spring Framework");
        System.out.println(message);
    }
}
