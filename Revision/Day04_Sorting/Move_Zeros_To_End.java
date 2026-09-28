package Revision.Day04_Sorting;

public class Move_Zeros_To_End {

    public static void main(String[] arg){

        int [] arr ={0,0,8};
        int [] result = new int[arr.length];
        int index=0;

        for(int i=0; i<arr.length;i++) {
            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
