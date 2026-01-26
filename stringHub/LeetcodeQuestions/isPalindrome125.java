package stringHub.LeetcodeQuestions;

public class isPalindrome125 {

    public static void main(String[] args) {
        String s ="0P";

        StringBuilder builder =new StringBuilder();
        StringBuilder result =new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }
        System.out.println("Original  : "+builder.toString());
        String reversed = new StringBuilder(builder).reverse().toString();
        result.append(reversed);
        System.out.println("Reversed  : "+result.toString());
        if(builder.toString().equals(result.toString())){
            System.out.println("true");
        }
            else {
            System.out.println("false");
        }
    }
}
