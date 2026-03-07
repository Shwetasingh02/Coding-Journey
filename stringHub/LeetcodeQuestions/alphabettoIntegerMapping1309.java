package stringHub.LeetcodeQuestions;

import java.util.Arrays;

public class alphabettoIntegerMapping1309 {

    public static void main(String[] args) {
        String s= "10#11#12";
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+2 < s.length() && s.charAt(i + 2) == '#'){
                int num = Integer.parseInt(s.substring(i ,i+2));
                char ch = (char) ('a' + num-1);
                result.append(ch);
                i=i+3;
            }
            else{
                int num = s.charAt(i)-'0';
                char ch = (char) ('a' + num-1);
                result.append(ch);
                i++;
            }
        }
        System.out.println(result.toString());
    }
}
