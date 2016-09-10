package hw_6;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * Homework #6/6.1
 * @author George Guan
 */

public class HW_SixPointOne {

	public static void main(String[] args) {
		
		int choice;
		System.out.println("Welcome to sorting program\n");
		System.out.println("\t1. Title");
		System.out.println("\t2. Rank");
		System.out.println("\t3. Date");
		System.out.println("\t4. Stars");
		System.out.println("\t5. Likes\n");
		
		choice = getUserChoice();
		System.out.println("You entered valid choice " + choice);
		System.out.println("Thank you for giving your choice.");
		 
	}

	public static int getUserChoice(){
		int num = 0;
		int count = 0;
		
		while(count ==0){			
			System.out.print("Enter your choice between 1 and 5 only: ");
			Scanner scan = new Scanner(System.in);
			//check for Integer
			if(scan.hasNextInt()){		
				num = scan.nextInt();
				//check for valid number
				if(num >=1 && num <=5){					
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
		return num;
	}
}
