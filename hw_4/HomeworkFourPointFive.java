package hw_4;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 */

public class HomeworkFourPointFive {

	public static void main(String[] args) {
		

		char dash = '-';
		char vbar = '|';
		char space = ' ';
		
		Scanner sc = new Scanner(System.in);
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


	}

}
