package abstraction;

public class Abstractchild extends AbstractParent{
	
Abstractchild()

	{
		super(8);
		System.out.println("i am a child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractParent obj = new Abstractchild();
		 Abstractchild obj2 = new Abstractchild();
		obj.display();
		System.out.println(obj.age(5));
		obj.show();
		obj2.print();
		
	}
	 public void print()
	 {
		 System.out.println("I  am a child");
	 }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a parent");
		
	}

	@Override
	public int age(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
