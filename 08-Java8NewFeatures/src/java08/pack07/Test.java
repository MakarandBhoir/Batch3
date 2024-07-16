package java08.pack07;

import java.util.function.Consumer; // void accept(T t);
import java.util.function.Predicate; // boolean test(T t);
import java.util.function.Supplier; // T get();
import java.util.function.Function; // R apply(T t);

public class Test {
	public static void main(String[] args) {
		//Consumer<String> ref1 = (String str) -> System.out.println(str.toUpperCase());
		Consumer<String> ref1 = str -> System.out.println(str.toUpperCase());
		
		//Consumer<Integer> ref2 = (Integer num) -> System.out.println(num * num);
		Consumer<Integer> ref2 = (num) -> System.out.println(num * num);
		
		ref1.accept("java8");
		
		ref2.accept(10);
	}
}
