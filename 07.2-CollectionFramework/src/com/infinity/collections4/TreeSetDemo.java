package com.infinity.collections4;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ravi", 50000);
		Employee e2 = new Employee(102, "Tanvi", 55000);
		Employee e3 = new Employee(103, "Manasvi", 45000);
		Employee e4 = new Employee(103, "Manasvi", 45000);
		
		//When we add object of Employee into TreeSet then Employee should implement Comparable interface
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e3);
		ts.add(e1);
		ts.add(e2);
		ts.add(e4);
		
		for (Employee e : ts) {
			System.out.println(e);
		}
	}
}
