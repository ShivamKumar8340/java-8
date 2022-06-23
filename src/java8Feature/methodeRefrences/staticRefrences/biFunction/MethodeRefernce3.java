package java8Feature.methodeRefrences.staticRefrences.biFunction;

import java.util.function.BiFunction;

public class MethodeRefernce3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addable = Arithmetic::add;
        int result = addable.apply(10,39);
        System.out.println(result);
    }
}
