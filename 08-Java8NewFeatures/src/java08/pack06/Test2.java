package java08.pack06;

public class Test2 {

	public static void main(String[] args) {
		Print ref = message -> System.out.println(message.toUpperCase());
		
		ref.print("Java8");

	}

}
