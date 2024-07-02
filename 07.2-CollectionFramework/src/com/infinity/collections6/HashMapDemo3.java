package com.infinity.collections6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {
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
		
		Set<Entry<Long, String>> entries =  phoneBook.entrySet();
		
		for(Entry<Long, String> e : entries) {
			if(e.getValue().equals("Makarand")) {
				System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			}
		}
		
	}
}
