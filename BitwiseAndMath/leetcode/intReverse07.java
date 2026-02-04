package BitwiseAndMath.leetcode;

public class intReverse07 {

    public static void main(String[] args) {
        int x =123;
//        int original=x/10;
int temp=0;

        while(x>0){
            temp = x%10;
            x=x/10;
            System.out.print(temp);
        }

    }
}
