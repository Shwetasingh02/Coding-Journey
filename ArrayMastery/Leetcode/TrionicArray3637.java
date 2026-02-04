package ArrayMastery.Leetcode;

public class TrionicArray3637 {

    public static void main(String[] args) {
        int [] nums ={1,3,5,4,2,6};

        int n = nums.length;
        int i=0;

        while(i+1<n && nums[i]<nums[i+1]) i++;
        if(i==0)
            System.out.println("False");

        while(i+1<n && nums[i]>nums[i+1]) i++;
        if (i == n - 1)
            System.out.println("False");

        while(i+1<n && nums[i]<nums[i+1]) i++;
        
    }
}
