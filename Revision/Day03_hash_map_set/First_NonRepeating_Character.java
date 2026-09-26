package Revision.Day03_hash_map_set;

import java.util.HashMap;
import java.util.HashSet;

public class First_NonRepeating_Character {

    public static void main(String[] arg){

        HashSet<Character> element = new HashSet<>();
        HashMap<Character,Integer> feq=new HashMap<>();
        String s ="eaabbccd";

        for(char ch :s.toCharArray()){
            element.add(ch);
            if(element.contains(ch)){
                feq.put(ch, feq.getOrDefault(ch, 0) + 1);
            }else{
                feq.put(ch,1);
            }
        }
        for(char ch : s.toCharArray()){
            if(feq.get(ch) == 1){
                System.out.print(ch);
                break;
            }
        }

    }
}
