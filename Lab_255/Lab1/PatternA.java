/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class PatternA {
 public static void main(String[] args) {
	 System.out.println("Pattern A");
	 for (int rows = 1; rows <= 6; rows++) {
			for (int cols = 1; cols <= rows ; cols++) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}
	 
 	}
}
