package hw_5;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * Homework #5/5.2
 * @author George Guan
 *
 */

public class HW_FivePointTwo {

	public static void main(String[] args) {

		Float num1, num2;
		int counter = 0;

		System.out.println("Welcome to get two floats program.");
		//start a loop for verifying two entries
		while(counter==0){
			System.out.print("Enter two floats separated by a space: ");
			Scanner scan = new Scanner(System.in);
			//verify the first entry
			if(scan.hasNextFloat()){
				num1 = scan.nextFloat();
				//verify the second entry
				if(scan.hasNextFloat()){
					num2 = scan.nextFloat();
					System.out.println("You entered two valid floats: " + num1 + " " + num2);
					System.out.println("Thank you for giving two floats.");
					//reset the counter to exit while loop
					counter = 1;
				}
				else{
					System.out.println("You have entered an invalid input.  Try again.");
				}

			}
			else{
				System.out.println("You have entered an invalid input.  Try again.");
			}
		}
	}
}
