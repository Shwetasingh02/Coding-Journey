package SearchingandSorting.RotatedBS;

public class findPivot {

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(pivot(arr));
    }

     static int pivot(int[] arr) {

        int start =0, end =arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if(arr[start]>=mid){
                end=mid+1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
