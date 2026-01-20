package stringHub.LeetcodeQuestions;

public class DefanginganIPAddress {

    // 1.1.1.1. // need to print in the form of 1[.]1[.]1[.]1[.]
    public static void main(String[] args) {
        String ip = "1.1.1.1.1";

        StringBuilder builder = new StringBuilder();
        for(char ch : ip.toCharArray()){
            if(ch == '.'){
                builder.append("[.]");
            }
            else{
                builder.append(ch);
            }
        }
        System.out.println(builder);
    }
}
