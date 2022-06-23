package java8Feature.lambdaExpression;

public class LambaExpressionCreatigThread {
    public static void main(String[] args) {

        //without using lambda expression
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 is created without using lambda ");
            }
        };
        Thread ti = new Thread(r1);
        ti.start();


        //using lamda expresson
        Runnable r2 = () -> {
            System.out.println("thread 2 is creatied using lambda expression");

        };
        Thread t2= new Thread(r2);
        t2.start();
    }
}

