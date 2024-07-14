package java08.pack04;

interface Max{
	int max(int a, int b); // method declaration
}

public class Test {
	public static void main(String[] args) {
		// method body or definition using lambda expression
		Max ref = (int n1, int n2) -> {
			if(n1 > n2)
				return n1;
			else
				return n2;
		};
		
		int result = ref.max(1029, 1059);
		System.out.println("Max value is = "+result);
		
		int result2 = ref.max(1929, 1159);
		System.out.println("Max value is = "+result2);
	}
}
