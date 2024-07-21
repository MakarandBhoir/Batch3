package stream.pack04;

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
		
		Stream<String> stm = list.stream(); // "Makaran", "Janmesh", "Sahil", "Harshal", "Vansh", "Sachin", "Sagar"
		
		Predicate<String> predicate = (String str) -> {
			if(str.startsWith("S")) {
				return true;
			}else {
				return false;
			}
		};
		
		stm = stm.filter(predicate); // "Sahil", "Sachin", "Sagar"
		
		Consumer<String> consumer = (String str) -> {
			System.out.println(str);
		};
		
		stm.forEach(consumer);
	}
}





