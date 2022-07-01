import java.util.*;
class ForEachDemo {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String> ();
		list.add("Shivam");
		list.add("kashyap");
		list.add("from");
		list.add("kasganj");
		
		
		// for each() by lambda 
		System.out.println("for each() by lambda :");
		list.forEach(l->System.out.println(l));
		
		//for each by methode Refrence
		System.out.println("for each by methode Refrence :");
		list.forEach(System.out::println);
	}
}