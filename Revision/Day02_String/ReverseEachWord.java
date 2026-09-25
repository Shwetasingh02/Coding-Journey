package Revision.Day02_String;

public class ReverseEachWord {

    public static void main(String [] arg){

        String s = " Hi I Shweta";
        String[] words = s.split(" ");

        for(String word: words){

            for(int i= word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i) );
            }
            System.out.print(" ");
        }
    }
}
