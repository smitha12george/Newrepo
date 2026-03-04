package superKeyword;

public class SuperMethodChild extends SuoerMethodParent {

 void display()
	 
	 
	 {
	 this.display(4);
	 super.print();
	 super.get();
		 System.out.println("smitha");
	 }
 
 void display(int a)
 
 
 {
	
	 System.out.println(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodChild obj = new SuperMethodChild();
		//obj.print();
		obj.display();

	}

}
