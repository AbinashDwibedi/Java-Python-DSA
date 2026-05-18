import java.util.Arrays;
class Solution {
    private int[][] dp;
    public int maxProfit(int prices[]) {
        // code here
        int n = prices.length;
        this.dp = new int[n][2];
        for(int i = 0; i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return this.dpv(prices,0,0);
        
    }
    int dpv(int prices[],int idx,int bs){
        if(idx == prices.length) return 0;
        if(this.dp[idx][bs] != -1) return this.dp[idx][bs];
        int doNothing = this.dpv(prices, idx+1, bs);
        int doSomething = 0;
        if(bs == 0) {
            doSomething = this.dpv(prices, idx+1, 1) -prices[idx];
        }
        else{
            doSomething = this.dpv(prices, idx+1,0) + prices[idx];
        }
        this.dp[idx][bs] = Math.max(doNothing,doSomething);
        return this.dp[idx][bs];
    }
    
}