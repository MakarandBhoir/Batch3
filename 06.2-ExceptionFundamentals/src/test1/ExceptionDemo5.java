package test1;

import java.io.IOException;

public class ExceptionDemo5 {
	static void meth1()  {
		throw new NullPointerException("Value is null"); // unchecked exception
	}
	
	static void meth2() throws IOException { // help to propagate the exception to the caller
		throw new IOException("File not found"); // checked exception
	}
	
	public static void main(String[] args) throws IOException{
		try {
			meth1();
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			meth2();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
