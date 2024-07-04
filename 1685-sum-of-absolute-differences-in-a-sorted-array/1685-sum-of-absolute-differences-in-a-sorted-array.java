class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int n=nums.length;
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs((right[i]-(nums[i]*(n-i-1)))-(left[i]-(nums[i]*i)));
        }
        return ans;
    }
}