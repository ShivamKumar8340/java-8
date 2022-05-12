package lambdaExpression.lambdaMultipleParameter;

public class LambdaExpression5 {
    public static void main(String[] args) {
        //without datatype
        Addable ad =(a,b)->(a+b);
        System.out.println(" without dataType"+ad.add(10,20));

        //with dataType
        Addable ad1 =(int a,int b )->(a+b);
        System.out.println("with datatype :"+ad1.add(28,23));
    }
}
