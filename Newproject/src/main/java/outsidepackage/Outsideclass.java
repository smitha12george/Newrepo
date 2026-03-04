package outsidepackage;

import accessspecifier.Access;//import  the package from whre we wat to take the protected data as it is outside the package

public class Outsideclass  extends Access{

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Outsideclass obj = new  Outsideclass();
		
		
		obj.protectmethod();//protected can access from another package through child object for that we need to import package name,class
		obj.publimethod();// can access by all
		
		Access obj2 = new Access();
		obj2.publimethod();
		
	//	obj2.protected();protected can not access with parent class object.


	}

}
