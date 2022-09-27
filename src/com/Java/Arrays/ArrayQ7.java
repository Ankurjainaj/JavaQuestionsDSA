package com.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ7 {
    //https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(cycle(arr)));
    }

    static int[] cycle(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, i - 1);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
