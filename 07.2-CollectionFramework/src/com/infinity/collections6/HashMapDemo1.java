package com.infinity.collections6;

import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		
		HashMap<Long, String> phoneBook = new HashMap<Long, String>();
		
		// add elements to the phoneBook
		phoneBook.put(9821225699L, "Makarand");
		phoneBook.put(9821225698L, "Rahul");
		phoneBook.put(9821225697L, "Sachin");
		phoneBook.put(9821225696L, "Sachin");
		phoneBook.put(9821225695L, "Rohit");
		
		// update the value of the key
		phoneBook.put(9821225695L, "Rohit Sharma");
		
		System.out.println(phoneBook);
		
	}
}
