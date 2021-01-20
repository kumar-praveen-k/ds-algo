package algo.dp.knapsack.dppure;

import algo.dp.knapsack.dprecursive.Dprecursive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuredynamicTest {
    @Test
    void passAll() {
        Puredynamic o = new Puredynamic();
        int profit = o.maxpro(new int[]{1, 3, 2}, new int[]{1, 3, 2}, 5);
        assertEquals(5, profit);

        profit = o.maxpro(new int[]{1, 1, 1}, new int[]{1, 3, 2}, 2);
        assertEquals(5, profit);

        profit = o.maxpro(new int[]{1, 3, 4, 2}, new int[]{4, 2, 2, 5}, 5);
        assertEquals(9, profit);

        profit = o.maxpro(new int[]{10, 20, 30}, new int[]{60, 100, 120}, 50);
        assertEquals(220, profit);
    }
}
