package org.example;
public class ArrayAdd {

    public static int sumArrayElements(int[] arr) {
        int sum = 0;
        for (int j : arr) sum += j;
        return sum;
    }
}
