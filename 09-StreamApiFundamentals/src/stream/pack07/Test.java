package stream.pack07;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 10000);
		Employee e2 = new Employee(102, "Smith", 20000);
		Employee e3 = new Employee(103, "Peter", 30000);
		Employee e4 = new Employee(104, "David", 40000);
		Employee e5 = new Employee(105, "Sam", 50000);
		Employee e6 = new Employee(106, "John", 60000);
		Employee e7 = new Employee(107, "Smith", 70000);
		Employee e8 = new Employee(108, "Peter", 80000);
		Employee e9 = new Employee(109, "David", 90000);
		Employee e10 = new Employee(110, "Sam", 100000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
	    list.add(e8);
	    list.add(e9);
	    list.add(e10);
	    
	    Consumer<Employee> consumer = e -> System.out.println(e);
	    
	    list.stream().forEach(consumer);
	    
	    System.out.println("---------------------------------------------------");
	    
	    list.stream().forEach(e -> System.out.println(e));
	    
	    System.out.println("---------------------------------------------------");
	    
	    list.stream().filter( emp -> emp.getEmployeeSalary() > 50000 ).forEach(e -> System.out.println(e));
	    
	    
	}
}
