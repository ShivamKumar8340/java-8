import java.util.*;
import java.util.stream.Collectors;

class TestStream1 {
	public static void main(String args[]) {
		
	List<Product> list = new ArrayList<Product>();
	list.add(new Product(1,"Mobile",9000f));
	list.add(new Product(2,"Laptop",12000f));
	list.add(new Product(3,"Fridge",21000f));
	list.add(new Product(4,"Ac",21000f));
	
	List<Float> priceList = list.stream()
							.filter(p->p.price>10000f)
							.map(p->p.price)
							.collect(Collectors.toList());
	System.out.println(priceList);					
	}
}