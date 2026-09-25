package Revision.Day02_String;

public class CharacterFrequency {

    public static void main(String [] arg){

        String word = "";
        char target ='o';
        int count=0;

        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==target){
                count++;
            }
        }
        System.out.print(count);
    }
}
