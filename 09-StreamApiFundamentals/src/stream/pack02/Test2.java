package stream.pack02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Makarand");
		list.add("Janmesh");
		list.add("Sahil");
		list.add("Harshal");
		list.add("Vansh");
		list.add("Sachin");
		list.add("Sagar");
		
		Stream<String> st = list.stream();
		Consumer<String> consumer = str -> System.out.println(str);
		
		st.forEach(consumer);
		
	}
}






