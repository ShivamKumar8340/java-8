import java.util.*;
import java.util.stream.*;
class FilteringAndIterating{
	public static void main(String args[]) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Ac",50900f));
		list.add(new Product(2,"Samsung",20000f));
		list.add(new Product(3,"Realme",22000f));
		list.add(new Product(4,"IPhone",40000f));
		
		list.stream()
		.filter(p->p.price>20000f)
		
		.forEach(p->System.out.println(p.name+",  "+p.price));
		
	}
}