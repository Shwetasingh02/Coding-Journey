package stringHub.LeetcodeQuestions;

import java.util.Arrays;

public class lengthOfLastWord58 {

    public static void main(String[] args) {
        String s = "Hello Shweta";

        String[] arr = s.split(" ");

        String lastword= arr[arr.length-1];
        System.out.println(lastword.length());

    }
}
