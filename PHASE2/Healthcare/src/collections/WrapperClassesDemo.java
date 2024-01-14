package collections;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		Integer num1 = new Integer(110);

		System.out.println(num1.intValue());

		// 2. Use the valueOf method of Integer class.
		String str = "100";
		Integer num2 = Integer.valueOf(str);
		System.out.println(num2);

		Character character1 = new Character('A');
		System.out.println(character1.charValue());

		System.out.println("character1 is lowercase character = " + Character.isLowerCase(character1));
		System.out.println("character1 is uppercase character = " + Character.isUpperCase(character1));
		
		
		
		// Unboxing
		int x1 = num1;
		System.out.println(x1);
		
		//Boxing 
		Integer num3 = 120;
		System.out.println(num3.intValue());
		System.out.println(num3);
	}

}
