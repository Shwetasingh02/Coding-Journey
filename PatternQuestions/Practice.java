package PatternQuestions;

public class Practice {
    public static void main(String[] args) {

        int n = 5;

        char[] arr = {'c', 'C', 'c', 'c'};  // tum yaha size change kar sakti ho

        for (int i = 1; i <= n; i++) {

            // print stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("A");
            }

            // print characters
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}