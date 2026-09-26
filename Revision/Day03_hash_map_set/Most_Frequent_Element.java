package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class Most_Frequent_Element {

    public static void main(String [] arg){

        HashMap<Integer, Integer> map=new HashMap<>();

        int[] arr = {10, 20, 10, 30, 20, 10, 40};
        int mostfreq=0;
        int Maxfreq=0;

        for(int number : arr){
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for(int numb : map.keySet()){
            int count = map.get(numb);

            if(count> Maxfreq){
                Maxfreq = count;
                mostfreq =numb;
            }

        }

        System.out.print("Most Frequest : " + mostfreq);
    }
}
