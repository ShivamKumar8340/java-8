package java8Feature.methodeRefrences.staticRefrences.Runnable;

public class MethodeRefrence2 {
    public static void threadStatus() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread thread =new Thread(MethodeRefrence2::threadStatus);
        thread.start();
    }

}
