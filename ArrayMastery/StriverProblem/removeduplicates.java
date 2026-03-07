package ArrayMastery.StriverProblem;

import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicates {

    public static void main(String[] args) {
        int [] arr={2,2,7,8,8};

        HashSet<Integer> result = uniqueelementsbyset(arr);
        System.out.println(result);

        int k= uniqueelementswithoutset(arr);
        for(int i=0 ;i<k;i++){
            System.out.print(arr[i] + " ");
        }
    }

     static int uniqueelementswithoutset(int[] arr) {

      int i=0;
        for(int j=1; j<arr.length;j++){
            if(arr[i]!=arr[j]){
               i++;
               arr[i]=arr[j];
            }
        }
return i+1;
    }

    static HashSet<Integer> uniqueelementsbyset(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
    }
}
