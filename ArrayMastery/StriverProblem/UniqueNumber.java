package ArrayMastery.StriverProblem;
import java.util.*;
public class UniqueNumber {

    public static void main(String[] args) {

        int arr [] = {1,2,2,4,4,1,5};
        int result =0;
        for(int j : arr){
             result = result ^ j;

        }
        System.out.print(result);
    }
}
