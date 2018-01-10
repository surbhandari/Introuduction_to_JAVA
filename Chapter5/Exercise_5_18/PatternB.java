/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class PatternB {
	public static void main(String[] args) {
		System.out.println("Pattern B");
		for(int row=6;row>=1;row--) {
			for(int col =1;col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
