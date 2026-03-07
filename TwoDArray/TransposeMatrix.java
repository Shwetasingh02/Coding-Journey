package TwoDArray;

public class TransposeMatrix {

    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transposeValue(array);
        System.out.println(array[0].length);
        System.out.print("row"+array.length);
    }

    static void transposeValue(int array[][]) {
        int[][] transpose = new int[array[0].length][array.length];

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        // Now print the transpose in matrix form
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
