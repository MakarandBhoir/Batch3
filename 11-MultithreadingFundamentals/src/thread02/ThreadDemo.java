package thread02;


public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new OddNumber()); //NEW  // worker thread will display odd numbers
		Thread t2 = new Thread(new EvenNumber()); //NEW  // worker thread will display even numbers
		t1.start(); //RUNNABLE
		t2.start(); //RUNNABLE
		
		System.out.println("Main thread terrminated.");
	}
}
