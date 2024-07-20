package stream.pack01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Makarand");
		list.add("Janmesh");
		list.add("Sahil");
		list.add("Harshal");
		list.add("Vansh");
		list.add("Sachin");
		list.add("Sagar");
		
		System.out.println("1. Print all elements of list");
		System.out.println(list);
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("2. Print all elements of list using for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("3. Print all elements of list using for each loop");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("4. Print all elements of list using iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.startsWith("S")) {
				System.out.println(str);
			}
		}
		System.out.println("-------------------------------------------------");
	}
}






