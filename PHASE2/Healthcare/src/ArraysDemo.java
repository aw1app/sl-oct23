
public class ArraysDemo {

	public static void main(String[] args) {
		System.out.println("\n\n int array of size 10 DEMO \n");

		// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Access and print the second element of the array
		System.out.println(myArray[1]);

		// CHALLENGE-2 . Create a String array that holds names of 4 people.
		// Loop thru and print all the names.
		System.out.println("\n\n CHALLENGE-2 . Create a String array that holds names of 4 people DEMO \n");
		String arr[] = { "name 1", "Name 2", "Name 3", "Name 4" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		;

		System.out.println("\n\n Object array(of Doctor objects) of size 10 DEMO \n");
		Doctor[] doctors = new Doctor[10];

		doctors[0] = new Doctor();
		doctors[1] = new Doctor();
		doctors[2] = new Doctor();
		// .....
		// ..
		doctors[9] = new Doctor();

		// 2-d array
		System.out.println("\n\n Defining and looping thru all elements(rows and cols) of a 2-d array DEMO \n");

		int[][] numbers = { 
				{ 1, 2, 3, 4, 5 },
				{ 11, 12, 13, 14, 15 }
				};

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Row "+i);
			
			for (int j = 0; j < numbers[i].length; j++) {				
				System.out.println(numbers[i][j]);
			}

		}

	}

}
