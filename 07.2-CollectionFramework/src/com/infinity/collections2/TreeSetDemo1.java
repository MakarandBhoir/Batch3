package com.infinity.collections2;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1000);
		ts.add(new Integer(2000));
		ts.add(504);
		ts.add(907);
		ts.add(95);
		ts.add(404);
		//ts.add(907.60);
		
		
		ts.add(504); // Duplicate element
		
		System.out.println(ts);
	}
}
