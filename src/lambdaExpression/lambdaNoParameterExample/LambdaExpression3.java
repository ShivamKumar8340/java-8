package lambdaExpression.lambdaNoParameterExample;

public class LambdaExpression3 {
    public static void main(String[] args) {
        Sayable s =()->{
            return "i have a car";
        };
        System.out.println(s.say());
    }
}
