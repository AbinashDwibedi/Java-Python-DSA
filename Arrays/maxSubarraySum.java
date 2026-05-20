class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int val:arr){
            currSum += val;
            maxSum = Math.max(maxSum,currSum);
            if(currSum <0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
