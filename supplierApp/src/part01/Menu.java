package part01;

import java.util.Scanner;

/**
 * Menu class
 * 
 * @author asteele
 *
 */
public class Menu {

	// Main method
	public static void main(String[] args) {
		int choice = 0;
		while (choice < 4) {
			System.out.println("\tMenu:");
			System.out.println("1.)\tPrint All Products");
			System.out.println("2.)\tAdd new Supplier");
			System.out.println("3.)\tAdd new Product");
			System.out.println("4.)\tExit Application");

			// Switch statement
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please input a number for your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Print products\n\n");
				break;
			case 2:
				System.out.println("Add folk\n\n");
				break;
			case 3:
				System.out.println("Add stuff\n\n");
				break;
			case 4:
			default:

				System.out.println(" Exiting...\n\n");
			}

		}
	}
}
