package stringprogram;

public class BuffetBuilderDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb =new StringBuilder("Hi");
		System.out.println(sb);
		StringBuffer sbs =new StringBuffer("Hello");
		System.out.println(sbs);

        //insert()  : to insert a new word or character to the present string
		  System.out.println(sb.insert(2, "  welcome"));
		  System.out.println(sb);//change to new value
		  
		  //append()  :add a new string to the end of the current string.
		  
		  System.out.println(sbs.append("  Good day  "));
		  System.out.println(sbs.append(sb));
		  
		  //replace()   :to repace word or character based on the staring and ending position.
		
		   System.out.println(sb.replace(4, 11, "world"));
		   //delete()  :to delete starting and ending position
		    System.out.println(sb.delete(4,6));
		    
		    //reverse()  :to reserve a string.
		    System.out.println(sb.reverse());
		    
		    
		    
	}
}