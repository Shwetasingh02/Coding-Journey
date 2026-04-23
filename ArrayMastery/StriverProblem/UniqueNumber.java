package ArrayMastery.StriverProblem;
import java.util.*;
public class UniqueNumber {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4};
        int result =0;
        for(int j : arr){
             result = result ^ j;
        }
        System.out.println(result);
       if(result >0){
           System.out.println("true");
       }
       else{
           System.out.println("False");
       }
    }
}
