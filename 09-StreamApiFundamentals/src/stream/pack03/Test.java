package stream.pack03;

import java.util.ArrayList;
import java.util.List;
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
		
		//list.stream().forEach( element -> System.out.println(element) );
		
		Stream<String> stm = list.stream();
		
		// stream will be closed after forEach
		stm.forEach(element -> System.out.println(element));
		
		// you will get the exception
		//stm.forEach(element -> System.out.println(element));
		//long count = stm.count();
	}
}
