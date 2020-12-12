package algo.sort.merge;

import org.junit.jupiter.api.Test;

public class MergeSort {
    public void sort(int[] arr) {
        int n = arr.length;
        _sort(arr, 0, n - 1);
    }

    private void _sort(int[] arr, int left, int right) {
        int mid = 0;
        mid = (left + right) / 2;
        if (left == right) return;

        _sort(arr, 0, mid);
        _sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for (int i = 0; i < n1; i++) a1[i] = arr[left + i];

        for (int j = 0; j < n2; j++) a2[j] = arr[mid + j + 1];

        int[] nums = new int[right - left + 1];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                nums[k] = a1[i];
                i++;
            } else {
                nums[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = a1[i];
            k++;
            i++;
        }

        while (j < n2) {
            nums[k] = a2[j];
            j++;
            k++;
        }

        for (i = 0; i < right - left + 1; i++) arr[left + i] = nums[i];
    }
}
