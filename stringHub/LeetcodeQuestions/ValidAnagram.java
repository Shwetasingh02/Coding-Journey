package stringHub.LeetcodeQuestions;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String s= "anagram", t = "nagaram";

        System.out.println(Isanagram(s,t));
    }

    static boolean Isanagram(String s , String t){

        char [] c1= s.toCharArray();
        char [] c2= t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            return true;
        }
        else{
            return false;
        }
    }
}
