package inheritance;

public class SingleChild extends SingleParent{
	
	
	 void detail()
	 {
	    System.out.println("I am a child");

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingleChild sd = new SingleChild();
        SingleParent sd1 = new SingleParent();
          sd.display();
           sd1.display();
            sd.detail(); 
	}

}
