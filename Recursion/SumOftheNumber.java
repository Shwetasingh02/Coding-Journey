package Recursion;

public class SumOftheNumber {

    public static void main(String[] args) {
        int ans = sumofnum(5);
        int result = sumifGivenRange(5,10);
        System.out.println(result);
    }
    static int sumofnum(int n){

        if(n<=1){
            return 1;
        }
        return n+sumofnum(n-1);
    }

    static int sumifGivenRange(int n , int m){
        if(m<=n){
            return n;
        }
        int i = n + sumifGivenRange(n+1,m );
        return i;
    }
}
