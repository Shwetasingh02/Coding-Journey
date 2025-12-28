package TwoDArray;

public class OneEightyDegreeRotation {

    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int row= array.length-1;row>=0;row--){
            for(int col =array[row].length-1;col>=0;col--){
               System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
}
