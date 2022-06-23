package java8Feature.lambdaExpression.lambdaWithOrwithoutReturnKeyword;

public class LambdaExpressionExample6 {
    public static void main(String[] args) {

        //without return
        Addable2 a1 =(a,b)->(a+b);
        System.out.println(a1.add2(10,38));

        //with return
        Addable2 a3 = (a,b)->{
            return a+b;
        };
        System.out.println(a3.add2(20,276));
    }
}
