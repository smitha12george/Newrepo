package inheritance;

public class Hierarchichild1 extends HierrarchiParent {

	
	   void child1()
	   {
		   System.out.println("I am a hierarchi child1");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hierarchichild1 obj1 = new Hierarchichild1();
		 obj1.parent();
		 obj1.child1();
		
		

	}

}
