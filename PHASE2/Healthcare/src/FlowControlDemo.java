
public class FlowControlDemo {

	public static void main(String[] args) {
		System.out.println("SWITCH-CASE DEMO\n");

		int number = 200;

		switch (number) {

		// Case statements
		case 100:
			System.out.println("100");

		case 200: {
			System.out.println("200");
			System.out.println("Ha Ha");
		}
			;
			break;

		case 300:
			System.out.println("300");
			break;

		// Default case statement
		default:
			System.out.println("Not in	100, 200 or 300");

		}

		System.out.println("\n\n FOR-LOOP DEMO\n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * i);
		};
		
		System.out.println("\n\n FOR-LOOP DEMO-2\n");
		for (int i = 1; i <= 10; i=i+2) {
			System.out.println(i * i);
		}

	}

}
