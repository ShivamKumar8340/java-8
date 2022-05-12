package lambdaExpression.lambdaSingleParameter;

public class LambdaExpression4 {
    public static void main(String[] args) {
        Sayable2 s2 =(name)->{
            return name;
        };
        System.out.println(s2.say2("shivam"));

        //we can remove function ()

        Sayable2 s3 = name -> {
            return name;
        };

        System.out.println(s3.say2("kashyap"));
    }
}
