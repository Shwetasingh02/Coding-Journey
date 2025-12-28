package functions;

import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int first= sc.nextInt();
        System.out.println("Enter the second number :");
        int second= sc.nextInt();
        System.out.println("Enter the third number :");
        int third= sc.nextInt();

        int result = MaxNumber(first,second,third);
        int result2= MinNumber(first,second,third);
        System.out.println("Max Number =" +" "+ result);
        System.out.println("Min Number =" +" "+ result2);

    }

    static int MaxNumber(int first , int second , int third){
        int max=first;
        if(second>first){
            max=second;
        }
        if(third>max) {
            max = third;
        }
        return max;
    }
    static int MinNumber(int first ,int second , int third){

        int min=first;
        if(second <min){
            min=second;
        }
        if(third<min){
            min=third;
        }
        return min;
    }
}
