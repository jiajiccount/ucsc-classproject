package hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * Homework #6/6.2
 * @author George Guan
 */

public class HW_SixPointTwo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to get two floats program.");
		//call getTwoFloats() to get two floats user entered
		float[] floats = getTwoFloats();
		System.out.println("You entered two valid floats: " + floats[0] + " " + floats[1]);
		System.out.println("Thank you for giving two floats.");		
	}
	
	public static float[] getTwoFloats(){
		
		
		float num1 = 0, num2=0;
		int counter = 0;
	
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
		return new float[]{num1, num2};
	}

}
