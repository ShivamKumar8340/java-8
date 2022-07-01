import java.util.Optional;
class WithOutOptionalClassDemo {
	public static void main(String args[]) {
	
	String str[]= new String[10];
	
	
	String lowercaseString = str[5].toLowerCase();
	
	// here we have not use optional class so it will throw NullPointerException
	System.out.println(lowercaseString);
	}
}