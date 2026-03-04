package superKeyword;

public class SuperConstructorChild extends SuperConstuctorParent {
   
	SuperConstructorChild()
	{
		super(5);
		System.out.println(" constructor child");
	}
	SuperConstructorChild(int b)
	{
		super();
		System.out.println(" second consrtuctor child  "+b);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj = new SuperConstructorChild();//if  parent object is not invoked non paremeteside constructor is run  by default

        SuperConstructorChild obj2 = new SuperConstructorChild(22);
		
	}

}
