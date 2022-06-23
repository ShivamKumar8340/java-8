package java8Feature.lambdaExpression.forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionExample7 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Shivam");
        list.add("Amit");
        list.add("Dinesh");
        list.add("Shiley");
        list.add("Surendra");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
