package algo.sort.Bubble;

import algo.sort.quick.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    void passAll() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr1 = new int[]{1, 3, 2};
        int[] arr2 = new int[]{3, 1, 2};
        int[] arr3 = new int[]{3, 2, 1};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 4, 2, 5, 4, 4, 5};

        bubbleSort.sort(arr1);
        bubbleSort.sort(arr2);
        bubbleSort.sort(arr3);
        bubbleSort.sort(arr4);
        bubbleSort.sort(arr5);

        assertArrayEquals(new int[]{1, 2, 3}, arr1);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);
        assertArrayEquals(new int[]{1, 2, 3}, arr4);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 5, 5}, arr5);
    }
}
