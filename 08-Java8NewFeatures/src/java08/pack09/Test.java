package java08.pack09;

import java.util.function.Supplier; // T get();

public class Test {
	public static void main(String[] args) {
		Supplier<String> ref1 = () -> {
			System.out.println("Hello....");
			return "Hello";
		};
		
		Supplier<String> ref2 = () -> "Hello".toUpperCase();
		
		Supplier<Integer> ref3 = () -> 1000;
		
		
		System.out.println(ref1.get());
		System.out.println(ref2.get());
		System.out.println(ref3.get());
	}
}
