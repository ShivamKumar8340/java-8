class DefaultMethodeDemo implements Sayable{
	public String saySomething(String msg) {
		return msg;
		
	}
	public static void main(String args[]) {
		DefaultMethodeDemo df = new DefaultMethodeDemo();
		df.say();
		System.out.println(df.saySomething("Hello , i am static methode"));
	}
}