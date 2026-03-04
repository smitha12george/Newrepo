package exceptionExample;

public class ThrowSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age = 10;
		if(age>18)
		{
			System.out.println("Eligible");}
			else
			{
				//throw new ArithmeticException("not Eligible");
				throw new Exception("not Eligible");
			}
		}

	}

