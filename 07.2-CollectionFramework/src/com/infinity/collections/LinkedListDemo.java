package com.infinity.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		// Internal implementation of LinkedList is a doubly linked list
		LinkedList<String> list = new LinkedList<String>();
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
