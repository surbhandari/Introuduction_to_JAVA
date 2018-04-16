import java.util.Scanner;

/*
Design and implement a program in  recursive approach
 that asks the user to enter a positive integer n 
 and prints out the list of all the permutations of the first n integers.
 For example: 
 if the user entered 3, 
 the program should return 
 
 [[1, 2, 3],[2, 1, 3],[3, 1, 2],[1, 3, 2],[2, 3, 1],[3, 2, 1]]
 Notice: The two programs should produce the same result for any input


*/
public class Recursive {
	public static void main(String[] args){
	    System.out.print("Enter a positive integer:");
	    int n=new Scanner(System.in).nextInt();
	    
	    //Filling the array with the array of input numbers:
	    int []array=new int[n];
	    for(int i=0;i<n;i++) {
	    	array[i]=i+1;
	    }
	    System.out.println("Possible permutations are:");
	    System.out.print("[");
	    permute(array, 0);
	    System.out.print("]");
	}
	public static void permute(int[] list, int start) {
	    for(int i = start; i < list.length; i++){
	        int temp = list[start];
	        list[start] = list[i];
	        list[i] = temp;
	        permute(list, start + 1);
	        list[i] = list[start];
	        list[start] = temp;
	    }
	    if (start == list.length - 1) {
	        System.out.print(java.util.Arrays.toString(list)+",");
	    }
	}

}
