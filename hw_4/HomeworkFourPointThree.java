package hw_4;

/**
 * 5185.(801) Java Programming for Beginners
 * @author George Guan
 */
public class HomeworkFourPointThree {

	public static void main(String[] args) {

		//draw top line
		int i = 0;
		do {
			System.out.print("-");
		}while(i++ < 19);

		System.out.println();

		//draw the middle lines
		int m = 0;
		do{

			int x =0;
			System.out.print("|");
			do{
				System.out.print(" ");
			}while(x++ < 17);
			System.out.print("|");
			System.out.println();
		}while( m++ < 7);

		//draw the bottom line
		do{
			System.out.print("-");
		}while(i++ < 39);


	}


}
