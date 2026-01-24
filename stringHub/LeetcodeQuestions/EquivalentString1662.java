package stringHub.LeetcodeQuestions;

public class EquivalentString1662 {

    public static void main(String[] args) {
        String word="shweta singh";
        String word2="shwe taingh";
        String s="ABC";
        System.out.println(s.toLowerCase());
//        System.out.println(word);
       String[] words = word.split(" ");
       String[] words2 =word2.split(" ");

       System.out.println(words2);
        String w1="";
        String w2="";
        for(int i=0;i<words.length;i++){
            w1+=words[i];
            w2+=words2[i];
        }
        if(w1.equals(w2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(w1);
        System.out.println("2nd word:"+w2);
    }
}
