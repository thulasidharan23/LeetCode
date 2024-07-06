class Solution {
    public int minOperations(int[] nums) {
        int zero=-1;
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    nums[j]^=1;
                }
                count++;
            }
        }
        if(nums[n-1]==0||nums[n-2]==0){
            return zero;
        }
        return count;
    }
}