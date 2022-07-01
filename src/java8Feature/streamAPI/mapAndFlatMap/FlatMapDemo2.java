import java.util.*;
import java.util.stream.*;

class FlatMapDemo2 {
	public static void main(String args[]) {
		List <String> list = Arrays.asList("Shivam","kumar","from","kasganj");
		
		// using flatMap()
		System.out.println(" using flatMap():");
		list.stream().flatMap(str->Stream.of(str.charAt(2))).forEach(System.out::println);
		
		// using map()
		System.out.println(" using Map():");
		list.stream().map(str->str.charAt(2)).forEach(System.out::println);
	}
} 