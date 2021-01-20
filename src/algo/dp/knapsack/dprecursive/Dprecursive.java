package algo.dp.knapsack.dprecursive;

public class Dprecursive {
    private static int[][] Matrix = new int[100][100];
    public int maxpro(int[] wt, int[] pro, int w){
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                Matrix[i][j] = -1;
            }
        }
        int n = wt.length;
        return maxprofit(wt, pro, n, w);
    }
    private int maxprofit(int[] wt, int[] pro, int n, int w){
        if(w == 0 || n == 0) return 0;
        if(Matrix[n][w] != -1) {
            return Matrix[n - 1][w - 1];
        }
        if(wt[n - 1] > w){
            return Matrix[n][w] = maxprofit(wt, pro, n - 1, w);
        }
        else{
            return Matrix[n][w] = Math.max( pro[n - 1] + maxprofit(wt, pro, n - 1, w - wt[n -1]), maxprofit(wt, pro, n - 1, w));
        }

    }
}
