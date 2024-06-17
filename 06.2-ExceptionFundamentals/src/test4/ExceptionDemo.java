package test4;

public class ExceptionDemo {
	static void checkData(String data) {
		if(data.equals("Infinity")) {
			System.out.println("Data is Infinity");
		}
		else {
			throw new IllegalArgumentException("Data is not Infinity");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkData("Infinity");
			throw new NullPointerException("Null Pointer Exception");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			//System.exit(0);
		} 
		finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println("End of program");
	}
}
