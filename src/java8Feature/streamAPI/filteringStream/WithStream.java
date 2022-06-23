package java8Feature.streamAPI.filteringStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"vivo",10000));
        productList.add(new Product(2,"realme",15000));
        productList.add(new Product(3,"samsung",20000));
        productList.add(new Product(4,"ipnone",30000));

        List<Float> productPrice = productList.stream()
                . filter(product ->product.price>10000)
                . map(product -> product.price)
                .collect(Collectors.toList());
        System.out.println(productPrice);


    }
}
