package ArrayMastery.StriverProblem;

import java.util.Scanner;

public class RoatebyKtimes {

    public static void main(String[] args) {

        int nums [] ={1,2,3,4,5,6,7};
        int k=3;
//        String left ="left";
//        String Right ="right";

        Scanner sc = new Scanner(System.in);
        System.out.print("Give your Rotate Type :");
        String RotateType= sc.next();

            rotate(nums, k, RotateType);

//        rightRotate(nums ,k , Right);
    }

    private static void rotate(int[] nums, int k, String f) {
        int result [] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(f.equalsIgnoreCase("left")) {
                 result[i] = nums[(i + k) % n];

            }else{
                result[(i+k)%n]=nums[i];
            }
        }
        System.out.println("Rotated Array");
        for(int j : result){

            System.out.print(j + " ");
        }
System.out.println();
    }

//    private static void rightRotate(int[] nums, int k , String Right) {
//
//        int result [] = new int[nums.length];
//        int n = nums.length;
//        for(int i=0;i<nums.length;i++){
//            result[(i+k)%n]=nums[i];
//        }
//        System.out.println("Right Rotate");
//        for(int j : result){
//            System.out.print(j + " ");
//        }
//        System.out.println();
//    }
}
