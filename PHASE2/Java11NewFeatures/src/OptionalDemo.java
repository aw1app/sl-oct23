import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String text = null;
		
		System.out.println(!Optional.ofNullable(text).isPresent());
		
		System.out.println(Optional.ofNullable(text).isEmpty());
		
		
		text = "Hello World";
		
		System.out.println(!Optional.ofNullable(text).isPresent());
		
		System.out.println(Optional.ofNullable(text).isEmpty());
	}

}
