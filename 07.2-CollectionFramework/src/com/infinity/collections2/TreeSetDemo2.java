package com.infinity.collections2;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// ASKII value of A-Z is 65-90
		// ASKII value of a-z is 97-122
		// ASKII value of 0-9 is 48-57
		
		// TreeSet decide the sorting based on Comparable interface
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("ABC"); // 1
		ts.add("PQR"); // 3
		ts.add("XYZ"); // 4
		ts.add("AAA"); // 0
		ts.add("BBB"); // 2
		ts.add("ccc"); // 5
		
		ts.add("BBB"); // Duplicate element
		
		System.out.println(ts);
	}
}
