import java.util.stream.*;
class StreamIterateDemo {
	public static void main(String args[]) {
		Stream.iterate(1,temp->temp+1)
		.filter(temp->temp%5==0)
		.limit(10).
		forEach(System.out::println);
		}
}