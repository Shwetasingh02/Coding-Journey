package BitwiseAndMath.leetcode;

public class addDigit258 {

    public static void main(String[] args) {
        int n= 199;

        int result=fun(n);
        while(result>9){
           result= fun(result);
        }
        System.out.println(result);
    }

    public static int fun(int n) {
        int sum=0;
        while(n>0){
            int temp= n%10;
            sum+=temp;
            n=n/10;
        }
        return sum;
    }
}
