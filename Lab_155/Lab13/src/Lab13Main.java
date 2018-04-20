import java.util.Scanner;

public class Lab13Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of array ");
		int row = sc.nextInt();
		System.out.println("Enter number of column of array ");
		int col = sc.nextInt();
		double[][] input = new double[row][col];
		System.out.println("Enter elements of array array ");
		for(int i=0;i<row; i++) {
			for(int j =0;j<col;j++) {
				input[i][j]= sc.nextDouble();
			}
		}
		System.out.println("Array you entered is : ");
		for(int i=0;i<row; i++) {
			for(int j =0;j<col;j++) {
				System.out.print(input[i][j] + "   ");
			}
			System.out.println();
		}
		locateSmallest(input);
		int[] result = new int[2];
		result=locateSmallest(input);
		System.out.println("The position of smallest element is (" + (result[0]+1)+" , "+(result[1]+1) +")");
		
		

	}
	public static int[] locateSmallest(double[][] a) {
		int[] result = new int[2];
		double min=a[0][0];
		int m=0;
		int n=0;
		
		for(int i=0;i<a.length; i++) {
			for(int j =0;j< a[0].length;j++) {
				if(min>a[i][j]) {
					min=a[i][j];
					m=i;
					n=j;
				}
			}
		}
		
		result[0]=m;
		result[1]=n;
		
		return result;
	}
}
