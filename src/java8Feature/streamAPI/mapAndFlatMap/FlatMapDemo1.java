import java.util.*;
import java.util.stream.*;

class FlatMapDemo1 {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("5.7","2","4.5","3.5");
		
		// using flatMap
		list.stream().flatMap(num->Stream.of(num)).
		forEach(System.out::println);
		
		//using map()
		
		list.stream().map(n->n).forEach(System.out::println);
	}
	
}