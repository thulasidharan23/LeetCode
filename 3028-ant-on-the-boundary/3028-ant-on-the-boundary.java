class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0,ans=0;
        for(int x:nums){
            ans+=x;
            if(ans==0){
                ++count;
            }
        }
        return count;
    }
}