package com.infinity.collections5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sneha", 55000);
		Employee e2 = new Employee(102, "Janmesh", 65000);
		Employee e3 = new Employee(103, "Makarand", 40000);
		Employee e4 = new Employee(104, "Harshal", 45000);
		Employee e5 = new Employee(105, "Vansh", 50000);
		Employee e6 = new Employee(106, "Mihir", 60000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		System.out.println("Before Sorting");
		for(Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("=============================================");
		
		Collections.sort(empList, new EmployeeSalarySorter());
		
		System.out.println("After Sorting by Salary");
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("=============================================");
		
		Collections.sort(empList, new EmployeeNameSorter());
		System.out.println("After Sorting by Employee Name");
		for(Employee e : empList) {
			System.out.println(e);
		}
	}

}
