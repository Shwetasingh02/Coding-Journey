package Revision.Day01;

public class FindMaxElement {

    public static void main (String [] arg){

        int arr[]={-10, -25, -3, -100, -1, -50};
        int temp = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.print(temp);


    }
}
