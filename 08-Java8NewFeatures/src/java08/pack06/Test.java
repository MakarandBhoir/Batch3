package java08.pack06;

public class Test {
	public static void main(String[] args) {
		
		Print ref = (String s)->  {
			System.out.println("Hello");
			System.out.println(s);
		};
		
		ref.print("Java8");
		
	}
}
