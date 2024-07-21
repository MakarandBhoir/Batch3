package stream.pack05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate; // boolean test(T t);
import java.util.stream.Stream;

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
		
		list.stream().filter( element -> element.startsWith("S") ).forEach( element -> System.out.println(element) );
		
		System.out.println("====================================");
		
		list.stream().filter( element -> element.length() > 6).forEach( element -> System.out.println(element) );
	
	}
}





