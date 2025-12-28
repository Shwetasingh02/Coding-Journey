package functions;

public class factorialNumber {
    public static void main(String[] args) {

        System.out.println(findFactorial(10));
    }

    static int findFactorial(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--)
            factorial = factorial * i;

    return factorial;
}
}
