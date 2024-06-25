package com.infinity.collections2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1000); // Auto-boxing - converting primitive type to object type
		lhs.add(2010);
		lhs.add(902);
		lhs.add(102);
		
		lhs.add(1000); // Duplicate element
		
		System.out.println("Size of the set: " + lhs.size());
		System.out.println("Set: " + lhs);
		//System.out.println(lhs.get(2)); // No get() method in Set interface));
	}
}
