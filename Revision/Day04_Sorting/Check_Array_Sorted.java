package Revision.Day04_Sorting;

public class Check_Array_Sorted {

    public static void main(String[] arg){

        int[] arr={10,30,30};
        boolean sorted =false;

        for(int i=0; i< arr.length-1;i++){
            if(arr[i]<arr[i+1] || arr[i]==arr[i+1]){
                sorted=true;
            }else if(arr[i]>arr[i+1]){
                sorted =false;
                break;
            }
        }
        if(sorted){
            System.out.print("Sorted");
        }
        else{
            System.out.print("Not sorted");
        }
    }
}
