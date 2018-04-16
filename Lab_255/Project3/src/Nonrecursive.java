import java.util.Arrays;
import java.util.Scanner;

/*
Design and implement a program in  non-recursive approach
 that asks the user to enter a positive integer n 
 and prints out the list of all the permutations of the first n integers.
 For example: 
 if the user entered 3, 
 the program should return 
 
 [[1, 2, 3],[2, 1, 3],[3, 1, 2],[1, 3, 2],[2, 3, 1],[3, 2, 1]]
 Notice: The two programs should produce the same result for any input


*/
public class Nonrecursive {
	public static void main(String[] args) {
		
		System.out.print("Enter a positive integer:");
		int n=new Scanner(System.in).nextInt();
		
		//filling the integer array from given number:
		int []list=new int[n];
		for(int i=0;i<list.length;i++) {
			list[i]=i+1;
		}
		// make idx array with zeros
		int[] idx = new int[list.length];
		Arrays.fill(idx, 0);
		System.out.println("Possible permutations are:");
		System.out.print("[");
		System.out.print(Arrays.toString(list));

		// Using heap's iterative algorithm
		for (int i = 1; i < list.length;) {
			if (idx[i] < i) {
				int swap = i % 2 * idx[i];
				int tmp = list[swap];
				list[swap] = list[i];
				list[i] = tmp;
				System.out.print(","+Arrays.toString(list));
				idx[i]++;
				i = 1;
			} 	
			else {
		   		idx[i++] = 0;
			}
		}
		System.out.print("]");
		}

}
