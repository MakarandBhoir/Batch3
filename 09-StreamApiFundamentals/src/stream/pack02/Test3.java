package stream.pack02;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Makarand");
		list.add("Janmesh");
		list.add("Sahil");
		list.add("Harshal");
		list.add("Vansh");
		list.add("Sachin");
		list.add("Sagar");
		
		list.stream().forEach((String element)-> System.out.println(element));
		
		list.stream().forEach( element -> System.out.println(element));
		
		list.stream().forEach( element -> {
			System.out.println(element);
		});
	}
}






