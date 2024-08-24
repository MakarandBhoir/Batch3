package thread04;


public class ThreadDemo {
	static Thread mainThread;
	public static void main(String[] args) {
		mainThread = Thread.currentThread();
		
		Thread t1 = new Thread(new OddNumber()); //NEW  // worker thread will display odd numbers
		
		// Default priority of thread is 5 - NORM_PRIORITY
		
		t1.setPriority(1); // MIN_PRIORITY
		t1.start(); //RUNNABLE
		
		try {
			t1.join(); // Main thread will wait for t1 to complete
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even number: " + i + ", " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Main thread terrminated.");
	}
}
