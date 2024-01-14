package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println(" Enter the plot size  ");
//
//		int x = sc.nextInt();
//
//		System.out.println(" In to how pieces you want divide this plot  ");
//		int b = sc.nextInt();
//
//		System.out.println(" So here size of each plot after division " + x / b);
//
//		System.out.println(" Thank you  ");

		String readmeFilePath = "F:\\Users\\home\\git\\sl-oct23\\README.mdgrgrrtr";
		FileReader fr = null;

		
		try {
			fr = new FileReader(readmeFilePath);
			fr.read();
		} catch (FileNotFoundException e) {
			System.out.println("Inside FileNotFoundException catch block");
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Inside IOException catch block");
			System.out.println(e.getMessage());
		}
		
		System.out.println(" Thank you  ");

	}

}
