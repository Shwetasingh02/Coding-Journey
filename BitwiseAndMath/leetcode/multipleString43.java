package BitwiseAndMath.leetcode;

public class multipleString43 {

    public static void main(String[] args) {
        String s1= "3";
        String s2 = "5";

        multiple(s1,s2);
    }

    static String  multiple(String s1,String s2){

        int num1 = Integer.valueOf(s1);
        int num2 = Integer.valueOf(s2);

        return String.valueOf(num1*num2);
    }
}
