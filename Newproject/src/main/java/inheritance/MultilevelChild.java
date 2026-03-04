package inheritance;

public class MultilevelChild extends MultilevelIntermediate{

	
	void child()
	{
		System.out.println("i am a child");
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild s1 = new MultilevelChild();
				s1.child();
		        s1.second();
		        s1.parent();
	}

}
