package javaproject1;

public class Flowers extends Fruits{
	public Flowers() {
		System.out.println("Empty");
		
	}
	public Flowers(int price) {
		System.out.println("twenty rupees");
		
	}
	public void cost() {
		System.out.println("cost is cheap");
	}
	public static void main(String a[]) {
		Flowers one =new Flowers(19);

	}

}
