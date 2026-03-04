package collectionExample;
import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> li = new ArrayList<String>();
		System.out.println(li);
		//add method - to add elements in the collection
		li.add("red");
		li.add("blue");
		li.add("null");
		li.add("black");
		li.add("null");
		li.add("white");
		li.add("black");
		System.out.println(li);
		System.out.println(li.indexOf("black"));//index of the perticular element in the collection
		System.out.println(li.lastIndexOf("black"));
		System.out.println(li.remove(2));
		System.out.println(li.remove("black"));
		System.out.println(li);
		System.out.println(li.get(1));
		System.out.println(li.getFirst());
		
		System.out.println(li.contains("white"));
		System.out.println(li.contains("wer"));
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));//to take the element of the list
		}
		
		//for each loop
		System.out.println("items in the list are ");
		for(String list:li) {
			
			System.out.println(list);
		}
		
				

	}

}
