package SearchingandSorting.Binary;

public class floorNumber {
    public static void main(String[] args) {
        int [] arr={2,4,5,8,12,16,23,38};
        int n= 37;
        int result =BinarySearch(arr,n);

        System.out.println("Element is present at "
                + "index " + result);

    }

    private static int BinarySearch(int[] arr, int n) {

        int low = 0, high = arr.length - 1;
        while (low <= high) {

            int mid = (low+high)/2;

            if(arr[mid]==n)
                return arr[mid];

            if(arr[mid]<n)
                low=mid+1;

            else
                high=mid-1;
        }

        return arr[high];
}
}
