package interfaceExample;

public class Child implements Parent{

	

	
		


	public static void main(String[] args)
	{
	 Parent obj =  new Child();// A Child object is created and referenced by a Parent interface type.
	 obj.print();
	 obj.display();
	 obj.show();
	 Parent.get();
	 System.out.println(a+b);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inteface method print");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("intefaced display method");
	}

}
