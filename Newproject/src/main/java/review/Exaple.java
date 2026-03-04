package review;

public class Exaple {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	  
	String s1 = "welome";
	String s2 = "Smitha";
	String s3 = "smitha";
	int a = 23;
	
	
	
	String u = "   My name is smitha  ";
	System.out.println(s1);
	System.out.println(s1.charAt(3));
	System.out.println(s1.concat("  smitha"));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.isEmpty());
	System.out.println(s1.contains("w"));
	
	System.out.println(String.valueOf(a));
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(u.trim());
	System.out.println(u.substring(7));
	System.out.println(u.substring(3, 8));
	System.out.println(s2==s3);
	}


}