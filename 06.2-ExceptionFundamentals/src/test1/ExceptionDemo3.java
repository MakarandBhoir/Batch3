package test1;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		String str = null;
		System.out.println("Start of program");
		try {
			System.out.println("First argument is = "+args[0]);
			System.out.println("Second argument is = "+args[1]);
			System.out.println("Length of string is = "+str.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass 2 arguments");
		}
		catch (NullPointerException e) {
			System.out.println("String is null");
		}
		System.out.println("End of program");
	}
}
