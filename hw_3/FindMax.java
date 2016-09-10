package hw_3;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 *
 */

public class FindMax {

	public static void main(String[] args) {

		int a, b, c, max;
		char answer;

		do{
			System.out.println("Enter three integer numbers to find max of them--separated by a space:");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();

			max = c > ((a>b)?a:b)?c:((a>b)?a:b);
			System.out.printf("The Max is: %d", max);
			System.out.printf("\n\n");
			
			System.out.printf("Continue? Type 'y' for yes: ");
			answer = scan.next().charAt(0);
			
		}while(answer=='y' || answer=='Y');
		
		System.out.println("Thank you for using my max program");


	}

}
