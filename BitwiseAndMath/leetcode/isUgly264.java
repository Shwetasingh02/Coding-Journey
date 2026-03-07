package BitwiseAndMath.leetcode;

import java.util.*;

public class isUgly264 {

    public static void main(String[] args) {
        int [] prime ={2,3,5};
        int n=10;


        Set<Integer> set =new HashSet<>();
        for(int i=1;i<=n;i++){
                set.add(i*2);
                set.add(i*3);
                set.add(i*5);
        }
        List <Integer> result = new ArrayList<>(set);
        result.add(1);
        Collections.sort(result);
//        System.out.println(result);
        System.out.println(result.get(n-1));
    }
}
