package ArrayMastery.StriverProblem;

public class moveAllZeros {

    public static void main(String[] args) {

        int[] nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int start=0;

        for(int i= 0;i< nums.length;i++){
            if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
        for(int val : nums){
            System.out.print(val + " ");
        }
    }
}
