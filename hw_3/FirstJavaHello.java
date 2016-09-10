package hw_3;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 *
 */

import java.util.Scanner; 

public class FirstJavaHello {

	public static void main(String[] args) {

		int yourAge; 
		Scanner readInput = new Scanner(System.in);   
		System.out.printf("How old are you?: ");   
		yourAge= readInput.nextInt();

		if (yourAge < 13){
			System.out.printf("You are a kid.\n");  
		}
		else if(yourAge >= 13 && yourAge <= 19)  {
			System.out.printf("You are a teenager.\n");
		}else {
			System.out.printf("You are an adult.\n");
		}

	}

}
