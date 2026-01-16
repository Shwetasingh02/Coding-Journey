package BitwiseAndMath.leetcode;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNumber728 {

    public static void main(String[] args) {

        int left=1 , right=22;
        List<Integer> number = new ArrayList<>();
        number = selfnumber(left,right);
        System.out.println(number);
    }

    private static List<Integer> selfnumber(int left ,int right) {

        List<Integer> ans = new ArrayList<>();
        for(int n =left ;n<=right ;n++) {
            int original=n;
            int temp=n;

            while(temp>0) {
                int digit = temp% 10;
                if (digit==0 || original % digit != 0) {
                    break;
                }
                temp=temp/10;
            }
            if(temp==0)
                ans.add(original);

            }
        return ans;
    }

}
