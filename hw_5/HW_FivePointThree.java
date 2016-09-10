package hw_5;

/**
 * 5185.(801) Java Programming for Beginners
 * Homework #5/5.3
 * @author George Guan
 
 */
public class HW_FivePointThree {

	public static void main(String[] args) {
		 
		int weeklyTemp[] = {69, 70, 71, 68, 66, 71, 70};
		int i, max = 0, min =0;
		float total =0, average;
		
		min = weeklyTemp[0];
		max = weeklyTemp[0];
		total = weeklyTemp[0];
		
		for (i=1; i<weeklyTemp.length; i++){
			//print out the temperature on days
			System.out.println("The temperature on day " + i + " was " + weeklyTemp[i-1] + ":");
			//finding minimum temperature
			if (weeklyTemp[i]<min){
				min = weeklyTemp[i];
			}
			//finding max temperature
			if(weeklyTemp[i]>max){
				max = weeklyTemp[i];
			}
			//get the sum of total temperatures
			total += weeklyTemp[i];
		}
		//calculate the average of temperatures
		average = total/weeklyTemp.length;
		
		System.out.println("\nThe Minimum temperature is: " + min);
		System.out.println("The Maximum temperature is: " + max);
		System.out.println("The average temperage for the week is: " + average);	
	}
}
