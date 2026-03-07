package stringHub.LeetcodeQuestions;

import java.util.*;
public class SortingtheSentence1859 {

    public static void main(String[] args) {
        String sentense="is2 sentence4 This1 a3";

       String []words=sentense.split(" ");
       String [] result = new String[words.length];

       for(String word:words){
           int digit = Integer.parseInt(word.replaceAll("\\D", ""));
           result[digit - 1] = word.replaceAll("\\d", "");

       }
        String sortedSentence = String.join(" ", result);
        System.out.println(sortedSentence);
    }
}
