/*Write a program that reads in two lists of numbers. 
 * The program then merges the two lists if they are sorted in a nondecreasing order. 
 * Assume that each input list ends with 0.
 * E.g.: For the following inputs: 1 6 6 9 0 and 2 4 7 11 0. 
 * The program produces1 2 4 6 6 7 9 11
 * 
 */


import java.util.Scanner;

public class Mergelist {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter first sorted in a nondecreasing order and end with 0 ");
		String firstlist = sc.nextLine();
		String[] temp= firstlist.split(" ");
		int[] list1 = new int[temp.length-1];
		for(int i =0;i<temp.length-1;i++) {
			list1[i]=Integer.parseInt(temp[i]);
		}
		checklist(list1);
		System.out.println("Enter second sorted in a nondecreasing order and end with 0 ");
		String secondlist = sc.nextLine();
		String[] temp1= secondlist.split(" ");
		int[] list2 = new int[temp1.length-1];
		for(int i =0;i<temp.length-1;i++) {
			list2[i]=Integer.parseInt(temp1[i]);
		}
		checklist(list2);
		int[] result = new int[list1.length + list2.length];
		result= merge(list1, list2);
		System.out.println("The merged list is : ");
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]+ " ");
		}
		
	}
	
	

	
	public static void checklist(int[] a) {
		int n= a.length;
		for(int i=0;i<(n-1);i++) {
			if(a[i] > a[i+1]) {
				System.out.println("Please enter the list in increasing order ");
				System.exit(0);
			}
		}
		
	}
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)  
	       answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}

}
