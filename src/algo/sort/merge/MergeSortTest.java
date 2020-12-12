package algo.sort.merge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void passAll() {
        MergeSort mergeSort = new MergeSort();

        int[] arr1 = new int[]{1, 3, 2};
        int[] arr2 = new int[]{3, 1, 2};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 4, 2, 5, 4, 4, 5};

        mergeSort.sort(arr1);
        mergeSort.sort(arr2);
        mergeSort.sort(arr3);
        mergeSort.sort(arr4);
        mergeSort.sort(arr5);

        assertArrayEquals(new int[]{1, 2, 3}, arr1);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);
        assertArrayEquals(new int[]{1, 2, 3}, arr4);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 5, 5}, arr5);
    }
}