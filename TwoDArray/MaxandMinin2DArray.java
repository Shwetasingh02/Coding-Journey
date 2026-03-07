package TwoDArray;

public class MaxandMinin2DArray {

    public static void main(String[] args) {
        int array [][]={
                {8,2,3},
                {4,-99,100},
                {6,7,-1}
        };

        int min= Integer.MAX_VALUE;
        for(int row=0; row <array.length ;row++){
            for(int column=0; column <array.length ;column++){
                if( min > array[row][column]){
                    min =array[row][column];
                }
            }
        }
        System.out.println(min);

        int max= Integer.MIN_VALUE;
        for(int row=0; row <array.length ;row++){
            for(int column=0; column <array.length ;column++){
                if( max < array[row][column]){
                    max =array[row][column];
                }
            }
        }
        System.out.println(max);
    }
}
