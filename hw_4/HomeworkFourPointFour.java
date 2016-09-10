package hw_4;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 *
 */
public class HomeworkFourPointFour {

	public static void main(String[] args) {


		//draw top line

		for(int i=0; i< 20; i++){
			System.out.print("-");
		}

		System.out.println();

		//draw the middle lines

		for( int m=0; m< 8; m++){

			System.out.print("|");
			for(int x=0; x < 18; x++){
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}

		//draw the bottom line
		
		for(int i=0; i< 20; i++){
			System.out.print("-");
		}


	}




}
