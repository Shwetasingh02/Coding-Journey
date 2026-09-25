package Revision.Day02_String;

public class Palindrome {

    public static void main (String [] arg){
        String s ="hello";
        String word=s;
        StringBuilder su = new StringBuilder();

        for(int i= s.length()-1;i>=0;i--){
            su.append(s.charAt(i));
        }
        if(word.equals(su.toString())){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}
