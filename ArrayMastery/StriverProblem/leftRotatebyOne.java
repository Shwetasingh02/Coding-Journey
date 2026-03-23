package ArrayMastery.StriverProblem;

public class leftRotatebyOne {

    public static void main(String[] args) {

        int nums []={1,2,3,4,5}; // 2,3,4,5,1
        int result[]= new int[nums.length];
        int last = nums.length-1;
        for(int i=0; i<nums.length-1;i++){

            result[i] = nums[i+1];
            System.out.print(result[i] + " ");
        }
        result[last]= nums[0];
        System.out.print(result[last]+" ");
    }
}
