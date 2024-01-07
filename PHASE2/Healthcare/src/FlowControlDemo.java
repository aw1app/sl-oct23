
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
		}
		;

		System.out.println("\n\n FOR-LOOP DEMO-2\n");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i * i);
		}

		// CHALLENGE-1: Req- Print cubes of even numbers b/w 5 to 10(inclusive of both
		// numbers);
		System.out.println("\n\n CHALLENGE-1 SOLUTION \n");
		for (int i = 5; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i * i * i);
			}
		}

		for (int i = 6; i <= 10; i = i + 2) {
			System.out.println(i * i * i);
		}
		;

		System.out.println("\n\n WHILE-LOOP DEMO-2\n");
		int i = 1;
		while (i <= 10) {
			System.out.println(i * i);
			i++;
		};
		
		System.out.println("\n\n DO-WHILE-LOOP DEMO-1\n");
		int j = 1;
		do {
			System.out.println("j square = "+ j * j);
			j++;
		}while (j <= 10);
		
		System.out.println("\n\n DO-WHILE-LOOP DEMO-2\n");
		int k = 15;
		do {
			System.out.println("k square = "+k * k);
			k++;
		}while (k <= 10);

	}

}
