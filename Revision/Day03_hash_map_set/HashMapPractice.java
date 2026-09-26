package Revision.Day03_hash_map_set;

import java.util.HashMap;

public class HashMapPractice {

    public static void main (String[] arg){

        HashMap<String, Integer> movie=new HashMap<>();

        movie.put("KGF", 9);
        movie.put("Hanuman Ansh",10);
        movie.put("Bahubali", 5);
        movie.put("PadMan",10);

        System.out.println(movie.get("Hanuman Ansh"));
        System.out.println(movie.containsKey("Hittler"));
        System.out.println(movie.get("PadMan"));
        System.out.println(movie.remove("KGF"));
        System.out.println(movie.size());

    }
}
