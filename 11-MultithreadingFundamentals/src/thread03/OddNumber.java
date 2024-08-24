package thread03;

public class OddNumber implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println("Odd number: " + i+", "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
