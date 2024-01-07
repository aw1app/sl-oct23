
public class FlowControlDemo {

	public static void main(String[] args) {
		int number = 200;

		switch (number) {

		// Case statements
		case 100:
			System.out.println("100");

		case 200: {
			System.out.println("200");
			System.out.println("Ha Ha");
		};
		break;

		case 300:
			System.out.println("300");
			break;

		// Default case statement
		default:
			System.out.println("Not in	100, 200 or 300");

		}

	}

}
