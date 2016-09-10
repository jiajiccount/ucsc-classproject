package hw_3;

import java.util.Scanner;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 *
 */

public class Calculator {

	public static void main(String[] args) {

		double firstN;			
		double secondN;			
		char operator;
		char answer;
		

		do{
		Scanner	readInput =	new	Scanner(System.in);
		System.out.printf("Type a number, operator, number --"															
				+	" separated by a space: ");

		firstN	= readInput.nextDouble();			
		operator = readInput.next().charAt(0);			
		secondN	= readInput.nextDouble();	
		
		if (operator == '+')				
			System.out.printf("%.2f + %.2f = %.2f",																													
					firstN,	secondN, firstN	+ secondN);	
		else if (operator == '-')				
			System.out.printf("%.2f - %.2f = %.2f",
					firstN,	secondN, firstN	- secondN);	
		else if (operator	==	'*')				
			System.out.printf("%.2f * %.2f = %.2f",																														
					firstN,	secondN,	firstN	*	secondN);
		else if (operator == '/')				
			System.out.printf("%.2f/%.2f = %.2f",																														
					firstN,	secondN, firstN/secondN);			
		else if	(operator == '%')				
			System.out.printf("%.2f %% %.2f = %.2f",																																	
					firstN,	secondN, firstN % secondN);			
		else				
			System.out.printf("Unknown operator");	
		
		System.out.printf("\nDo you want to do another calculation?\nPlease type \"Yes\" to continue and \"No\" to exit: ");
		answer = readInput.next().charAt(0);

		}while(answer == 'Y' || answer == 'y');
		
		System.out.printf("Thank you for using my Calculator program.");

	}

}
