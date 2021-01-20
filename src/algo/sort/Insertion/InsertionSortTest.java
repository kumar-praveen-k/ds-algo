package algo.sort.Insertion;

import algo.sort.quick.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    void passAll() {
        QuickSort insertionSort = new QuickSort();

        int[] arr1 = new int[]{1, 3, 2};
        int[] arr2 = new int[]{3, 1, 2};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 4, 2, 5, 4, 4, 5};

        insertionSort.sort(arr1);
        insertionSort.sort(arr2);
        insertionSort.sort(arr3);
        insertionSort.sort(arr4);
        insertionSort.sort(arr5);

        assertArrayEquals(new int[]{1, 2, 3}, arr1);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);
        assertArrayEquals(new int[]{1, 2, 3}, arr4);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 5, 5}, arr5);
    }
}
