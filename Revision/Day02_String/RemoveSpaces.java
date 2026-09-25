package Revision.Day02_String;

public class RemoveSpaces {

    public static void main(String[] arg){
        String sent = "Hello Shweta Sigh !";
        StringBuilder str = new StringBuilder();

        for(int i=0 ; i<sent.length();i++){
            char ch = sent.charAt(i);
            if(ch != ' '){
                str.append(ch);
            }
        }
        System.out.print(str.toString());
    }
}
