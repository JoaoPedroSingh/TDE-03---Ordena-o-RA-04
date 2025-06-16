package sort;

import util.Metrics;

public class GnomeSort {
    public static void sort(int[] arr, Metrics m) {
        int index = 0;
        while (index < arr.length) {
            m.iterations++;
            if (index == 0 || arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                m.swaps++;
                index--;
            }
        }
    }
}
