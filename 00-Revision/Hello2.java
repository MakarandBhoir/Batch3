import java.util.Scanner;
class Hello2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int n = s.nextInt();
		System.out.println("Square of number = "+ n*n);
	}
}