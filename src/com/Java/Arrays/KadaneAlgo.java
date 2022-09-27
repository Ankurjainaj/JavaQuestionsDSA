package com.Java.Arrays;

import java.util.Scanner;

public class KadaneAlgo {
    //Same as Question 8 in the list
    //Maximum continuous sub Array sum
    //https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxSubArraySum(arr, arr.length));
    }

    static long maxSubArraySum(int[] arr, int n) {
        long max = Integer.MIN_VALUE;
        long current = 0;
        for (int i = 0; i < n; i++) {
            current += arr[i];
            max = Math.max(current, max);
            if (current < 0)
                current = 0;
        }
        return max;
    }
}
