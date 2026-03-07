package BitwiseAndMath.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ConstructtheMinimumBitwiseArrayI3314 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        int [] result =minBitwiseArray(nums);

        for(int i=0 ; i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }

    private static int[] minBitwiseArray(List<Integer> nums) {

        List <Integer> ans =new ArrayList<>();
        int [] result = new int[nums.size()];
        for(int n:nums){

            int original =n;
            boolean found=false;
            for(int i=1; i<n;i++) {
                if ((i | (i + 1)) == original) {
                    ans.add(i);
                    found = true;
                    break;
                }
            }if(!found){
                    ans.add(-1);
                }
            }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
