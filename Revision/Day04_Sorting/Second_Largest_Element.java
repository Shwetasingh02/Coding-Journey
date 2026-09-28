package Revision.Day04_Sorting;

import java.util.Arrays;

public class Second_Largest_Element {

    public static void main(String[] arg){

        int [] arr ={20,50,10,50,50};

        Arrays.sort(arr);

        for(int i=arr.length-1; i>0;i--){

            int largest = arr[arr.length-1];
            if(largest!= arr[i]){
                System.out.print(arr[i]);
                break;
            }

        }
    }
}
