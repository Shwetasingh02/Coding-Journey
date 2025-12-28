package ArrayMastery;

public class LinearSearchinRange {

    public static void main(String[] args) {

        int arr[]={12,5,6,3,9,78};
        int target = 78;

        int ans = linearsearch(arr, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return 0;
        }
// for getting the index of the target value
        for(int index =1; index <=4 ;index++){
            if(arr[index] == target){
                return index;
            }
// for getting the element of the target value
//            for(int element : arr){
//                if(element == target){
//                    return element;
//                }
//            }
        }
        return -1;
    }
}
