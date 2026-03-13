package stringHub.LeetcodeQuestions;

public class RansomeNote383 {

    public static void main(String[] args) {
        String string1 ="aa";
        String string2="aab";

        canConstrust(string1,string2);
    }

    static boolean canConstrust(String string1 , String string2){

        if(string1.contains(string2)){
            return true;
        }
        return false;
    }
}
