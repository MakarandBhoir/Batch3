package old.pack02;

abstract class A1{
	A1() {
		System.out.println("A1()");
	}
	void meth1() {
		System.out.println("meth1()");
	}
	abstract void meth2();
}
class C1 extends A1{
	@Override
	void meth2() {
		System.out.println("C1 :: meth2()");
	}
}
class C2 extends A1 {
	@Override
	void meth2() {
		System.out.println("C2 :: meth2()");
	}
}

interface I1{
	void meth2();
}

public class Test {
	public static void main(String[] args) {
		// A1 a1 = new A1();
		// I1 i1 = new I1();
		A1 a1 = null;
		
		a1 = new C1();
		a1.meth2(); // C1 :: meth2()
		
		a1 = new C2();
		a1.meth2(); // C2 :: meth2()
	}
}
