package hw_4;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 */
public class HomeworkFourPointTwo {

	public static void main(String[] args) {

		//draw top line
		int i = 0;
		while(i++ < 20){
			System.out.print("-");
		}

		System.out.println();

		//draw the middle lines
		int m = 0;
		while( m++ < 8){
			
			int x =0;
			System.out.print("|");
			while(x++ < 18){
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		//draw the bottom line
		while(i++ < 41){
			System.out.print("-");
		}


	}

}
