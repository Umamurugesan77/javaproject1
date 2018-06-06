package javaproject1;

public class Temperature1 {
	static double fahrenheit;
    static double celsius;
	
	public void Celsius(double celsius) {
		celsius= 5.0/9.0*(fahrenheit-32);
		
		 System.out.println(celsius);
    }
	public void Fahrenheit(double fahrenheit) {
		fahrenheit=9.0/5.0*celsius+32;
		System.out.println(fahrenheit);
	}
	public static void main(String a[]) {
		 
		 Temperature1 celsius1=new  Temperature1();
			Temperature1 fahrenheit1=new Temperature1();
			celsius1.Celsius(40);
			
			fahrenheit1.Fahrenheit(100);
			
	}
}


