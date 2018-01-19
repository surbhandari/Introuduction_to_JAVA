import java.util.*;
public class OtherWay {
	public static void main(String[] args) {
        System.out.println("Eneter in how many pyramid rows you'd like! (Will get lopsided if higher than 10)" );
        Scanner sc = new Scanner(System.in);
        int numOfRows = sc.nextInt();
        int maxNum = 1;

        for(int row = 1; row <= numOfRows; row++) {

                for(int spaces = 0; spaces < numOfRows - row; spaces++) {
                        System.out.print("    ");
                }

                for(int num = 1; num <= maxNum; num = num * 2) {
                        if(num > 99) System.out.print(" " + num);
                        else if(num > 9) System.out.print("  " + num);
                        else System.out.print("   " + num);
                }

                for(int num = (maxNum / 2); num >= 1; num = num / 2) {
                        if(num > 99) System.out.print(" " + num);
                        else if(num > 9) System.out.print("  " + num);
                        else System.out.print("   " + num);
                }

                maxNum = maxNum * 2;
                System.out.println();
        }

}

}
