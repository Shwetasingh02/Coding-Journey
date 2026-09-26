package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice02 {

    public static <arr> void main(String [] arg){

        // key set
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Aman", 85);
        marks.put("Riya", 90);
        marks.put("Neha", 95);

//        System.out.print(marks.keySet());

        // Har student ka naam alag-alag line mein print karo.

//        for(String key : marks.keySet()){
//            System.out.println(key +" : " + marks.get(key));
//
//        }

        // Print Sirf un students ko print karo jinke marks 90 ya usse zyada hain.

//        for(String key : marks.keySet() ){
//            if(marks.get(key) >=90){
//                System.out.println(key +" : " + marks.get(key));
//            }
//        }


        // Array ke unique elements print karo using HashSet.

        HashSet<Integer> num = new HashSet<>();
        int[] arr = {10, 20, 10, 30, 20, 40, 30, 50};
//
//        for(Integer value : arr){
//        num.add(value);
//        }
//        System.out.print(num);

        for(int number: arr){
            if(num.contains(number)){
                System.out.println("Duplicate found :"+ number);
                break;
            }else {
                num.add(number);
            }
        }
    }
}
