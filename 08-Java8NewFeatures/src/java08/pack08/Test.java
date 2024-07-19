package java08.pack08;

import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		
		Function<Integer, Integer> ref1 = (Integer num) -> {
			int result = num * num * num;
			return result;
		};
		
		Function<Integer, Double> ref2 = (Integer num) -> {
			double result = Math.sqrt(num);
			return result;
		};
		
		Function<Integer, Integer> ref3 = x -> x * x;
		
		
		System.out.println("Qube of number = "+ref1.apply(10));
		System.out.println("Square root of number = "+ref2.apply(16));
		System.out.println("Square of number = "+ref3.apply(5));
		
	}
}
