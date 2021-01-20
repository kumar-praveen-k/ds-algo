package algo.sort.selection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {
    @Test
    void passAll() {
        SelectionSort selectionSort = new SelectionSort();

        int[] arr1 = new int[]{1, 3, 2};
        int[] arr2 = new int[]{3, 1, 2};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 4, 2, 5, 4, 4, 5};

        selectionSort.sort(arr1);
        selectionSort.sort(arr2);
        selectionSort.sort(arr3);
        selectionSort.sort(arr4);
        selectionSort.sort(arr5);

        assertArrayEquals(new int[]{1, 2, 3}, arr1);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);
        assertArrayEquals(new int[]{1, 2, 3}, arr4);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 5, 5}, arr5);
    }
}
