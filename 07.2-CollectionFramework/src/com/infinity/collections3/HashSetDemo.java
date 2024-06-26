package com.infinity.collections3;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ravi", 50000);
		Employee e2 = new Employee(102, "Tanvi", 55000);
		Employee e3 = new Employee(103, "Manasvi", 45000);
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		//System.out.println(e1);
		//System.out.println(e1.toString());
		System.out.println(hs);
	}
}
