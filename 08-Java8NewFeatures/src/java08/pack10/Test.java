package java08.pack10;

import java.util.function.BiFunction; // R apply(T t, U u)

public class Test {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> bf1 = (Integer a, Integer b) -> {
			double avg = (a + b) / 2.0;
			return avg;
		};

		BiFunction<Integer, Integer, Double> bf2 = (a, b) -> (a + b) / 2.0;
		
		System.out.println("Average = "+bf1.apply(10, 20));
		System.out.println("Average = "+bf2.apply(20, 60));
		
		
		BiFunction<Integer, Integer, Integer> bf3 = (a, b) -> a + b;
		
		BiFunction<Integer, Integer, Integer> bf4 = (n1, n2) -> {
			if(n1 < n2) {
				return n1;
			}
			else {
				return n2;
			}
		};
		
		BiFunction<Integer, Integer, Integer> bf5 = (x1, x2) -> (x1 < x2) ? x1 : x2;
		
		System.out.println("Addition = "+bf3.apply(10, 20));
		System.out.println("Minimum = "+bf4.apply(10, 20));
		System.out.println("Minimum = "+bf5.apply(25, 18));
	}
}
