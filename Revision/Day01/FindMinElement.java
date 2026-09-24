package Revision.Day01;

public class FindMinElement {

    public static void main(String [] arg){

        int arr[] ={-10,10};
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}
