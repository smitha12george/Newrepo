package exceptionExample;

public class CustomException {

	public static void main(String[] args) throws votingException {
		// TODO Auto-generated method stub
		int age = 10;
		if(age>18)
		{
			System.out.println("Eligible");}
			else
			{
				//throw new ArithmeticException("not Eligible");
				throw new votingException("not Eligible");
			}

	}

}
