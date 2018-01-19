/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
*/
public class PatternC {
	public static void main(String[] args) {
		System.out.println("Pattern C");
		
		 for(int row=1;row<=6;row++){
	            for(int i = 6-row; i >0;i--) {
	            	System.out.print("  ");
	            }
	            for(int col=row; col>0;col--) {
	            	System.out.print(col+" ");
	            }
	            System.out.println();
	            
	    }
	}

}
