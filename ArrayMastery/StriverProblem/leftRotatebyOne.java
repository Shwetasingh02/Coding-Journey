package ArrayMastery.StriverProblem;

public class leftRotatebyOne {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5}; // 2,3,4,5,1

        int k=1;
//        withExtraarray(nums);
        withoutExtraArray(nums,k);
    }

    private static void withoutExtraArray(int[] nums , int k) {

        int last = nums[0];
        for(int i=0; i<nums.length-k;i++){
            nums[i] = nums[i+k];
        }
        nums[nums.length-k]= last;

        for(int j : nums){
            System.out.print(j+" ");
        }
    }

    private static void withExtraarray(int[] nums) {
        int result[] = new int[nums.length];
            int last = nums.length-1;
            for(int i=0; i<nums.length-1;i++){

                result[i] = nums[i+1];
                System.out.print(result[i] + " ");
            }
            result[last]= nums[0];
            System.out.print(result[last]+" ");
        }
        }

