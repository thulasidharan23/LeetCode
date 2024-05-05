class Solution {
    int ans=Integer.MAX_VALUE;
    public int getMinDistance(int[] nums, int target, int start) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int val=Math.abs(i-start);
                 ans=Math.min(ans,val);
            }
        }
        return ans;
    }
}