package TwoDArray;

public class SecondaryDiagonalMatrix {
    public static void main(String[] args) {
         int array [][]={
                 {1,2,3},
                 {4,5,6},
                 {6,7,8}
         };

         for(int row =0; row <array.length ;row++){
           for(int col =0; col<array[row].length ;col++){
               if (row + col == (array.length) - 1) {

                   System.out.print(array[row][col]+" ");
               }
            }
        }
    }
}
