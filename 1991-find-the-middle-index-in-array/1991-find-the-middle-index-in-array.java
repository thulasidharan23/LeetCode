class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(ans!=sum){
                sum-=nums[i];
            }
            else{
                return i;
            }
        }
        return -1;
    }
}