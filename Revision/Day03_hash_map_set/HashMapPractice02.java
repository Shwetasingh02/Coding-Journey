package Revision.Day03_hash_map_set;

import java.util.HashMap;

public class HashMapPractice02 {

    public static void main(String [] arg){

        // key set
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 85);
        marks.put("Riya", 90);
        marks.put("Neha", 95);

//        System.out.print(marks.keySet());

        // Har student ka naam alag-alag line mein print karo.

        for(String key : marks.keySet()){
            System.out.println(key +" : " + marks.get(key));

        }

    }
}
