package ArrayMastery.StriverProblem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CountMaximumConsecutiveOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you array length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = count(arr);
        System.out.println(result);
    }

    static int countOne(int[] arr) {

        int count = 0;
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            list.add(count);
        }
        int result = (int) Collections.max(list);
        return result;
    }

    static int count(int arr[]) {
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
                if (ans < temp) {
                    ans = temp;
                }
            } else {
                temp = 0;
            }
        }
        return ans;
    }
}