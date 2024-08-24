package thread05;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(1000);
        Customer customer = new Customer("John", "Doe");
        customer.setAccount(account);
        
        customer.getAccount().deposite(4000);
        
        customer.getAccount().withdraw(2000); // 5000 - 2000 = 3000
        customer.getAccount().withdraw(2000); // 3000 - 2000 = 1000
        customer.getAccount().withdraw(2000); // 1000 - 2000 = -1000  
        
	}

}
