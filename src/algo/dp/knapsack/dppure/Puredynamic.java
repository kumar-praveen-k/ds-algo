package algo.dp.knapsack.dppure;

public class Puredynamic {
    private static int[][] Matrix = new int[100][100];
    public int maxpro(int[] wt, int[] pro, int w){
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(i == 0 || j == 0) Matrix[i][j] = 0;
            }
        }
        int n = wt.length;
        return maxprofit(wt, pro, n, w);
    }
    private int maxprofit(int[] wt, int[] pro, int n, int w){
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < w+1; j++){
                if(i == 0 || j == 0){
                    Matrix[i][j] = 0;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] > j) {
                    Matrix[i][j] = maxprofit(wt, pro, i - 1, j);
                } else {
                    Matrix[n][w] = Math.max(pro[i - 1] + maxprofit(wt, pro, i - 1, j - wt[i - 1]), maxprofit(wt, pro, i - 1, j));
                }
            }
        }
        return Matrix[n][w];
    }
}
