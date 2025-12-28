package TwoDArray;

public class ZigZagMatrix {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ZigZagPatter(array);
    }
    static void ZigZagPatter(int array [][]) {
        for (int row = 0; row < array.length; row++) {

            if (row % 2 == 0) {
                for (int col = 0; col < array[row].length; col++) {
                    System.out.print(array[row][col] + " ");
                }
            } else {
                for (int col = array[row].length - 1; col >= 0; col--) {
                    System.out.print(array[row][col] + " ");
                }
            }
        }
    }

}
