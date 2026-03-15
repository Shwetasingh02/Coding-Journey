package BitwiseAndMath.leetcode;

public class divideTwoInteger29 {

    public static void main(String[] args) {

        int divedent =700;
        int divisor =3;

        System.out.println(divide(divedent,divisor));
    }

    static int divide(int dividend,int divisor){
        int count =0;

        long dvt = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);

        while(dvt>=dvs){
            dvt =dvt-dvs;
            count++;
        }

        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            count = -count;
        }
        return count;
    }


}
