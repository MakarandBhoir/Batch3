package stream.pack06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		int arr[] = {60, 75, 40, 90, 30, 28, 65, 50, 80, 85};
		
		
		IntStream stm = Arrays.stream(arr);
				
		stm.filter(element -> element > 60).forEach(element -> System.out.println(element));
	}

}


// max number from the array
// min number from the array
// sum of the array
// average of the array
// count of the array