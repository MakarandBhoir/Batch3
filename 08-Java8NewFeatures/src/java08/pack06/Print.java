package java08.pack06;

@FunctionalInterface
public interface Print {
	public abstract void print(String message);
}

class C1 implements Print{

	@Override
	public void print(String message) {
		System.out.println("message = "+message);
	}
	
}
