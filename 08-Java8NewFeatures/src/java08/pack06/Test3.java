package java08.pack06;

import java.util.function.Predicate;

public class Test3 {
	public static void main(String[] args) {
		Predicate<Integer> ref1 = (Integer num) -> {
			if(num > 0) {
				return true;
			}
			else {
				return false;
			}
		};
		
		Predicate<Integer> ref2 = (Integer num) -> {
			return num > 0;
		};
		
		Predicate<Integer> ref3 = num -> num > 0;
		
		System.out.println(ref1.test(10));
		System.out.println(ref2.test(-10));
		System.out.println(ref3.test(1));
	}
}
