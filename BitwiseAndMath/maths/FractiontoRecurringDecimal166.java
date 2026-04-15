package BitwiseAndMath.maths;

public class FractiontoRecurringDecimal166 {

    public static void main(String[] args) {
        int numerator, denominator;

        String result = fractionToDecimal(4,333);
        System.out.print(result);
    }

    static String fractionToDecimal(int numerator, int denominator) {


        return String.valueOf((double)numerator/denominator);

    }
}
