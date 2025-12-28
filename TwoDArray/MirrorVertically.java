package TwoDArray;

public class MirrorVertically {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int row = array.length-1 ;row>=0;row--){
            for(int col =0 ;col< array.length;col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
}
