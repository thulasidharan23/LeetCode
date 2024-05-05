class Solution {
    public int maximumDifference(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    ans=Math.max(ans,nums[j]-nums[i]);
                }
            }
        }
        if(ans!=0){
            return ans;
        }
        return -1;
    }
}