package Recursion;

import java.math.BigInteger;

/* Limit of long
Java long can store only up to:
9,223,372,036,854,775,807
(around 9 × 10¹⁸)
But 100! ≈ 9 × 10¹⁵⁷, which is way bigger than long.
So during multiplication, the value overflows and eventually becomes 0.*/
public class Factorial {

    public static void main(String[] args) {

        long ans= factorialis(5);
        BigInteger result = bigNumberfact(100);
        System.out.println(result);
    }
    static long factorialis(long n){
        if(n<=1){
            return 1;
        }
        return n* factorialis(n-1);
    }
    static BigInteger bigNumberfact(int n){
        if(n<=1){
            return  BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(bigNumberfact(n-1));
    }
}
