package java08.pack01;

interface I1{
	// this is static method, you can't override it in the class that implements this interface
	public static void m1() {
		System.out.println("I1 m1");
	}
	
	// this is default method, you can override it in the class that implements this interface
	// default method is used to provide default implementation of the method
	// default keyword is not access modifier
	public default void m2() {
		System.out.println("I1 m2");
	}
	
	public abstract void m3();
}

class C1 implements I1{
	@Override
	public void m3() {
		System.out.println("C1 m3");
	}
}
public class Test {
	public static void main(String[] args) {
		I1.m1();
		I1 obj = new C1();
		obj.m2();
		obj.m3();
	}
}




