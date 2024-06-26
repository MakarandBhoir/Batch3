package com.infinity.collections3;

import java.util.HashSet;

public class HashSetDemo3 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ravi", 50000);
		Employee e2 = new Employee(102, "Tanvi", 55000);
		Employee e3 = new Employee(103, "Manasvi", 45000);
		Employee e4 = new Employee(102, "Tanvi", 55000);
		
		// uniqueness of object will be determined by hashCode() and equals() method
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		System.out.println("e2 = " + e2.hashCode());
		System.out.println("e4 = " + e4.hashCode());
		
        for(Employee e : hs) {
        	if(e.getEmpSal() >= 50000) {
        		System.out.println(e);
        	}
        }
	}
}
