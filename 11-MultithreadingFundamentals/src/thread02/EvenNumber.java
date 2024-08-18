package thread02;

public class EvenNumber implements Runnable {
	@Override
	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even number: " + i+", "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
