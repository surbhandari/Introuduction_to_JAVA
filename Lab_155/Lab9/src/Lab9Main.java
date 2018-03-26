import java.util.Scanner;

public class Lab9Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts user for string input 
		System.out.println("Enter a phone number as a string");
		System.out.println("(e.g., 1-800-Flowers, 1-800-356-9377, 1800flowers or 18003569377 )");
		String input = sc.nextLine();
		String uppercase = input.toUpperCase();
		int length = input.length();
		
		
		for(int i =0;i<length;i++) {
			char a = uppercase.charAt(i);
			if(Character.isLetter(a)) {
				System.out.print(getNumber(a));
			}
			else
				System.out.print(a);
		
		
			}
	}
		public static int getNumber(char x){
			if(x>='W')
				return 9;
			else if(x>='T')
				return 8;
			else if(x>='P')
				return 7;
			else if(x>='M')
				return 6;
			else if(x>='J') 
				return 5;
			else if(x>='G')
				return 4;
			else if (x>='D')
				return 3;
			else 
				return 2;
			
			
		}
		
}

