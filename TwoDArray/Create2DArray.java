package TwoDArray;

public class Create2DArray {

    public static void main(String[] args) {

        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        PrintMatrix(array);
    }

    static void PrintMatrix(int array[][] ){
        for(int row=0;row< array.length;row++){
            for(int column=0;column< array.length;column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
    }

