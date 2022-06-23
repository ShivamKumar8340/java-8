package java8Feature.streamAPI.filteringStream;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample1 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1,"mobile",25000f));
        productList.add(new Product(2,"laptop",30000f));
        productList.add(new Product(3,"ac",28000f));
        productList.add(new Product(4,"fridge",28000f));
        productList.add(new Product(5,"cooler",33000f));

        List<Float> productPriceList  = new ArrayList<Float>();

        for (Product p:productList) {
            if (p.price<30000) {
                productPriceList.add(p.price);
            }
        }
        System.out.println(productPriceList);
    }
}
