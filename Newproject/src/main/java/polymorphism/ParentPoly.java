package polymorphism;

public class ParentPoly {
	
	void display()
	{ 
		System.out.println("This is a parent");
	}
	 void get(int a)
	 {
		System.out.println(a); 
	 }
	 
	
   int print(int a,int b)
   {
    int sum = a+b;
    return sum;
   }
}
