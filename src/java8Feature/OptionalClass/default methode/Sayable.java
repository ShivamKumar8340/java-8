interface Sayable {
	default void say(){
		System.out.println("Hello, i am deafault methode");
	}
	String saySomething(String msg);
}