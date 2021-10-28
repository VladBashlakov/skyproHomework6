package ru.skypro;

import java.util.Arrays;

public class Task5 {


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5};
        printReverseArray(arr);
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int x = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = x;
        }
    }

    public static void printReverseArray(int[] arr) {
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
