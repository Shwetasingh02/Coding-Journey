package ArrayMastery.StriverProblem;

public class RoatebyKtimes {

    public static void main(String[] args) {

        int nums [] ={1,2,3,4,5,6,7};
        int k=3;
        String left ="left";
        String Right ="right";

        leftRotate(nums ,k, left);
        rightRotate(nums ,k , Right);
    }

    private static void leftRotate(int[] nums, int k, String left) {
        int result [] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            result[i] =nums[(i+k)%n];
        }
        System.out.println("Left Rotate");
        for(int j : result){

            System.out.print(j + " ");
        }
System.out.println();
    }

    private static void rightRotate(int[] nums, int k , String Right) {

        int result [] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            result[(i+k)%n]=nums[i];
        }
        System.out.println("Right Rotate");
        for(int j : result){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
