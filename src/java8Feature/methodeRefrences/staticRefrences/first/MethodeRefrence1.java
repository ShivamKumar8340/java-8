package java8Feature.methodeRefrences.staticRefrences.first;

public class MethodeRefrence1 {
    public static void saySomething() {
        System.out.println("hello , static methode is calling");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodeRefrence1::saySomething;
        sayable.say();

    }
}
