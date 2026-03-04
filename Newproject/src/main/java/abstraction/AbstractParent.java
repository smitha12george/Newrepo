package abstraction;

public abstract class AbstractParent {
	
	
	AbstractParent()
	{
		
		System.out.println("i am a non parameterised constructor");
	}
	AbstractParent(int age)
	{
	 
		System.out.println(age);
	
	}
	


	public abstract void display();
	public abstract int age(int a);
	public void show()
	{
System.out.println("this is a  nrmal parent class");
	}

	
}
