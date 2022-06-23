package java8Feature.methodeRefrences.instanceRefrence;

public class MethodeRefrence4 {
    public void saySomething() {
        System.out.println("hello, this is non static methode");
    }

    public static void main(String[] args) {
        MethodeRefrence4  obj  = new MethodeRefrence4();
        Sayable2 sayable2 = obj::saySomething;

        sayable2.say();


        // we can use here anonymous class

        Sayable2 sayable21 = new MethodeRefrence4()::saySomething;
        sayable2.say();
    }
}
