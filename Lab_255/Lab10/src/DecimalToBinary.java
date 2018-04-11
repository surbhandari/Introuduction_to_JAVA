import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer   ");
		number = sc.nextInt();
		
		if(number <0) {
			System.out.println("Error  !!!! this is not positive   ");
		}
		else {
			
			System.out.println("The binary of given number using non recursive apporach is   : ");
			convertBinary(number);
			System.out.println("The binary of given number using recursive apporach is   : ");
			convertBinaryRecursively(number);
		}
	}
	
	public static void convertBinary(int a) {
		int binary[] = new int[20];
		int i=0;
		while(a>0) {
			binary[i] = a%2;
			a= a/2;
			i++;
		}
		for(int j = i-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
		System.out.println();
	}
	public static void convertBinaryRecursively(int a) {
		String strBinary = "";
		if(a>0) {
			convertBinaryRecursively(a/2);
			strBinary += a%2;
			 
			System.out.print(strBinary);
		}
}

}
