 
package stringprogram;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String s1=new String("smitha");
		
        System.out.println(s);
        System.out.println(s1); 
        
        
    //charAt() -  to return the character of the string based on the index position.
	 System.out.println(s.charAt(3));
	
	//length()- to return the length of the string. 
	System.out.println(s.length());
	System.out.println(s1.length()); 
	
	
	//concat()-to add new string to an existing string.
	System.out.println(s.concat(" welcome"));
	System.out.println(s.concat("  " +s1));
	System.out.println(s);
	
	
	// contains()-to check whether a character or word present in a string.
	System.out.println(s.contains("H"));
	System.out.println(s.contains("s"));
	
	
	//isEmpty()- to check whether the string is empty.
	System.out.println(s.isEmpty());
	String r="";
	System.out.println(r.isEmpty());
	
	
	
	//touppercase()-to convert smalll letter to caps.
	System.out.println(s.toUpperCase());
	
	
	//toLowercase()-to convert caps to small.
	System.out.println(s.toLowerCase());
	
	
	//valueof() - to convert any data type to string.
	  int a = 10;
	  System.out.println(String.valueOf(a));
	  double t = 23.90d;
	  System.out.println(String.valueOf(t));
	  
	  
	  //equals()- to check a string is equal or not.
	     String i = "Java";
	     String j = "java";
	     String k = "java";
	     String l = new String("java");
	     String m = new String("java");
	     System.out.println(j.equals(k));
	     System.out.println(j.equals(i));
	     System.out.println(l.equals(m));
	     
	     
	   //equalsIgnoreCase()  -  Ignore the case and check.
	     
	     System.out.println(j.equalsIgnoreCase(i));
	     System.out.println(j==k);
	     System.out.println(l==m);
	     
	     //==   : OperatorCompares object references (memory addresses).Checks if two variables point to the same object in memory.
	     //.equals() Method Compares the actual content (value) of objects.Defined in the Object class.Many classes (like String) override it to compare values properly.
	
	//trim()  -  removing the leading and trailing spaces.
	     
	     String u = "   Today is Thursday  ";
	       
	     System.out.println(u.trim());
	     
	     //subString() - extract the part of the string.
	     
	     System.out.println(u.substring(7));
	     
	     System.out.println(u.substring(0, 11));
	
	     System.out.println(s.substring(1, 3));
	}

}
