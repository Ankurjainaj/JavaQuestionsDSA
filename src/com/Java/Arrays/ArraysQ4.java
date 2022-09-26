package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysQ4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(sorting(arr)));
    }

    //T(n) = O(n)
    static int[] sorting(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
