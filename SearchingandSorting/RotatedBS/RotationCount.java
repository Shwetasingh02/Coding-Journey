package SearchingandSorting.RotatedBS;

public class RotationCount {

    public static void main(String[] args) {

        int [] arr ={4,5,6,7,0,1,2};
        int target =0;

        int result = findPivot(arr ,target);
        System.out.println( "Number of times array rotate : " + (result+1));
    }

    public static int findPivot(int [] arr ,int target){
        int start=0 ,end =arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(arr[mid]<arr[mid-1]) {
                return mid - 1;
            }
            if(start>arr[mid]){
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return -1;
    }
}
