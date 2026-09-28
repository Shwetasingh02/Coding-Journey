package Revision.Day06_Recursive;

public class SumofDigits {

    public static void main(String[] arg){

        int digit = 12345;
        int result =digitsum(digit);
        System.out.print(result);
    }
    static int digitsum(int n){

        if(n==0){
            return 0;
        }
        int last = n%10;

        return last+digitsum(n/10);
    }
}
