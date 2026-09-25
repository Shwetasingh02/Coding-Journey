package Revision.Day02_String;

public class CountVowels {

    public static void main(String [] arg){

        String s ="aeiouaeiou";
        int count=0;

        for(int i=0; i<s.length();i++){

           char ch = s.charAt(i);

           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               count++;
           }
        }
        System.out.print(count);
    }
}
