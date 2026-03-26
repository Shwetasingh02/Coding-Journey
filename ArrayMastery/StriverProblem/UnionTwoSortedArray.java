package ArrayMastery.StriverProblem;

import java.util.*;

public class UnionTwoSortedArray {

    public static void main(String[] args) {

        int [] arr1 ={1,1,2,4,5};
        int [] arr2 ={2,3,4,5,6};

       Set<Integer> set = new TreeSet<>();

       for(int j:arr1)
           set.add(j);

       for(int k: arr2)
           set.add(k);

       System.out.print(set);
    }
}
