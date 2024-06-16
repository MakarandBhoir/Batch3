package test1;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			System.out.println("First argument is = "+args[0]);
			System.out.println("Second argument is = "+args[1]);
			System.out.println("Hello World");
			System.out.println("Hello World");
		}
		catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass 2 arguments");
		}
		System.out.println("End of program");
	}
}
