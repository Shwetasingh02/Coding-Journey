package Revision;

public class Day06_Recursive {

    public static void main(String[] arg) {

        int n = 6;
        int result = factrial(n);
        System.out.print(result);
    }

     static int factrial(int n) {

        if(n==1){
            return 1;
        }
         return n*factrial(n-1);
     }
}
