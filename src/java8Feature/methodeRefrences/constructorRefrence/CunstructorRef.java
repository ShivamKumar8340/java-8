package java8Feature.methodeRefrences.constructorRefrence;

public class CunstructorRef {
    public static void main(String[] args) {
        Messegeable m = Message::new;
        m.getMessage("hello, Cunstructor reference");
    }
}
