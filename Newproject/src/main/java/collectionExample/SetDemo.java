package collectionExample;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name = new HashSet<String>();
		//add
		name.add(("car"));
		name.add(("null"));
		name.add(("car"));
		name.add(("jeep"));
		name.add(("van"));
		name.add(("bus"));
		System.out.println(name);
		name.remove("van");//Can't use index based removal
		System.out.println(name);
		//for Set ,can use all method except indexbased methods

	}

}
