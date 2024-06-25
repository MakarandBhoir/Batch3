package com.infinity.collections2;

import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<Number> ts = new TreeSet<Number>();
		
		ts.add(1000);
		ts.add(504);
		
		ts.add(907.60); // 907.60 > 504  or new Float(907.60) > new Integer(504)
		ts.add(95.35);
		
		ts.add(404);
		ts.add(504); // Duplicate element
		
		System.out.println(ts);
	}
}
