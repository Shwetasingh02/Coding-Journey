package BitwiseAndMath.leetcode;

public class fourDivisor1390 {

    public static void main(String[] args) {

        int [] nums={21,4,7};
        int ans=sumFourDivisors(nums);
        System.out.println(ans);
    }
    public static int sumFourDivisors(int[] nums) {

        int count=0, sum=0;
        int i=1;

        for(int n:nums){
            while(i<= n){
                if(n%i==0)
                    count++;

                i++;
            }
        }
        return count;
    }
}
