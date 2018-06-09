public class Test {
	public static void main(String a[]) {
		Travel travelone=new Cat();
		Travel traveltwo=new Car();
		
		System.out.println(travelone instanceof Monkey);
		System.out.println(traveltwo instanceof Bike);
		Travel travelthree=new Donkey();
		Owner owner=(Donkey)travelthree;
		System.out.println(travelthree instanceof Travel);
		System.out.println(owner instanceof Donkey);
	}

}

