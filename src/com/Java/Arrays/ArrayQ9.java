package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ9 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(getMinDiff(arr, n, k));
    }

    //https://practice.geeksforgeeks.org/problems/minimize-the-heights-i/1
    //The height of the towers can be negative
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int mini, maxi;
        int ans = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            maxi = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            mini = Math.min(arr[0] + k, arr[i] - k);
            ans = Math.min(ans, maxi - mini);
        }
        return ans;
    }

    //https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
    //The height of the towers can't be negative
    static int getMinDiff2(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int mini, maxi;
        int ans = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < k)
                continue;
            maxi = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            mini = Math.min(arr[0] + k, arr[i] - k);
            ans = Math.min(ans, maxi - mini);
        }
        return ans;
    }
}
