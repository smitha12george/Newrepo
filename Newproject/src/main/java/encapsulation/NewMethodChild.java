package encapsulation;

public class NewMethodChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewMethodParent obj = new NewMethodParent();
		obj. setName("smitha");
		System.out.println(obj.getName());
		obj.setAge(33);
		System.out.println(obj.getAge());

	}

}
