package TwoDArray;

public class NintyDegreeRotation {

    public static void main(String[] args) {

        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int transpose[][]=new int[3][3];


        for(int row=0;row<array[0].length;row++){
            for(int col =0; col<array[row].length;col++){
                transpose[row][col]=array[col][row];
            }
        }
        for(int row=0;row<transpose[0].length;row++){
            for (int col = transpose[row].length - 1; col >= 0; col--) {
                System.out.print(transpose[row][col] + " ");
            }
            System.out.println();
        }
    }
}
