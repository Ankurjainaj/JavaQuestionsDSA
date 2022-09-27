package com.Java.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayQ6 {

    //https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println(union(arr, arr2));
    }

    static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr1) set.add(j);
        for (int i : arr2) set.add(i);
        return set.size();
    }

}
