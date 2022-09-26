package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(maxMin(arr)));
    }

    static int[] maxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (arr.length == 1)
            return new int[]{arr[0], arr[0]};
        for (int j : arr) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        return new int[]{max, min};
    }
}
