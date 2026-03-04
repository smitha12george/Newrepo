package interfaceExample;

public class MultifaceInterfaceChild  implements MultipleParent1,MultipleinterfaceParen2{
 
	
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("parent1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("parent2");
		
	}

	@Override
	public void same() {
		// TODO Auto-generated method stub
		System.out.println("same method name parent1");
		System.out.println("same method name parent2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultifaceInterfaceChild ob =  new MultifaceInterfaceChild();
		
  ob.display();
  ob.show();
  ob.same();
	}

}
