package java08.pack03;

interface I1{
	void meth1();
}

public class Test {
	public static void main(String[] args) {
		I1 ref = () -> { 
				System.out.println("meth1 body");
				System.out.println("meth1 body");
		};
		
		ref.meth1();
	}
}
