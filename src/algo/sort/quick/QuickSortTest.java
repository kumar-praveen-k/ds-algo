package algo.sort.quick;

import algo.sort.quick.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    void passAll() {
        QuickSort quickSort = new QuickSort();

        int[] arr1 = new int[]{1, 3, 2};
        int[] arr2 = new int[]{3, 1, 2};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 4, 2, 5, 4, 4, 5};

        quickSort.sort(arr1);
        quickSort.sort(arr2);
        quickSort.sort(arr3);
        quickSort.sort(arr4);
        quickSort.sort(arr5);

        assertArrayEquals(new int[]{1, 2, 3}, arr1);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);
        assertArrayEquals(new int[]{1, 2, 3}, arr4);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 5, 5}, arr5);
    }
}
