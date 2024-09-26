package com.infinity.service;

import com.infinity.dao.EmployeeDao;
import com.infinity.model.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao = new EmployeeDao();
	
	public void addEmployee(Employee employee) {
		if (employee.getEmployeeId() == 0) {
			throw new IllegalArgumentException("Employee Id cannot be 0");
		}
		if (employee.getEmployeeSalary() < 0) {
			throw new IllegalArgumentException("Employee Salary cannot be negative");
		}
		if(!employee.getEmployeeName().matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("Employee Name cannot contain numbers");
		}
		employeeDao.createEmployee(employee);
    }
	
	public Employee getEmployee(int employeeId) {
		return employeeDao.readEmployee(employeeId);
	}
}
