package java08.pack05;

@FunctionalInterface
interface Max {
	int max(int a, int b);
}

public class Test {
	public static void main(String[] args) {
		Max ref = (n1, n2) -> (n1 > n2) ? n1 : n2;
		
		int result = ref.max(1029, 1059);
		System.out.println("Max value is = "+result);
		
		int result2 = ref.max(1929, 1159);
		System.out.println("Max value is = "+result2);
	}
}
