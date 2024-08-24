package thread05;

public class MultithreadedMain implements Runnable
{
	Account account;
	static Customer customer;
	
	public MultithreadedMain() {
		account = new Account(1000);
        customer = new Customer("John", "Doe");
        customer.setAccount(account);
	}
	public static void main(String[] args) {
        MultithreadedMain mt = new MultithreadedMain();
        customer.getAccount().deposite(4000);
        
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        Thread t4 = new Thread(mt);
        Thread t5 = new Thread(mt);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
	}

	@Override
	public void run() {
		customer.getAccount().withdraw(2000);
	}
}
