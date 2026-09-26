package Revision.Day03_hash_map_set;

import java.util.HashSet;

public class GetDuplicateElement {

    public static void main(String [] arg){
        HashSet<Integer> number =new HashSet<>();
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        for(int num : arr){
            if(number.contains(num)){
                System.out.print( num +" ");
                break;
            }else{
                number.add(num);
            }
        }
    }
}
