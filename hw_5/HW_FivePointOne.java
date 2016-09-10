package hw_5;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * Homework #5/5.1
 * @author George Guan
 */
public class HW_FivePointOne {

	public static void main(String[] args) {

		System.out.println("Welcome to sorting program\n");
		System.out.println("\t1. Title");
		System.out.println("\t2. Rank");
		System.out.println("\t3. Date");
		System.out.println("\t4. Stars");
		System.out.println("\t5. Likes\n");

		int count = 0;
		
		while(count ==0){			
			System.out.print("Enter your choice between 1 and 5 only: ");
			Scanner scan = new Scanner(System.in);
			//check for Integer
			if(scan.hasNextInt()){		
				int num = scan.nextInt();
				//check for valid number
				if(num >=1 && num <=5){					
					System.out.println("You entered valid choice " + num);
					System.out.println("Thank you for giving your choice.");
					//reset counter to exit while loop
					count = 1;
				}
				else{
					System.out.println("You have not entered a number between 1 and 5.  Try again.");				
				}
			}else
			{
				System.out.println("You have entered an invalid choice.  Try again.");
			}
		}
	}
}
