package demo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the plot size  ");
		
		int x = sc.nextInt();
		
		System.out.println(" In to how pieces you want divide this plot  ");
		int b = sc.nextInt();

		
		System.out.println(" So here size of each plot after division " + x / b);

		System.out.println(" Thank you  ");

	}

}
