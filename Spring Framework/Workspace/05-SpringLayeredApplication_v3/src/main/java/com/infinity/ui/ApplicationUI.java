package com.infinity.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinity.model.Employee;
import com.infinity.service.EmployeeService;

public class ApplicationUI {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		
		Employee employee1 = (Employee) context.getBean("employee");
		Employee employee2 = context.getBean(Employee.class);

		employee1.setEmployeeId(1001);
		employee1.setEmployeeName("Janmesh");
		
		employee2.setEmployeeId(1002);
		employee2.setEmployeeName("Vansh");
		
		EmployeeService service = context.getBean(EmployeeService.class);
		
		service.addEmployee(employee1);
		service.addEmployee(employee2);
		
		
		Employee employee = service.getEmployee(1002);
		if(employee != null) {
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getEmployeeName());
		}else {
			System.out.println("Employee Not Found!");
		}
		
	}
}




