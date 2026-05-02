package BitwiseAndMath.leetcode;

import java.util.Scanner;

public class RotatedDigits788 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int result = rotatedDigits(n);
        System.out.print(result);
    }

     static int rotatedDigits(int n) {


         int count = 0;
        for(int digit=1 ;digit <=n ; digit++) {

            int num =digit;
            boolean isValid = true;
            boolean isGood = false;

            while (num > 0) {

                int d = num % 10;

                if(d == 3 || d== 4 || d==7){
                    isValid=false;
                    break;
                }
                    if ( d == 2 || d == 5 || d == 6 || d == 9) {
                        isGood=true;
                    }
                num = num / 10;
                }
            if (isValid && isGood) {
                count++;
            }
            }
        return count;
    }
}
