package exceptionExample;

public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a = 10;
		int b = a/0;
		System.out.println(b);
		}
		catch(ArithmeticException  ae)
		{
			System.out.println("exception handle");
		}
		
		finally {
			System.out.println("main code");
		}
		try {
		int a[] = {1,2,3};
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException sd)
		{
			System.out.println("Array Exception");
		}
		
		
	String a = "asdf";
		System.out.println(a.length());
		

	}

}
