package javaproject1;

public class Cars {
	public Cars() {
		System.out.println("empty constructor called");
	}
	public Cars(int i) {
		this();
	
		System.out.println("one arg cons called");
	}
	
	public void brake()
	{
		
		System.out.println("breake is used");
	}
public static void main(String a[]) {
	Cars a1= new Cars(10);
	a1.brake();
}
}
