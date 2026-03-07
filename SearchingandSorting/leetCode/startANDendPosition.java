package SearchingandSorting.leetCode;

import java.util.Arrays;

public class startANDendPosition {

    public static void main(String[] args) {

        int[] arr = {1};
        int target = 0;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[] arr, int target) {

        int[] ans = {-1, -1};
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                int left = mid;
                int right = mid;

                while (left - 1 >= 0 && arr[left - 1] == target) {
                    left--;
                }
                while (right + 1 < arr.length && arr[right + 1] == target) {
                    right++;
                }
                return new int[]{left, right};
            }
        }
        return ans;
    }
}
