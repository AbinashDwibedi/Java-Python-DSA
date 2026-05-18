class Solution {
    public int maxProfit(int prices[]) {
        // code here
        // return this.dp(prices,0,0);
        int n = prices.length;
        int[] dpv = new int[2];
        for(int i = n-1;i >= 0;i--){
            for(int j = 0;j<2;j++){
                int doNothing = dpv[j];
                int doSomething = 0;
                if(j == 0){
                    doSomething = dpv[1] - prices[i];
                }
                else{
                    doSomething = dpv[0] + prices[i];
                }
                dpv[j] = Math.max(doNothing,doSomething);
            }
        }
        return dpv[0];
        
    }
}