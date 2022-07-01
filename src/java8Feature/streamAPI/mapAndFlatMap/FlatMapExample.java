import java.util.*;
import java.util.stream.*;

class FlatMapExample {
	public static void main(String args[]) {
		List<Integer> list1 = Arrays.asList(21,22,12,34,43,4,6);
		List<Integer> list2 = Arrays.asList(33,32,52,44,43,45,78);
		List<Integer> list3 = Arrays.asList(44,65,45,87,99,556,545);
		
		List<List<Integer>> listofListofInts = Arrays.asList(list1,list2,list3);
		
		System.out.println("The Structure before flattening is : " +listofListofInts);
		
	List<Integer> numberList =	listofListofInts.stream().flatMap(num->num.stream()).collect(Collectors.toList());
	System.out.println("The Structure after flattening is : " +numberList);
                                                         
                                                  
          
		
		
	}

}