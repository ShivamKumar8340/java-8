package java8Feature.methodeRefrences.instanceRefrence.runnable;

public class InstanceRefrence2 {
    public void printMessage() {
        System.out.println("Hello, runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceRefrence2()::printMessage);
        thread.start();
    }
}
