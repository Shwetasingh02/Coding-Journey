package SubArray.Leetcode;

public class MaxSumofSubArray {

    public static void main(String[] arg){

        int[] arr ={2};
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            int sum=0;

            for(int j= i; j< arr.length;j++){
                sum += arr[j];

                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.print(maxSum);
    }
}
