package SearchingandSorting.CyclicSort;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int arr[]={3,5,1,4,0};
        int result=missingNumber(arr);
//        System.out.println(Arrays.toString(result));
    }
    public static int missingNumber(int[] arr) {

        int i=0;
        while(i<arr.length) {
            int correct = arr[i] ;
            if(arr[i] <arr.length && arr[i]!=arr[correct])
                swap(arr ,i ,correct);
            else i++;
        }
        for(int index=0 ; index<arr.length;index++) {
            if(arr[index]!= index)
                return index;
        }
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {

        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    }
