package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueElements {

    public static void main(String[] arg){

        HashSet<Integer> unique = new HashSet<>();
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        for(int number : arr){
                unique.add(number);
        }
        System.out.print("Unique Element: "+unique);

    }
}
