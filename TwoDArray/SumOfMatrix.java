package TwoDArray;

public class SumOfMatrix {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Summatrix(array);
    }

    static void Summatrix(int array[][]) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                sum += array[row][column];
            }
        }
        System.out.println("The sum of the matrix is :" + sum);
    }
}

