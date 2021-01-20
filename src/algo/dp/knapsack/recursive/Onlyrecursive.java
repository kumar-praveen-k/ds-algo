package algo.dp.knapsack.recursive;

public class Onlyrecursive {
    public int maxpro(int[] wt, int[] pro, int w){
        int n = wt.length;
        return maxProfit(wt, pro, n, w);
    }
    private int maxProfit(int[] wt, int[] pro, int n, int w){
        if(w == 0 || n == 0) return 0;
        if(wt[n - 1] > w){
            return maxProfit(wt, pro, n - 1, w);
        }else{
            return Math.max( pro[n - 1] + maxProfit(wt, pro, n - 1, w - wt[n -1]), maxProfit(wt, pro, n - 1, w));
        }
    }
}
