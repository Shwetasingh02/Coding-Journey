package ArrayMastery.Leetcode;

import java.util.HashSet;

public class containsDuplicate217 {

    public static void main(String[] arg){

        int num[]={1,2,3,1};

        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.print("Duplicate");
                    return;
                }
            }
        }
        System.out.print("Not Duplicate");
//        HashSet<Integer>set = new HashSet<>();
//
//        for(int number :num){
//            if(set.contains(number)){
//                System.out.print("Duplicate");
//                return;
//            }else{
//                set.add(number);
//            }
//        }
//        System.out.println("Not Duplicate");

    }
}
