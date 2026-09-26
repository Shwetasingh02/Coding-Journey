package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class Intro {

    public static void main(String[] arg){
        HashMap<String , Integer> hash = new HashMap<>();

        // Marks Question
       hash.put("Aman" , 95);
       hash.put("Rahul", 85);
       hash.put("Sachin",100);

       // Salary Question
        hash.put("Mike" , 45000);
        hash.put("Micle", 35000);
        hash.put("Linc",50000);

        // update Aman Marks
        hash.put("Aman", 100);

        // containsKey()
        hash.containsKey("Shweta");

        //remove
        hash.remove("Aman");

       System.out.print(hash.size());

    }
}
