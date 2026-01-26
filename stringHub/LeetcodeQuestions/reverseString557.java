package stringHub.LeetcodeQuestions;

public class reverseString557 {

    public static void main(String[] args) {
        String s= "Shweta Singh";
        StringBuilder result = new StringBuilder();
        String [] word = s.split(" ");

        for(String wrd : word){
            String reversed = new StringBuilder(wrd).reverse().toString();
            result.append(reversed).append(" ");
        }
        System.out.println(result);
    }
}
