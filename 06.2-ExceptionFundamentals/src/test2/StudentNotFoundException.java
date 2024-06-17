package test2;

public class StudentNotFoundException extends RuntimeException {
	StudentNotFoundException(String message){
		super(message);
	}
}
