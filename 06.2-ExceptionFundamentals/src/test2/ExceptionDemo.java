package test2;

public class ExceptionDemo {	
	public static void checkStudent(int studentId)
	{
		if(studentId == 1) {
			System.out.println("Student found");
		}
		else
		{
			throw new StudentNotFoundException("Student not found = "+studentId);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkStudent(1);
			throw new NullPointerException();
		}
		catch(StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
		
		System.out.println("End of program");
	}
}
