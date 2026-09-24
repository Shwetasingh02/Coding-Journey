package Revision.Day01;

import java.util.Scanner;

public class SumofAllElement {

    public static void main (String [] args){

        // I am just doinng the random things like increasing the value although I make it log
        // but I didn't used the L litral so Java treat it as the int only . SO make sure to add the L literal.

        long arr[] ={9,99,999,9999,99999,9999999L,99999999999L};
        long sum=0;

        for(int i=0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.print(sum);
    }
}
