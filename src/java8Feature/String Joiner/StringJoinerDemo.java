import java.util.StringJoiner;
class StringJoinerDemo {
	public static void main(String args[]) {
		
		StringJoiner sj = new StringJoiner(",","{","}");
		
		sj.add("shivam");
		sj.add("Kashyap");
		sj.add("from");
		sj.add("kasgnaj");
		
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner(":","[","]");
		sj1.add("Husainpur");
		sj1.add("Etah");
		
		System.out.println(sj1);
		
		
		// merge both stringJoiner
		
		StringJoiner merge1= sj.merge(sj1);
		
		System.out.println("merge string : ");
		System.out.println(merge1);
	}
} 