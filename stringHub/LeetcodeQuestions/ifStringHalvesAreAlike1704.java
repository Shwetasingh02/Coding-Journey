package stringHub.LeetcodeQuestions;

public class ifStringHalvesAreAlike1704 {

    public static void main(String[] args) {
        String s="textbook";

        int mid = s.length()/2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);

        int vol=0;
        int vol1=0;
        for(int i=0;i<a.length();i++){
            char word = a.charAt(i);
            if(word=='a' || word =='e' ||word=='i' || word =='o' ||
                    word=='u' || word=='A' || word=='E' || word=='I' || word=='O' || word=='U'){

                vol++;
            }
        }
        for(int i=0;i<b.length();i++){
            char word = b.charAt(i);
            if(word=='a' || word =='e' ||word=='i' || word =='o' ||
                    word=='u' || word=='A' || word=='E' || word=='I' || word=='O' || word=='U'){

                vol1++;
            }
        }
        if(vol == vol1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
