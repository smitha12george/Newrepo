package interfaceExample;

public interface Parent {
	public static final int  a = 54;
	int b =  78;
	public abstract void display();
	public abstract void print();
	default void show() {
		// a = 45;  final variables can not change
		//b = 23; default is taken as final
		System.out.println("interface default method");
	}
  public static void get() {
		
		System.out.println("interface static method");
	}
	

	}
	


