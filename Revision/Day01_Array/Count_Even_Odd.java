package Revision.Day01;

public class Count_Even_Odd {

    public static void main(String [] arg){

        int arr []={45,66,77,88,22,11,0};
        int even=0 , odd=0;

        for(int i=0 ;i <arr.length ;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print("even : " + even + "odd : " +odd);
    }
}
