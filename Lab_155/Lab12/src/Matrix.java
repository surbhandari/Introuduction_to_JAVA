import java.util.Scanner;

public class Matrix {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		
		//taking input from the user 
		System.out.println("Enter 3*4 matrix ");
		for(int i=0;i<3;i++) {
			for(int j =0;j<4;j++) {
				matrix[i][j]=sc.nextDouble();
			}
		}
		//printing the given matrix 
		System.out.println("The matrix you inputted is : ");
		for(int i=0;i<3;i++) {
			for(int j =0;j<4;j++) {
				System.out.print(matrix[i][j]+ "   ");
			}
			System.out.println();
		}
		
	
		//finding and printing the sum of each row 
		for(int i=0;i<3;i++) {
			double rowsum=0;
			for(int j =0;j<4;j++) {
				rowsum+=matrix[i][j];
			}
			System.out.println("The sum of row  "+ (i+1)+"  is "+  rowsum);
		}
		
		//finding and printing the sum of each column
		for(int j=0;j<4;j++) {
			double colsum=0;
			for(int i =0;i<3;i++) {
				colsum+=matrix[i][j];
			}
			System.out.println("The sum of column  "+ (j+1)+"  is "+  colsum);
		}
		
		
	}
}
