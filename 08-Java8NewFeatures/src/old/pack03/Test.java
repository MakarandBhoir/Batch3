package old.pack03;

abstract class A1{
	abstract void meth1();
}

class C1 extends A1{
	@Override
	void meth1() {
		System.out.println("C1 method is called.");
	}
}
class C2 extends A1{
	@Override
	void meth1() {
		System.out.println("C2 method is called.");
	}
}
public class Test {
	public static void main(String[] args) {
		A1 ref = null;
		
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		
		if(Math.random() > 0.5)
            ref = obj1;
		else
			ref = obj2;
		
		// polymorphic call
		ref.meth1();
	}
}

