package hw_4;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George
 */

public class HomeworkFourPointSix {

	public static void main(String[] args) {


		char dash = '-';
		char vbar = '|';
		char space = ' ';
		char answer;
		
		
		do{
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to \"Draw a box\"!");
		System.out.print("Please enter box width: ");
		int width = sc.nextInt();

		System.out.print("Please enter box height: ");
		int height = sc.nextInt();


		//draw top line

		for(int i=0; i< width; i++){
			System.out.print(dash);
		}

		System.out.println();

		//draw the middle lines

		for( int m=0; m< height; m++){

			System.out.print(vbar);
			for(int x=0; x < width - 2; x++){
				System.out.print(space);
			}
			System.out.print(vbar);
			System.out.println();
		}

		//draw the bottom line

		for(int i=0; i< width; i++){
			System.out.print(dash);
		}
		
		System.out.printf("\nDo you want to do another draw?\nPlease type \"Yes\" to continue and \"No\" to exit: ");
		answer = sc.next().charAt(0);

		}while(answer == 'Y' || answer == 'y');
		
		System.out.printf("Thank you for using draw a box program.");

	}

}
