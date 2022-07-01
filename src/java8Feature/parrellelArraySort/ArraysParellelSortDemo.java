import java.util.*;

class ArraysParellelSortDemo {
	public static void main(String args[]) {
		int arr[] = {76,6,44,33,45,12,34,5};
		
		for(int i:arr) {
		
			System.out.print(i+",");
		}
		System.out.println("\nparrelle array sorting");
		
		Arrays.parallelSort(arr,0,8);
		for(int p : arr){
			
			System.out.print(p+",");
			
		}
	}
	
}