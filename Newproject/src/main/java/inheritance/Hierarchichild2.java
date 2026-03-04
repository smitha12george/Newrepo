package inheritance;

public class Hierarchichild2 extends HierrarchiParent{

	  
	void child2()
	{
		
		System.out.println("I am a hierarchi child2");
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Hierarchichild2 obj2 = new Hierarchichild2();
	obj2.parent();
	obj2.child2();
	}

}
