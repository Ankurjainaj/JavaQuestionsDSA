package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        if (k > n)
            System.out.println("Bad value of k");
        System.out.println(Arrays.toString(maxMin(arr, k)));
    }

    static int[] maxMin(int[] arr, int k) {
        Arrays.sort(arr);
        return new int[]{arr[arr.length - k], arr[k - 1]};
    }

}
