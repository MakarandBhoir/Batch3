package com.infinity.ui;

import java.util.Scanner;

import com.infinity.model.Employee;
import com.infinity.service.EmployeeService;

public class ApplicationUI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int employeeId = scanner.nextInt();

		System.out.println("Enter Employee Name:");
		String employeeName = scanner.next();

		System.out.println("Enter Employee Salary:");
		double employeeSalary = scanner.nextDouble();

		Employee employee1 = new Employee(employeeId, employeeName, employeeSalary);
		Employee employee2 = new Employee(1002, "Vansh", 75000);

		EmployeeService employeeService = new EmployeeService();
		employeeService.addEmployee(employee1);
		employeeService.addEmployee(employee2);

		System.out.println("Enter employee id to search:");
		int searchId = scanner.nextInt();

		Employee employee = employeeService.getEmployee(searchId);
		if (employee != null) {
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getEmployeeSalary());
		}else {
			System.out.println("Employee not found");
		}
	}
}
