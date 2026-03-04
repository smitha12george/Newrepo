package polymorphism;

public class ChildPoly extends ParentPoly {
	
	void display()
	{ 
		super.display();
		System.out.println("This is achild");
	}
	  int print(int a,int b)
	   {
		 System.out.println(super.print(a, b)); 

	    int sum = a+b+5;
	    return sum;
	   }
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildPoly obj = new ChildPoly();
		obj.display();
		
		System.out.println(obj.print(6, 7));
		obj.get(8);
		
	}
	@Override
	void get(int a) {
		// TODO Auto-generated method stub8
		super.get(67);
		System.out.println(a);
		
	}
	
}
