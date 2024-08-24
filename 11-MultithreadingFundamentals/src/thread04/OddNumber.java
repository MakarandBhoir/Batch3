package thread04;

public class OddNumber implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Main Thread State = "+ThreadDemo.mainThread.getState());
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("Odd number: " + i+", "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Main Thread State = "+ThreadDemo.mainThread.getState());
	}
}
