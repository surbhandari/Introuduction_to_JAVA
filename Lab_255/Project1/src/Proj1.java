
public class Proj1 {
	public static void main(String[] args) {
        final int NUM=8;
        for (int i = 0; i <NUM ; i++) {
                for (int j = i; j < (NUM-1); j++) {
                        System.out.print("    ");
                }
                for (int k = 0; k <i ; k++) {
                        System.out.printf("%4d",(int)Math.pow(2, k));
                }
                System.out.printf("%4d",(int)Math.pow(2, i));
                for (int m = i; m >0 ; m--) {
                        System.out.printf("%4d",(int)Math.pow(2, m-1));
                }
                System.out.println();
        }

}

}
