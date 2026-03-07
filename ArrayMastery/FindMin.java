package ArrayMastery;

public class FindMin {

    public static void main(String[] args) {
         int arr[] ={-100 ,-1 ,-56};
         int min = findMin(arr);
         System.out.println(min);
    }
    static int findMin(int[] arr){

        if(arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int ans=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
