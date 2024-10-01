package com.infinity.dao;

import java.util.ArrayList;
import java.util.List;

import com.infinity.model.Employee;

public class EmployeeDao {
	private List<Employee> database = new ArrayList<Employee>();
	
	// CRUD
	public void createEmployee(Employee employee) {
        database.add(employee);
    }
	
	public Employee readEmployee(int employeeId) {
		Employee result = null;
		for(Employee emp : database) {
			if (emp.getEmployeeId() == employeeId) {
				result = emp;
				break;
			}
		}
		return result;
	}
}
