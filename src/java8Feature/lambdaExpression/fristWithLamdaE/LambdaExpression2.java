package java8Feature.lambdaExpression.fristWithLamdaE;

public class LambdaExpression2 {
    public static void main(String[] args) {
        int hieght = 20;

        //with lambda
        Drawable2 d2 =()->{
            System.out.println("drawing 2 :" + hieght);
        };
        d2.draw();
    }
}
