package java8Feature.lambdaExpression.multipleExample;

public class LamdaExpressionExample8 {
    public static void main(String[] args) {
        Sayable3 person = (message)-> {
          String str1 = "i am shivam kumar";
          String str2 = str1+message;
          return str2;
        };
        System.out.println(person.say3(" from kaganj"));
    }

}
