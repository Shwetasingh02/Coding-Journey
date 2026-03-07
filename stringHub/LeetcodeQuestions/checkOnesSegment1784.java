package stringHub.LeetcodeQuestions;

public class checkOnesSegment1784 {

    public static void main(String[] args) {
        String s="1100";

         int n=s.length();
         if(s.equals('1'))

        for(int i=0;i<n-2;i++){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                System.out.println("true");
            }
        }
//        System.out.println("false");
    }
}
