package TwoDArray;

public class ColumnByColumn {

    public static void main(String[] args) {

        int array[][] = {
                {1, 2,3},
                {4, 5,6},
                {7, 8,9}
        };
        ColumnByColumn(array);
    }
    static void ColumnByColumn(int array[][]) {
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}

