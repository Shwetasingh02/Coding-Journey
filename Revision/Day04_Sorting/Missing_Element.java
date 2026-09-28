package Revision.Day04_Sorting;

public class Missing_Element {

    public static void main(String[] arg){

        int [] arr={1,3,4,5};
        int n= arr.length+1;
        int sum= (n*(n+1))/2;
        int ArraySum=0;

        for(int i=0;i <arr.length;i++){
            ArraySum+=arr[i];
        }
        System.out.print(sum-ArraySum);
    }
}
