package Revision.Day04_Sorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] arg){

        int arr[]={20,50,30,10,40};
//        Arrays.sort(arr);
        int temp=0;

        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
