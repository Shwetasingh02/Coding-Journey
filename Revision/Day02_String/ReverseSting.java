package Revision.Day02_String;

public class ReverseSting {

    public static void main (String [] arg){

        String s = "Hello Shweta";

        for(int i=s.length()-1 ;i>=0;i--){

            System.out.print(s.charAt(i));
        }
    }
}
