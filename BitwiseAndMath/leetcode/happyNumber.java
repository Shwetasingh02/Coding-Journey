package BitwiseAndMath.leetcode;

public class happyNumber {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n)); // true
    }

    static boolean isHappy(int n) {

        while (true) {

            if (n == 1) {
                return true;
            }

            if (n == 4) {
                return false;
            }

            n = sumNum(n);
        }
    }

    static int sumNum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
