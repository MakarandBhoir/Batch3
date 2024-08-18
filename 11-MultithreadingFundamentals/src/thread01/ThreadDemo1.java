package thread01;

public class ThreadDemo1 {
	public void run() {
		System.out.println("Thread Name = "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// main thread will be created by JVM
		ThreadDemo1 td = new ThreadDemo1();
		td.run();
	}
}
