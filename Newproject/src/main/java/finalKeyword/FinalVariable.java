package finalKeyword;

public class FinalVariable {
	
	 final void display()
	 {
	 System.out.println("final methos");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 9;
		//a = 6;  final can not be changed
		System.out.println(a);

	}

}
