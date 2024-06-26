class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1],0)+nums[i];
        }
        Arrays.sort(dp);
        return dp[n-1];
    }
}