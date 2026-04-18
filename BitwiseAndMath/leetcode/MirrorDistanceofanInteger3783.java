package BitwiseAndMath.leetcode;

import java.util.Scanner;

public class MirrorDistanceofanInteger3783 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();

        int result = mirrorDistance(n);
        System.out.print(result);
    }

     static int mirrorDistance(int n) {

        int m=n , temp=0;

        while(n>0){
            temp = temp*10 + n%10;
            n=n/10;
        }

        return Math.abs(m-temp);
    }
}
