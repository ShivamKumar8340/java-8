package java8Feature.lambdaExpression.withoutLamdaExpression;

public class LambdaExpression1 {
    public static void main(String[] args) {
        int width = 10;

        //without lambda , Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("drawing :"+width);
            }
        };
        d.draw();
    }
}
