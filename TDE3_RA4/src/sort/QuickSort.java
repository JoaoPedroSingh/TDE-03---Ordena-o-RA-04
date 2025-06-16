package sort;

import util.Metrics;

public class QuickSort {
    public static void sort(int[] arr, Metrics m) {
        quickSort(arr, 0, arr.length - 1, m);
    }

    private static void quickSort(int[] arr, int low, int high, Metrics m) {
        if (low < high) {
            int pi = partition(arr, low, high, m);
            quickSort(arr, low, pi - 1, m);
            quickSort(arr, pi + 1, high, m);
        }
    }

    private static int partition(int[] arr, int low, int high, Metrics m) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            m.iterations++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                m.swaps++;
            }
        }
        swap(arr, i + 1, high);
        m.swaps++;
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
