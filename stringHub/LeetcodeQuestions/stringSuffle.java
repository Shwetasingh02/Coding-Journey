package stringHub.LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class stringSuffle {

    public static void main(String[] args) {

        int [] indices ={4,5,6,7,0,2,1,3};
        String s ="codeleet";

        char[] result = new char[s.length()];
        for(int i=0 ; i<s.length();i++){
            result[indices[i]]=s.charAt(i);

        }
        String shuffled = new String(result);
        System.out.println(shuffled);
    }
}
