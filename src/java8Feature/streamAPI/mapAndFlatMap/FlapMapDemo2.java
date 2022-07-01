import java.util.*;
import java.util.stream.*;

class FlapMapDemo2 {
	public static void main(String args[]) {
		List <String> list = Arrays.asList("Shivam","kumar","from","kasganj");
		
		list.stream().flatMap(str->Stream.of(str.charAt(2))).forEach(System.out::println);
	}
} 