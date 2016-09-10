package hw_4;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 *
 */
public class HomeworkFourPointOne {

	public static void main(String[] args) {
		 
		
		//a) How many times this loop is executed?  answer is 10
		
		int exeTimes;
		exeTimes = numberOfLoopExecuted();
		System.out.println("Number of times that the loop is executed is: " + exeTimes);
		
		System.out.println();
		
		//b) How many times this loop is executed if we changed the counter increment to ++i?  Answer is 9
		
		int exeTimes_B = 0;
		exeTimes_B = numberOfLoopExecuted_B();
		System.out.println("Number of times that the loop is executed is: " + exeTimes_B);
		
		System.out.println();
		
		//c) How many times this loop is executed, if it is executed immediately 
		//after the loop in #b, i.e. i is not reinitialized before the loop?
		//Answer is 0
		
		int exeTimes_C = 0;
		exeTimes_C = numberOfLoopExecuted_C();
		System.out.println("Number of times that the loop is executed is: " + exeTimes_C);
	}
	
	
	
	
	public static int numberOfLoopExecuted(){
		int i = 0;
		int counter = 0;
		while (i++ < 10){
			System.out.println("Hello World: " + i);
			counter++;
		}
		return counter;
		
	}
	
	public static int numberOfLoopExecuted_B(){
		int i = 0;
		int counter = 0;
		while (++i < 10){
			System.out.println("Hello World: " + i);
			counter++;
		}
		return counter;
		
	}
	
	public static int numberOfLoopExecuted_C(){
		
		//the first part: 
		int i = 0;
		int counter = 0;
		while (++i < 10){
			System.out.println("Hello World: " + i);
			
		}
		//the 2nd part
		while(++i < 10){
			System.out.println("Hello World: " + i);
			counter++;
		}
		
		return counter;
	}

}
