package javaproject1;

public class MaxAndMin {
	public static void main(String args[]){
		int arr[] = new int[] {65,20,30,25,40};
		int Max = arr[0];
		int Min = arr[0];
		for(int i=1;i<=arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			if(arr[i]<Min) {
				Min=arr[i];
			}
			System.out.println("Maximum value is: "+Max);
			System.out.println("Minimum value is: "+Min);
			
			
		}
		
	}
}


