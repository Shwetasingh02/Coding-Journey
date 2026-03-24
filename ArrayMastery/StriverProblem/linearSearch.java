package ArrayMastery.StriverProblem;

public class linearSearch {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5};
        int target = 8;

        System.out.print(linearTarget(nums,target));
    }

    private static int linearTarget(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
