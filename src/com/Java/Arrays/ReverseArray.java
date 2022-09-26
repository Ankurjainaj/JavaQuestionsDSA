package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] arr) {
        if (arr.length == 1 || arr.length == 0)
            return arr;
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

}
