package javaproject1;

public class RevNum {
	public static void main(String args[]) {
		int num=7631,temp=0;
		while(num!=0) {
			temp=temp*10;
			temp=temp+(num%10);
			num=num/10;
		}
		
		System.out.println(temp);
			
			
		}
}

