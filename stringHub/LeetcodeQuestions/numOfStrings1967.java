package stringHub.LeetcodeQuestions;

public class numOfStrings1967 {
    public static void main(String[] args) {
        String [] patter = {"a","abc","bc","d"};
        String word ="abc";

        int count =0;
        for(int i=0 ;i< patter.length;i++) {
            int j=0;
            while (j < word.length() && j < patter[i].length() ) {
                if(word.charAt(j) == patter[i].charAt(j)){
                    count++;
                }
                j++;
            }
        }
        System.out.print(count);
    }
}
