
public class OtherMethod2 {
	public static void main(String[] args) {

        int space = 32;

        for (int i = 0; i < 8; i++) {
            int s=space;
            while(s>0){
                System.out.print(" ");
                s=s-1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(spaceCalcuate(j)+(int) Math.pow(2, j));
            }

            for (int k = i; k >= 0; k--) {
                System.out.print(spaceCalcuate(k)+(int) Math.pow(2, k));
            }

            System.out.println("");
            space=space-4;
            
        }
    }
    public static String spaceCalcuate(int a)
    {
        int numspace;
        int output=(int) Math.pow(2, a);
        String totalspace;
    
        if(output<10){
            numspace=3;
    }
        else if ((output<100) &&(output>10)) {
            numspace=2;
        }
        else{
            numspace=1;
        }
     totalspace=String.format("%"+numspace+"s", "");
     return totalspace;
}

}
