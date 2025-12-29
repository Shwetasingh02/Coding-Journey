package SearchingandSorting.leetCode;

public class Singlenumber {

    public static void main(String[] args) {

        int [] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

     static int singleNonDuplicate(int[] nums) {
        int result =0;
        for(int n: nums){
            result=result^n;
        }
        return result;
    }
}
