package ArrayMastery;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                {90,54,78},
                {32,90,34}};
        int target=34;
        int[] ans = doubleArraySearch(arr ,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] doubleArraySearch(int [] []arr, int target) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[] {0,0};
    }
}
