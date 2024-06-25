package com.infinity.collections2;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1000); // Auto-boxing - converting primitive type to object type
		set.add(2010);
		set.add(902);
		set.add(102);
		
		set.add(1000); // Duplicate element
		
		System.out.println("Size of the set: " + set.size());
		System.out.println("Set: " + set);
	}
}
