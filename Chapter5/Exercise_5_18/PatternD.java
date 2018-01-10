/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class PatternD {
	public static void main(String[] args) {
		System.out.println("Pattern C");
		
		 for(int row=1;row<=6;row++){
	            for(int i = 1; i <row;i++) {
	            	System.out.print("  ");
	            }
	            for(int col=1; col<=7-row;col++) {
	            	System.out.print(col+" ");
	            }
	            System.out.println();
	            
	    }
	}

}
