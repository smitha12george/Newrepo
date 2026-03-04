package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("blue");
		al.add("null");
		al.add("green");
		al.add("null");
		
		System.out.println(al);
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Apple");
		ar.add("null");
		ar.add("orange");
		ar.add("null");
		System.out.println(ar);
		//addAll()-combine two list
		System.out.println(ar.addAll(al));
		System.out.println(ar);
		
		//containsAll
		System.out.println(ar.containsAll(al));
		System.out.println(al.containsAll(ar));

		//clear()-to clear a list
		ar.clear();
		System.out.println(ar);
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
			it.remove();
			System.out.println(al);
		

	}

}
