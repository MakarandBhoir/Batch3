package com.infinity.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Internal implementation of ArrayList is an array
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Makarand");
		list.add("Vansh");
		list.add("Sahil");
		list.add("Sneha");
		list.add("Mihir");
		list.add("Janmesh");
		list.add("Harshal");
		list.add("Makarand");
		list.add("Mihir");
		list.add("Janmesh");
		list.add("Harshal");
		list.add("Makarand");
		list.add(1, "Test");
		
		System.out.println(list);
		
	}
}
