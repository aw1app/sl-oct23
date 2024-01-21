
public class StringDemo {

	public static void main(String[] args) {

		String text = " Hello ";
		
		String s = text.repeat(3);
		
		System.out.println(s); // "hello hello hello "
		
		
		// Feature 2
		text = " Hello ";
		System.out.println(text.isBlank()); //		false
		System.out.println("".isBlank()); //		true
		
		
		//3
		String sample = " hello ";
		System.out.println(sample); //		“ hello "
		System.out.println(sample.strip()); //		“hello"
		
		
		System.out.println(sample.stripLeading()); //		"hello “
		
		System.out.println(sample.stripTrailing()); //		" hello”
	}

}
