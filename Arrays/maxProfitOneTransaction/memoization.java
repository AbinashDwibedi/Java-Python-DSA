import java.util.Arrays;
class Solution {
    private int[][] dp;
    public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        this.dp = new int[n][3];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return this.dpv(prices, 0,0);
    }
    private int dpv(int[] prices,int idx, int bs){
        if(bs == 2 || idx == prices.length) return 0;
        if(dp[idx][bs] != -1) return dp[idx][bs];
        int notConsider = this.dpv(prices, idx+1,bs);
        int consider = 0;
        if(bs == 0){
            consider = this.dpv(prices, idx+1, 1) - prices[idx];
        }
        else{
            consider = this.dpv(prices, idx+1, 2) + prices[idx];
        }
        dp[idx][bs] = Math.max(consider,notConsider);
        return dp[idx][bs]>=0 ? dp[idx][bs] : -1;
    }
}