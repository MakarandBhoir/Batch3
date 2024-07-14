package java08.pack02;

@FunctionalInterface
interface I1{
	public abstract void meth1();

	public static void meth2() {
		System.out.println("meth2");
	}
	public default void meth3() {
		System.out.println("meth3");
	}
}
/*
 * 1. Create class C1 that implements I1.
 * 2. We need to override meth1() method.
 * 3. We will write meth1 method body.
 * 4. We will create object of C1.
 * 5. We will call meth1 method using object of C1.
 */
class C1 implements I1{
	@Override
	public void meth1() {
		System.out.println("meth1"); // body of meth1
	}
}
public class Test {
	public static void main(String[] args) {
		I1 ref = new C1();
		ref.meth1();
	}
}







