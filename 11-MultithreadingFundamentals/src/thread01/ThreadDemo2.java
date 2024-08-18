package thread01;

class Task implements Runnable { // Printing Task
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Name = "+t.getName());
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		// main thread will be created by JVM
		Thread t = Thread.currentThread(); // main thread
		System.out.println("Thread Name = "+t.getName());
		
		Thread t1 = new Thread(new Task()); // worker thread will perform Printing Task
		t1.start(); // start the worker thread and call run() method
		
		System.out.println("End of main");
	}
}
