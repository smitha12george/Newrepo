package accessspecifier;


public class Access {
	public void publimethod()
	{
		
		System.out.println("This is a public method");
		}
	
	private void privatemethod()
	{
		
		System.out.println("This is a private method");
		}
	protected void protectmethod()
	{
		
		System.out.println("This is a protected method");
		}

	 void defimethod()
	{
		
		System.out.println("This is a default method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access obj = new Access();
		obj.defimethod();
		obj.protectmethod();
		obj.publimethod();
		obj. privatemethod();

	}

}
