package superKeyword;

public class SuperChild extends SuperParent{
	
	String color = "black";
	void getData()
	{ 
		System.out.println(color);//print  black as normal sysout
		System.out.println(super.color);//to print white first call with super keyword since parent and child have same variable name
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChild obj = new SuperChild();
	System.out.println(obj.color);//print black with superkeyword
		obj.getData();//to call instace method to print black
		
		
	}

}
