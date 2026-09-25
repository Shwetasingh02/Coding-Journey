package Revision.Day01_Array;

public class Second_Largest_Element {

    public static void main(String [] arg){

    int arr[]={45, 66, 77, 88, 22, 11};
    int secondLargest= Integer.MIN_VALUE;
    int Largest =Integer.MIN_VALUE;
    int lar =0;

    for(int i=0 ; i<arr.length;i++) {
        if(arr[i]>Largest){
           secondLargest =Largest;
            Largest = arr[i];
        } else if (arr[i]>secondLargest && arr[i] != Largest) {
            secondLargest=arr[i];
        }
    }
    System.out.print(secondLargest);

//    for(int i=0; i<arr.length;i++){
//        if(arr[i]>lar){
//            secondLargest=lar;
//            lar=arr[i];
//        }
//        else if(arr[i] > secondLargest && arr[i]!=lar){
//            secondLargest=arr[i];
//        }
//    }
//System.out.print(secondLargest);

    }
}
